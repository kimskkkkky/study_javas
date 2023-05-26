import java.util.Scanner;

public class WhileWithScanners {

    // try catch문 사용
    // 안내글 A랑 안내글 B를 보고 페이지를 닫고 싶은 상황?
    // 무한루프를 돌리고 싶다? 루프 횟수가 정해져 있지 않으면 while, 루프 횟수가 정해져 있으면for문을 사용
    // 콜센터?등에서 전화로 안내문?동의를 얻는 자동음성을 틀었을때 소비자,고객이 숫자를 누르면(scanner문) 루프가 멈춤
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            String answer = ""
            System.out.println("안내입니다.");
            // while을 true일때 루프를 도니까 1이라고 넣어주면 true일때 루프를 못벗어남.
            boolean loops = true;
            while (loops){
                System.out.println("1-대출, 2-예금, 3~9-종료");
                System.out.print("원하는 업무에 해당하는 번호를 입력하세요.");
                answer = myObj.nextLine();
                if(answer.equals("1")){
                    System.out.println("대출 업무입니다.");
                } else if(answer.equals("2")){
                    System.out.println("예금 업무입니다.");
                } else {
                    System.out.println("안내가 종료됩니다.");
                }
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;

    }
}
