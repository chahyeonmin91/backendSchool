package study.day05;

public class MathBeanRun {
    public static void main(String[] args) {
        MathBean mathbean = new MathBean();
        mathbean.printNumber(19);
        mathbean.printClassName();
        int result1 = mathbean.plus(4,6);
        int result2 = mathbean.getOne();

        System.out.println(result1);
        System.out.println(result2);

    }
}
