package study.day05;

public class DiceRandom {
    public static void main(String[] args) {
        Dice dice = new Dice(6);

        dice.roll();
        System.out.println(dice.getEye());
    }
    }

