package Part5.DatingApp;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        day++;
        switch (month) {
            case 2 -> {
                if(year % 4 == 0 && day > 29 || year % 4 != 0 &&  day > 28){
                    day = 1;
                    month++;
                }
            }
            case 4, 6, 9, 11 -> {
                if(day > 30) {
                    day = 1;
                    month++;
                }
            }
            default -> {
                if(day > 31) {
                    day = 1;
                    month++;
                }
            }
        }
        if(month > 12) {
            month = 1;
            year++;
        }
    }

    public void advance(int numberOfDays) {
        for(int i = 0; i < numberOfDays; i++) advance();
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
    }
}
