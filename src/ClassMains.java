import Cases.ClassSecond;
public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classfirsts = new ClassFirsts();
            ClassFirsts classfirstsWithVar = new ClassFirsts(3);
            int second = classfirstsWithVar.getsecond();
            ClassSecond classSecond = new ClassSecond(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
        // 생성자는 파라미터를 받아도 return이 없어도 돌수 있따.
    }
}
