public class Duck implements Animal {
    @Override
    public void eat() {
        System.out.println("Duck is eating ... quack! quack!");
    }

    @Override
    public void walk() {
        System.out.println("Duck is floating on water... quack! quack!");
    }
}
