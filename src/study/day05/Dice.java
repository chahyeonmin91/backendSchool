package study.day05;

import java.util.Random;

public class Dice {
    Random random = new Random();
    public int face;
    public int eye;

    public Dice(int face) {
        this.face =face;
    }
    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public void roll(){
        setEye(random.nextInt(face) + 1);
    }
}
