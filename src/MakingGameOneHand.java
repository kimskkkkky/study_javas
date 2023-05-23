public class MakingGameOneHand {
    public static void main(String[] args) {
        String A = "0";
        String B = "0";
        String C = "0";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        A = "1";
        C = "2";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        B = C;
        C = "0";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        C = A;
        A = "0";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        A = B;
        B = "0";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        // return 0;
    }
}
