package study.babyLion;

public class Mammal extends Animal{
    private String habitat;

    public Mammal(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    @Override
    public void makeSound() {
        System.out.println(name +"가 우는 소리를 냅니다");
    }

    public void printHabitat() {
        System.out.println(name+"habitat = " + habitat);
    }

}
