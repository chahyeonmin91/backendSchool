package study.day04;

public class Calculator {
    //접근 제한자 리턴ㅌ타입 메소드명
    //메소드 오버로딩
    public int plus(int i, int j) {
        return i + j;
    }

    public int plus(int i, int j, int x) {
        return i + j + x;
    }

    public int plus(int... vals) {
        int sum = 0;
        for (int i : vals) {
            sum += i;
        }
        return sum;
    }
}
