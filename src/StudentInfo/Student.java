package StudentInfo;

public class Student extends Person {
    private int schoolNumber;

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Student(int schoolNumber, String name, int age) {
        super(name,age);
        this.schoolNumber = schoolNumber;

    }

    public static void main(String[] args) {
        Student student = new Student(66,"Büşra",25);
        System.out.println("Student name: " +student.name);
        System.out.println("Student age: " +student.age);
        System.out.println("Student school number: " +student.schoolNumber);
    }
}
