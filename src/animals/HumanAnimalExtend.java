package animals;

public class HumanAnimalExtend extends HumanAnimalImpl {
    public String toString() {
        String str = " legs : " + this.setLegs + ", arms : " + this.setArms + ", setEnableSpeech : "
                + this.setEnableSpeech;
        return str;
    }

    public String getSpeed() {
        HumanAnimalImpl humanAnimalImpl = new HumanAnimalImpl();
        this.speed = humanAnimalImpl.speed(3);
        String spd = "speed : " + this.speed + "km";
        return spd;

    }
}
