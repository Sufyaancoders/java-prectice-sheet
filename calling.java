

import java.util.Scanner;


public class calling {
public static void fac(int a,int b){
int d=a*b;
System.out.println(d);
if (a<b){
    System.out.print("b is greater");
}else if(a==b){
    System.out.println("a ia equal to b");    
}
else{
    System.out.println("a is greater");
}
return;
}
    public static void main(String[] args){
        System.out.println ("enter a number");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         fac(a,b);
    }
}
