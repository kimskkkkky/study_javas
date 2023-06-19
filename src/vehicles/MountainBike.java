package vehicles;

public class MountainBike extends Bicycle {
    int seatHight;
    public MountainBike(){

    }
    public MountainBike(int price, String color, int seatHight){
        this.seatHight = seatHight; // 재정의 안되어 있을 땐 this 써도 됨
        super.price = price; //내가 내부적으로 내 조상에 있는 변수나 메소드 사용할 때 쓰임
        super.color = color;
    }  
     public String toString(){
        String str = "price : " + super.price + ", color : " + super.color 
        + ", seatHight : " + this.seatHight;
        return str;
        
    }
}