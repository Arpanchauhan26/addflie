import java.util.*;

public class word {
    public static void main(String[] args) {
        int [] arr=  {1,2,3,4,5,6};
        for (int i=1;i<arr.length;i++){
            System.out.println("length"+i);

        }
        int[] a=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.");
        for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        }
sc.close();



    }
}
