import java.util.*;
public class scan {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.println("enter x:");
    int x=sc.nextInt();
    System.out.println("entery:");
    int y=sc.nextInt();
    int sum=x+y;
    System.out.println(sum);
    System.out.println(x*y);
    sc.close();
}
}