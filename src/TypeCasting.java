public class TypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
        // returne 0;
    }
}
// 변수를 값을 주고 런 했을때 나오는 변수를 확인하고 싶으면 해당 명령어 다음 줄 숫자앞을 클릭하면 브레이크(빨간점이)가 걸림. 값을 확인하면서 코드를 돌릴 수 있다.
// debug console 에서 변수의 값을 바꿔 줄 수 있다. ex) for 문을 100번째 돌려야 답이 나올때 2~3번 돌리고 변수값을 98로 바꿔서 값을 확인 할 수 있음
// casting은 변수의 성격? 타입을 바꿔주는 거다.