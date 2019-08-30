public class Multithreading {
    public static void main(String[] args) {


        MyThread firstThread = new MyThread();
        firstThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world from class main");

        }

    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i =0; i < 50; i++ ) {
            System.out.println("Hello world from thread");
        }
    }
}
