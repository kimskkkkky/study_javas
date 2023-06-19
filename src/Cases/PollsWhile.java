package Cases;

import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);
            String answer = "";
            System.out.println("선택에 따라 안내들을 보여드립니다");       
            boolean loops = true;
            while (loops) {
                System.out.println("(E)xit-종료, (P)oll-설문 시작, (S)tatistic-설문 통계");
                answer = myObj.nextLine();
                if(answer.equals("P") || answer.equals("Poll")) { 
                    System.out.println("--------설문 시작----------");
                } else if (answer.equals("S") || answer.equals("Statistic")) {
                    System.out.println("---------설문 통계--------");
                } else if (answer.equals("E") || answer.equals("Exit") ){
                    System.out.println("------설문 종료-------");
                } else { //그외 다른건 모두 설문 종료
                    System.out.println("--------설문 종료--------");
                }
                myObj.close();
            }
            
        }catch( Exception e){
        System.out.println();
        }  finally {
            System.out.println();
        }
        
    }
}


