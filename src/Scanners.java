import java.util.Scanner; //외부에서 값을 가져다가 쓸려면 무조건 넣어줘야함.

public class Scanners {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object 외부에서 값을 가져다가 쓸려면 무조건 넣어줘야함.
        // System.out.println("Enter username"); // 코딩테스트할때는 출력할 필요 없는 라인

        // String userName = myObj.nextLine(); // Read user input , <nextLine =문자를 변수로 받겠다는 말임.>
        // System.out.println("Username is: " + userName); // Output user input

        int first = 0;
        first = myObj.nextInt();
        int second = myObj.nextInt();
        System.out.println(first + second);

        String third = myObj.nextLine();
        String four = "김하늘";
        four = myObj.nextLine();
        System.out.println(third + four);
        myObj.close();  //scanner반납
}
}