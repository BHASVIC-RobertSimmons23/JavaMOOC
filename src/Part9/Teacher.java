package Part9;

public class Teacher extends Person {
    private double salary;
    public Teacher(String name, String address, double salary) {
        super(name, address);
        this.salary  = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary + " euros/month";
    }
}
