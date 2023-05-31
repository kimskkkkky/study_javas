public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters){
    //  body
    // }
   
    public int F(int x) // x = 4 x = 0 으로 날아감
    {
        int result = x + 1;
        return result;
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            MethodBasics methodBacsic = new MethodBasics(); //new 다음 클래스() 괄호 넣어서 function화 클래스도 변수에 담을 수 있음(인스턴스화) 클래스도 타입으로 쓸 수 있음
                                                            // new MethodBasics() 인스턴스화 function 리스트 볼 수 있음
            y = methodBacsic.F(0);

            MethodBasics methodBacsic_first = new MethodBasics(); 
            y = y + 1; // 변수에 + 1
            y = methodBacsic_first.F(0);
            y = methodBacsic_first.F(y);
            System.out.println("y에 값은 : " + y);
        } catch (Exception e) {
            
        }
        System.out.println();
    }
}

