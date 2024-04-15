package study.babyLion;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("민차현", "35251", 22);
        student.printStudentInfo();

        student.공부하다();

        student.공부하다("java");
    }

}
