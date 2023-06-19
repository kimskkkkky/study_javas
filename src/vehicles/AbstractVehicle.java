package vehicles;

abstract class AbstractVehicle { //abstract 박쥐같은새끼 
    int speed ;
    int increment = 5;
    public int speedUp(int val);
    public int speedDown(int val){
        this.speed = this.speed - this.increment;
        return this.speed;
    }
        
}
