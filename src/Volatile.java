import java.util.Scanner;

import static java.lang.Thread.*;

public class Volatile {
    public static void main(String[] args) {
        VolatileTest test = new VolatileTest();
        test.start();

        Scanner s = new Scanner(System.in);
        s.nextLine();

        test.shutdown();
    }

}


class VolatileTest extends Thread {
    private volatile boolean running = true;


    public void run() {
        while (running)
            System.out.println("Hello world here");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        this.running = false;

    }
}