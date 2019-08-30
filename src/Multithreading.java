public class Multithreading {
    public static void main(String[] args) throws InterruptedException {

        //Thread.sleep(1000);
        MyThread firstThread = new MyThread();
        MyThread secondThread = new MyThread();
        firstThread.start();
        secondThread.start();

        Thread runner = new Thread(new ThreadRunner());
        runner.start();
       }

    }


class ThreadRunner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++)
            System.out.println("Hello everyone from this class " + i);
    }
}



class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i =0; i < 1000; i++ ) {
            System.out.println("Hello world from thread, integer value is " + i);
        }
    }
}
