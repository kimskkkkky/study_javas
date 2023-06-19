import java.util.HashMap;
import java.util.Map;

import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
import vehicles.Vehicle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // Object 확인
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            //상속할 class생성
            // Bicycle bicycle = new Bicycle(5500, "blue");
            // System.out.println(bicycle.toString());

            //상솔 활용
            // MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200, "blue", 5);
            
            // RoadCycle roadCycle = new RoadCycle(55000, "white", "Px200");
            // System.out.println(roadCycle.toString());
            
            //구현하고 호출하기
            // Car car = new Car();
            // car.speedUp(1);
            // car.speedDown(2);

            // Vehicle bike = new Bike(); //왼쪽 껍데기 오른쪽에 덮어쓰기 인터페이스인 경우 like 구현
            // Vehicle car_second = new Car();
            

            // Map<String, String> hashMap = new HashMap<>();
            // 추상화 확인
            Scooter scooter = new Scooter();
            System.out.println();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}