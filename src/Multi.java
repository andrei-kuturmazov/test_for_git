public class Multi {

    private int counter;

    public static void main(String[] args) throws InterruptedException {

        Multi multi = new Multi();
        multi.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++ )
                    counter++;
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i < 10000; i++)
                    counter++;
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();


        System.out.println(counter);
    }

}