import java.util.*;

public class de {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks :");
        int a=sc.nextInt();
        System.out.println("Enter the age:");
        int b=sc.nextInt();
        if(a<33){
            System.out.println("It is fail");
        }
        else if (a<=60){
            System.out.println("C");
        }
        else if(a<=80){
            System.out.println("B");
        }
        else if(a<=90){
            System.out.println("A");
        }
        else if (a>90){
            System.out.println("A+");

        }
        if(b<=5){
            System.out.println("kid");
        }
        else if(b<=18){
            System.out.println("teen");
        }
        else if(b<45){
            System.out.println("adult");
        
        }
        else if (b>45){
            System.out.println("old");
        }
        sc.close();
        

    }
}
