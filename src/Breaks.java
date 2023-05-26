public class Breaks {
    public static void main(String[] args) {
        // try catch문 사용
        try {
            for (int first = 0; first < 4; first = first + 1) {
                // break문ㅇㅔ 대한 사용법 알기
                if (first == 2) { // first =2이면 for문 종료 =break 사용해서 튀어나옴
                    break;
                }
                System.out.println();
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
