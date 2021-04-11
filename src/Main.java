public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Schnauzer", 5, 25, 2, 4, 0,20, "Short");

        dog.eat();
        System.out.println();
        dog.walk();
        System.out.println();
        dog.run();
    }
}
