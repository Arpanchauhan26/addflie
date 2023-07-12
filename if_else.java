import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = sc.nextInt();
        System.out.println("Enter the second value : ");
        int b = sc.nextInt();
        System.out.println("Enter an opreator : ");
        String c =  sc.next();
        if(c.equals("+") ){
            System.out.println("sum is : "+(a+b));

    } 

else if (c.equals("/") ){
    
    System.out.println("divide is : "+(a/b));
}
else if ( c.equals("%") ){
    
    System.out.println("modules is : "+(a%b));
}
else if ( c.equals("*") ){


    
    System.out.println("multiply is : "+(a*b));
}
else if ( c.equals("-") ){
    System.out.println("minus is : "+(a-b));
}
else{
    System.out.println("not a valid opreator");
}
System.out.println(c);
sc.close();

}
}
