public class AnimalFactory implements AnimalFactoryInterface{

    @Override
    public Animal getAnimalType(String animalType) throws Exception {
        switch (animalType) {
            case "Tiger":
            case "tiger":
            case "TIGER":
                return new Tiger();
            case "Duck":
            case "duck":
            case "DUCK":
                return new Duck();
            default:
                throw new Exception("Animal type: " + animalType + " cannot be instantiated");
        }
    }
}
