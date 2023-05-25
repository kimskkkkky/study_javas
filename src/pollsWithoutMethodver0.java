import java.util.Scanner;

public class pollsWithoutMethodver0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int answer1 = in.nextInt();
        // int answer2 = in.nextInt();
        // int answer3 = in.nextInt();
        // int answer4 = in.nextInt(); 실패 코드
        String[] answers = new String[4];
        String[][] numbers = {
                { "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." },
                { "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." },
                { "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." },
                { "4. 강의 진행 속도는 적절하였는가?" },
                { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." }
        };
        for (int first = 0; numbers.length > first; first = first + 1) {
            for (int second = 0; numbers[first].length > second; second = second + 1) {
                System.out.print(numbers[first][second] + " ");
            }
            System.out.println();
            if (first == 1) {
                System.out.print("답)" + "");
                answers[0] = in.nextLine();
            }
            if (first == 3) {
                System.out.print("답)" + "");
                answers[1] = in.nextLine();
            }
            if (first == 5) {
                System.out.print("답)" + "");
                answers[2] = in.nextLine();
            }
            if (first == 7) {
                System.out.print("답)" + "");
                answers[3] = in.nextLine();
            }
            System.out.println();

        }
        System.out.println("---------------------설문 종료--------------------------");
        System.out.println("-------------------- 설문 결과 ---------------------------");
        for (int third = 0; third < answers.length; third = third + 1) {
            System.out.print(answers[third] + ",");

        }
        // int[] Answer = { answer1, answer2, answer3, answer4 };
        // for (int num = 0; num < 5; num = num + 1) {
        // System.out.print(Answer[num] + ",");

    }
}
