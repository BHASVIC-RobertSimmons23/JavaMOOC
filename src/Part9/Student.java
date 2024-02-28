package Part9;

public class Student extends Person {
    private int studyCredits = 0;
    public Student(String name, String address) {
        super(name, address);
    }

    public int credits() {
        return studyCredits;
    }

    public void study() {
        studyCredits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudy credits: " + studyCredits;
    }
}
