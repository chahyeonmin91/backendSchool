package study.babyLion;

public class Animal {
    public String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println(name +" sound ");
    }
    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}


