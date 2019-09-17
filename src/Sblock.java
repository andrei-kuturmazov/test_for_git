import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sblock {
    public static void main(String[] args) {
    new Worker().main();
    }
}


class Worker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addToList1() {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }


    public void addToList2() {
        try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }


    public void work () {
        for (int i = 0; i <1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main () {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long after = System.currentTimeMillis();
        System.out.println("Time spent " + (after-before) + " ms");

        System.out.println("List size is " + list1.size());
        System.out.println("List size is " + list2.size());

    }
}