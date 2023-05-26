package Cases;
import java.util.Scanner;

public class ForBuckets {
    public static void main(String[] args) {
        try {
            // 장바구니 3가지만 담게 선언
            // String bucket_1 = "";
            // String bucket_2 = "";
            // String bucket_3 = "";
            String[] bucket = {"","",""};
            for(int mart = 0; mart < bucket.length; mart = mart+1 ){
            Scanner myObj = new Scanner(System.in);
            System.out.print((mart+1)+"번째 담기 :");
            bucket[mart] = myObj.nextLine(); //Read user input
            }
            

            System.out.println("------담은 내용물------");
            System.out.print(bucket[0]+", ");
            System.out.print(bucket[1]+", ");
            System.out.print(bucket[2]+", ");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
    }
    
}
