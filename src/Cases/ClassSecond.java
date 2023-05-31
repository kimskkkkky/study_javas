package Cases; //컴파일 될 때 굉장히 중요한 위치값을 가지고 있음

public class ClassSecond {
    public int third = 0;
    public ClassSecond(){

    }
    public ClassSecond(int first){
        this.third = first;
    }
    public int getThird(){
        return this.third;
    }
}
