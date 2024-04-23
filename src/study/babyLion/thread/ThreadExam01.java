package study.babyLion.thread;

public class ThreadExam01 {
    public static void main(String[] args) {
        System.out.println("main 시작!");
        MyThread myThread = new MyThread();
        myThread.start();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("main end");

    }
}
//1.Thread를 상속
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("스레드에서 하고자하는 일 구현");
    }
}