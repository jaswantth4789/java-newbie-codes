import java.util.*;
public class age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        switch(age){
            case 18:
            System.out.println("major");
            break;
            case 15:
            System.out.println("minor");
            break;
            default:
            System.out.println("invalid");
            
        }
        sc.close();
    }
}
