
public class Arrays {
    public String[] initialArrays(){
        String[] carTypes = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        return carTypes ;
    }
    public static void main(String[] args) {
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // // string[] = string으로 된 []의 데이터들을 array로 쓸꺼야
        // System.out.println(cars[1]);

        // return 0;

        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length);
        for (int num = 0;  cars.length > num; num = num+1) {
            // cars.length를 컨디션에 넣어주면 String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"}에서 추가해도 컨디션에서 추가한 갯수를 자동으로 읽음
            // DEBUG CONSOLE에 cars.[1]="KIA"라고 써주면 BMW가 KIA로 변수값이 변함.
            System.out.println(cars[num]);        
        }
     
        // String[][] numbers = {
        //                     {"10"}, 
        //                     {"(3) 김하늘. (1) 60. (2) 70."},
        //                     {"100"},
        //                     {"110","120","130"},
        //                     {"500"}
        //                     };
        //                     // [][] 는 row가 2개이상이라는 뜻, 데이터도 {{},{}} 넣어줘야 함.
        //     for (int second = 0; numbers.length > second; second = second+1) {
        //         // 첫번째 for문은 {},{} row가 출력됨
        //         for (int third = 0; numbers[second].length > third; third = third+1) {
        //             // 두번째 for문에서 row안에 컬럼의 데이터들이 출력 되기 시작
        //             System.out.print(numbers[second][third] + ", " );
        //             // 출력되는 값은 numbers second열의 third의 데이터가 출력됨.
        //         }
    
        System.out.println();
        }
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println(cars.length);

    }

