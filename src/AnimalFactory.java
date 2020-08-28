public class AnimalFactory {
    public static Animal getAnimalType(String animalType) {
        if(animalType == null)
            return null;
        else if(animalType.equalsIgnoreCase("tiger"))
            return new Tiger();
        else if(animalType.equalsIgnoreCase("duck"))
            return new Duck();
        return null;
    }
}
