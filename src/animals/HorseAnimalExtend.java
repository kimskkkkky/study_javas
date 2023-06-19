package animals;

public class HorseAnimalExtend extends HorseAnimalImpl {
    
    public String toString(){
         String str = " legs : " + this.setLegs + ", arms : " + this.setArms + ", setEnableSpeech : "
                + this.setEnableSpeech;
        return str;
    }

    public String getSpeed(){
        HorseAnimalImpl horseAnimalImpl = new HorseAnimalImpl();
        String spd = "speed : " + horseAnimalImpl.speed + "km";
        return spd;

    }

}
