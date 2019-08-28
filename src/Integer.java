public class Integer {
    private int i;
    public Integer(int i) {
    }
    @Override
    public String toString() {
        return this.i;
    }

    public static void main(String[] args) {
        Integer x = new Integer(3);
        Integer y = new Integer(5);
        System.out.println(x);
    }
}
