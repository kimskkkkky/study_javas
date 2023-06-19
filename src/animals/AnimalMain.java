package animals;


public class AnimalMain {
    public static void main(String[] args) {
        HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();
        System.out.println(humanAnimalExtend.toString());
        System.out.println(humanAnimalExtend.getSpeed());
        HorseAnimalExtend horseAnimalExtend = new HorseAnimalExtend();
        System.out.println(horseAnimalExtend.toString());
        System.out.println(horseAnimalExtend.getSpeed());
   
    }
    
}
