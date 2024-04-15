package study.babyLion;

public class Student {
    private String name;
    private int age;
    private String studentId;

    //getter, setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Student(String name, String studentId, int age) {
        this.studentId = studentId;
        this.name =name;
        this.age =age;
    }

    public void printStudentInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("studentId = " + studentId);
    }

    public void 공부하다() {
        System.out.println(name+"는 공부중");
    }

    public void 공부하다(String sub) {
        System.out.println(name+ "는" + sub+"공부중!");
    }

}
