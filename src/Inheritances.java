import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;

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
            MountainBike mountainBike = new MountainBike(6200, "blue", 5);

            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}