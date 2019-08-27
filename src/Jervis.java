public class Jervis {
    public static void main(String[] args) {
        Jervis jervis = new Jervis();
        jervis.sayHello("Alexander", "Vladimir", "Stepan");
    }
    public void sayHello(String ...names) {
        for (String name : names) {
            System.out.println("Hello, " + name + " how are you today?");
        }
    }

}
