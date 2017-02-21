public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world.");

        Animal ani = new Animal();
        ani.name = "HAHA";
        ani.color = "red";
        ani.sleep();

        Dog aDog = new Dog();
        aDog.name = "dog";
        aDog.bark();

        Dog bDog = new Dog();
        bDog.name = "B";
        bDog.bark();

        (new Dog()).name = "asdf";
        (new Dog()).bark();
    }
}
