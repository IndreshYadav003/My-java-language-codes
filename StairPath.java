import  java.util.*;
public class StairPath {
    private static int  path(int n){
        if(n==1||n==2)return n;
        return  path(n-1)+path(n-2);
    }
    public static void main(String[] args) {
        System.out.print("give the size of stair");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Number of path is ="+path(n));

    }
}
