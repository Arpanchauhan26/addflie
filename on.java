import java.util.Scanner;

public class on {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int a =sc.nextInt();
        switch(a){ 
            case 1:
            System.out.println("small");
            break;
            case 2:
            System.out.println("medium");
            break;
            case 3:
            System.out.println("large");
            break;
            case 4:
            System.out.println("extra large");
            break;
        } 
        sc.close();   
    
    }
    
}
