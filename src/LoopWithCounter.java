public class LoopWithCounter {
    public static void main(String[] args) {
        int count = 1;
        int A = 1;
        int loop = 5;
        // count = 반복 라인, A = 출력할 숫자, loop = 반복 횟수
        System.out.println(A);
        while (count <= loop) {
            count = count + 1;
            A = A + 1;
            System.out.println(A);
        }
    }
}
