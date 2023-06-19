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
        String str = " Modelname : " + this.Modelname + ", color : " + super.color  + ", price : " + super.price ;
        return str;
    }
}
