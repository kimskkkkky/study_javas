package animals;

public class HorseAnimalImpl implements InterfaceAnimal {

    int speed = 0;
    int setLegs = 4;
    int setArms = 0;
    int increment = 12;
    String setEnableSpeech = "NO";

    @Override
    public int setLegs(int val) {
        return this.setLegs;
    }

    @Override
    public int setArms(int val) {
        return this.setArms;
    }

    @Override
    public String setEnableSpeech(int val) {
        return this.setEnableSpeech;
    }

    @Override
    public int speed(int val) {
        this.speed = this.speed + this.increment;
        return this.speed;
    }

}
