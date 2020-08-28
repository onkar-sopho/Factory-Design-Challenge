public class Client {
    public static void main(String[] args) throws Exception {

        // Creating an instance of Tiger by calling the AnimalFactory and passing "tiger"
        AnimalFactory animalFactory = new AnimalFactory();
        Animal tiger = animalFactory.getAnimalType("tiger");
        // Calling the tiger specific methods
        tiger.eat();
        tiger.walk();


        // Creating an instance of Duck by calling the AnimalFactory and passing "duck"
        Animal duck = animalFactory.getAnimalType("duck");
        // Calling duck specific methods
        duck.eat();
        duck.walk();

        // Creating an instance of Lion, which is not defined - this should throw an exception
        Animal lion = animalFactory.getAnimalType("lion");
        lion.eat();
    }
}
