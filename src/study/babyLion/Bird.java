package study.babyLion;

public class Bird extends Animal{
    private boolean canFly;
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void printCanFly() {
        if (canFly) {
            System.out.println(name+"날 수 없음");

        } else {
            System.out.println(name+"날 수 업쇼음");
        }
    }

    public void makeSound() {
        System.out.println(name+"이 소리를 냅니다");
    }
}
