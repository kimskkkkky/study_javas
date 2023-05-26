package Cases;
import java.util.Scanner;
public class CasherFor {
    public static void main(String[] args) {
        // 장바구니에는 5가지만 넣을 수 있습니다. = array
        // 100원 이하로 입력 제한, 이상 입력시 0원 적용 = if
        // 입력 중 0원이 입력되면 입력되었던 값 합산 = 계산 종료 = break
        try {
            System.out.println("장바구니엔 5개를 넣음");
            System.out.println("-----계산 시작-----");
            int[] cash = new int[5];
            for (int mart = 0; mart < cash.length; mart = mart +1){
            Scanner myObj = new Scanner(System.in);
            System.out.print((mart+1)+"번째 가격 :");
            int amount = myObj.nextInt();
            if (amount == 0){
                break;
            }
            if (amount > 0 && amount < 100) {
                cash[mart] = amount; // 유효한 값인 경우에만 배열에 할당
            } else {
                cash[mart] = 0; // 100 이상이거나 0인 경우에는 0으로 할당
            }
        }
        System.out.println("------담은 총합------");
        System.out.println(cash[0]+cash[1]+cash[2]+cash[3]+cash[4]);
        System.out.println("------계산 종료------");
        // 복습 필수

        } catch (Exception e) {

        } finally{

        }
        System.out.println();
    }
    
}
