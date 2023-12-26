import java.util.*;
public class array {
    public static void main(String[] args){
        int[] marks= new int[3];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("total marks are");
        for(int i=0;i<3;i++){
            sum+=marks[i];
        }
        System.out.println(sum);
        sc.close();
        
    }
    
}
