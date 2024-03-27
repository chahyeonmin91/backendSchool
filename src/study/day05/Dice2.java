package study.day05;

public class Dice2 {
    //속성 - 주사위 면을 나타내는 face - 던졌을 때 눈을 나타내는 eye
    public int face=6;
    public int eye;

    //생성자 - 객체가 처음 생성될 때 초기화 할 수있는 메서드
    //접근제어자 메소드명(클래스명과동일) (매개변수들) {초기화 구현}
    public Dice2(int face){
        this.face=face;
        System.out.println("dice 생성자 실행!!");
    }
    public Dice2(){
        System.out.println("dice 디폴트 생성자 실행!!");
    } //디폴트 생성자


    //행위(메서드) - 주사위를 굴리다.
    public void roll(){
        eye= (int)(Math.random()*face) + 1;
    }


}
