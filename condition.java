import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        
        if (a%2==0){
         System.out.println("a is even");

        }
else{
    System.out.println("a is odd");
}
System.out.println("enter the value of b:");
int b=sc.nextInt();
if(a<=b){
    System.out.println("b is greater");
}
else{
    System.out.println("b is smaller");
}
sc.close();

    }
}
