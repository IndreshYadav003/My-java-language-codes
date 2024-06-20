class outClass{
    public void  show(){
        System.out.println("Good moring every one");
    }

}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        outClass o=new outClass()
        {
            public void show(){
                System.out.println("good happy");
            }
        };
 o.show();
    }
}
