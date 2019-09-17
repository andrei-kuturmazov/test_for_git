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
                Thread.sleep(5);
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
        for (int i = 0; i <100; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main () {
        long before = System.currentTimeMillis();

        work();

        long after = System.currentTimeMillis();
        System.out.println("Time spent " + (after-before) + " ms");

        System.out.println(list1);
        System.out.println(list2);

    }
}