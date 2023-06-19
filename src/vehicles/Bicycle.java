package vehicles;

import java.util.HashMap;

public class Bicycle { //생성자는 클래스이름과 같다. 리턴값이 없다.
    int price;
    String color;
    HashMap<String, Object> spec;
    public Bicycle(){
        System.out.println();
    }
    public Bicycle(int price, String color){ //인스턴스화 할 때 쓰는 메소드
        this.price = price;//변수이름만 같지 다름 왼쪽 this 클래스 안에 있는거 가져옴 오른쪽 파라미터로 넘어온 변수
        this.color = color;//왼쪽은 위에 변수 오쪽은 파라미터로 받아온값 this 연결해줌 this는 이 메소드 안에서만 씀
    }
    public String toString(){
        String str = "price : " + this.price + ", color : " + this.color;
        return str;//메소드 만드는 단계
    }   
}