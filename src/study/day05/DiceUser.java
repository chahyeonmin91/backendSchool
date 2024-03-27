package study.day05;

public class DiceUser {
    //주사위를 n번 굴려서 나오는 눈이 x인 횟수
    public static int diceGame(Dice2 dice,int totalCount,int eye){
        int count=0;
        for(int i=0;i<totalCount;i++){
            dice.roll();
            if(dice.eye==eye){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Dice2 dice= new Dice2();

        dice.roll();
        System.out.println(dice.eye);
        int totalCount=100;
        int eye=3;
        int count=diceGame(dice,totalCount,eye);
        System.out.println("주사위를 "+totalCount+"번 던져서 "+eye+"이/가 "+count+"번 나왔습니다.");
    }
}