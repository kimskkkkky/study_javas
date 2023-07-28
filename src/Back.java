import java.util.Scanner;

public class Back {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int first = myObj.nextInt();
        for (int A = 1; A < 10 ; A = A+1) {
            // code block to be executed
                System.out.println(first+" * "+A + " = " +first*A);   
        myObj.close();
    }
        
    }
}
