class outter{
    int outterdata=3;
    outter(int outterdata){
        this.outterdata=outterdata;
    }
    class innerclass{
        int innerdata=333;
        innerclass(int innerdata){
            this.innerdata=innerdata;
        }
        static  void  f1(){
            System.out.println("hellow");

        }}
        static  void f2(){
            System.out.println("good bye");

    }
}
public class incnnerclasscode {
    public static void main(String[] args) {
        outter ob=new outter(4);
        ob.f2();
    outter.innerclass ob1=ob.new innerclass(3);
    ob1.f1();

    }
}
