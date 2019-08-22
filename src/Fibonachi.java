public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi(10));
    }
    public static int fibonachi(int a) {
        if ( a == 0) {
            return 0;
        }
        return a + fibonachi(a -1);
    }
}
