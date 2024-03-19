package study.tddexam;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //plus 테스트
        int result = cal.plus(10, 20);
        System.out.println(result);
        //minus 테스트
        int result2 = cal.minus(10, 20);
        System.out.println(result2);
    }
}
