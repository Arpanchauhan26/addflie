import java.util.*;
public class ok {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("option 1 to 7");
       int a = sc.nextInt();
       System.out.println("enter the value b");
       int b= sc.nextInt();
    switch(a){
        case 1:
        System.out.println("monday"); 
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");
        break;
        case 4 :
        System.out.println("thursday");
        break;
        case 5:
        System.out.println("friday");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("sunday");
        break;
    }
    if(b%4==0){
        System.out.println("b is leap year");}
        else{
            System.out.println("b is not leap year");
        }
    
sc.close();

    }
    
}
