import java.util.*;
public class func {
    public static void main(String[] args){
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=getsum(a,b);
        System.out.println(sum);
        sc.close();

    }
    public static int getsum(int a,int b){
        int c;
        c=a+b;
        return c;

    }
    
}
