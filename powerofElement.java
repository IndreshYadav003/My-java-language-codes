import  java.util.*;
public class powerofElement {
    private  static int  power(int a,int b){
        if(b==0)return 1;
        if (b==1)return a;
        int ans=power(a,b/2);
        if(b%2==0)return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter numbers=");
        int a= sc.nextInt();
        System.out.print("Enter the power of number=");
        int n=sc.nextInt();
        System.out.print("Power of numbers="+power(a,n));
    }
}
