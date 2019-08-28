public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(20));
    }

    public static long factorial (long a) {
            if (a == 1) {
                return 1;
            }
            return a * factorial(a - 1);

    }
}
