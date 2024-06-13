import java.util.Scanner;

public class arry {
    public static void arr(int a[])
    {
        for (int j=0;j<2;j++){
            System.out.println(a[j]);
        }

    }
    
    public static void main(String[] args) {
        
    
         int a[]= new int [22];
        for (int i=0;i<2;i++){
            Scanner sc = new Scanner (System.in);
            a[i]=sc.nextInt();

        }
        arr(a);
    }
}
