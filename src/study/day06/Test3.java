package study.day06;

public class Test3 {
    public static void main(String[] args) {
        Object obj = new Child();

        if (obj instanceof Child) {
            System.out.println("instance of child");
        }
        if (obj instanceof Parent) {
            System.out.println("instance of parent ");
        }
        if (obj instanceof Object) {
            System.out.println("instance of object");
        }

    }
}
