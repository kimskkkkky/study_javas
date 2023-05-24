public class Ifs {
    public static void main(String[] args) {
        // if (condition) {
        //     // block of code to be executed if the condition is true
        //   } else {


        //   }
        int first = 20;
        int second = 18;
        if (first > second) {
            System.out.println(first);
        }

        //  12시이전은 오전, 18시 이전은 오후, 24시까지 밤.
        int time =15;
        if (time < 12) {
            System.out.println("오전입니다.");
        }

        if (time < 18) {
            System.out.println("오후입니다.");
        }

        if (time < 24) {
            System.out.println("밤입니다.");
        }
        // 위와 같이 if를 3개 넣어주면 오후입니다 와 밤입니다라는 두개의 답이 나오기 때문에 잘못된 질문이다.


        if (time < 12) {
            System.out.println("오전입니다.");
        } else if (time < 18) {
            System.out.println("오후입니다.");
        } else {
            System.out.println("밤입니다.");
        }
        // 오전과 오후를 통과하면 자동으로 밤이 결과값이기 때문에 마지막 질문엔 컨디션을 넣어주지 않아도 된다.


        System.out.println("hello, world!");
        // return 0;
    }
}
// condition이 true 이면 'block of code to be executed if the condition is true' 이 부분이 작동, condition이 false이면 'else' 부분이 true
//  false가 결과값에 영향을 미치지 않을땐 else 부분 제거 가능