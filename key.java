import java.util.*;

public class key{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value:");
        int a= sc.nextInt();
        int x=0;
        for(int i=0;i<=100;i++){
            System.out.println(i);

        }
        while(x<10){
            System.out.println(3*x);
            x++;
        }
        sc.close();
        int c=5;
        do {
            System.out.println(c*3);
        }        
            while(c>=10);
    }
}