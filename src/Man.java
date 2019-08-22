public class Man extends Person implements Swimmable {

    public Man(int age, String name, int home){
        super(age,name,home);

    }

    @Override
    public void swim() {
        System.out.println("I can swim fast");
    }

    @Override
    public String toString() {
        return "My name is " + this.getName() + " мне " + this.getAge() + " лет, я переехал сюда " + this.getHome() + " лет назад";
    }
}
