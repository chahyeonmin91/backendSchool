package study.day13;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println();
    }
}
public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("main출발");
        Thread thread =  new Thread(new MyRunnable());
        for(int i = 0; i<10; i++){
            System.out.println("main 안녕");
        }
        System.out.println("main종료");
    }
}

