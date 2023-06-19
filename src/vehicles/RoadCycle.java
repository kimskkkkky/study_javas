package vehicles;

import java.util.HashMap;

public class RoadCycle extends Bicycle {
    String Modelname = "";
    HashMap<String, Object> spec;
    public RoadCycle(int price, String color, String Modelname){
        this.price = price;
        this.color = color;
        this.Modelname = Modelname;
    }
    public String toString(){
        String str = "price : " + super.price + ", color : " + super.color 
        + ", Modelname : " + this.Modelname;
        return str;
    }
}
