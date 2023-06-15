import java.util.ArrayList;
import java.util.HashMap;
public class LoofForEach {
    public static void main(String[] args) {
    
            // for (type variableName : arrayName) {
            //     // code block to be executed  안에 들어올수있는거 array만 들어올 수 있음
            //   } // size만큼 돌아감 
            // arrayName 뭉치 넣어줌
            // variableName : for문돌때
        try {
            ArrayList<String> cars = new ArrayList<String>(); //제너릭 기술 <String> 맞춰줘
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("BENZ");
            cars.add("Ford");
            cars.add("AUDI");

            for(String car :cars){
                System.out.println(car);
            }
              // Automobile Company   Vehicle Names 
              // 1. 해쉬맵(put) 묶고 2. 리스트에(add) 넣음
              ArrayList<HashMap> carLIst = new ArrayList<HashMap>();
              HashMap<String, String> carSpec = new HashMap<String, String>(); //<>데이터타입넣어줌

              carSpec.put("CarCompany","Hyundai");
              carSpec.put("CarName","Grandeur");
              carSpec.put("Year","2022");
              carLIst.add(carSpec);

              carSpec = new HashMap<String, String>();//저장해줄때마다 공간 만들어야함 안그러면 덮어쓰기가 됨
              carSpec.put("CarCompany","Toyota");
              carSpec.put("CarName","Camry");
              carSpec.put("Year","2021");
              carLIst.add(carSpec);
              
              carSpec = new HashMap<String, String>();
              carSpec.put("CarCompany","KIA");
              carSpec.put("CarName","Sorento");
              carSpec.put("Year","2023");
              carLIst.add(carSpec);
          
            for(HashMap<String, String> car : carLIst){ // .get을 통해 HashMap에 저장되어 있는거 불러옴
                System.out.println(car.get("CarCompany") + car.get("CarName") + car.get("Year"));
            } //foreach 돌릴때 arraylist만 쓰기
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
