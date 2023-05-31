public class ClassFirsts {
    public int second = 0; //이 변수는 밑에 funtion에서 가져다가 쓸수 있따.
    ClassFirsts(){
        System.out.println();
    }

    ClassFirsts(int first){
        this.second = first;
        System.out.println(first);
    }

// 생성자는 파라미터를 받아도 return이 없어도 돌수 있따.
//this 
// setter? getter? 메쏘드에서 변수를 가져다 쓰는 ???? 몬말인지 1도 모르겠다

public int getsecond(){
    return this.second;
}
}