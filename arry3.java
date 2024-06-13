import java.util.Scanner;

public class arry3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]table=new int [r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                table[i][j]=sc.nextInt();
            }
        }for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(table[i][j]+"");
            }System.out.println();
    }
}}
