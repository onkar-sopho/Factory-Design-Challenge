public class Client {
    public static void main(String[] args) {

        // Creating an instance of Tiger by calling the AnimalFactory and passing "tiger"
        Animal tiger = AnimalFactory.getAnimalType("TIGER");
        // Calling the tiger specific methods
        tiger.eat();
        tiger.walk();


        // Creating an instance of Duck by calling the AnimalFactory and passing "duck"
        Animal duck = AnimalFactory.getAnimalType("DUCk");
        // Calling duck specific methods
        duck.eat();
        duck.walk();
    }
}
