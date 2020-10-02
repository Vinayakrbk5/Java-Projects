package Arrays;

import java.util.Scanner;

public class PrintMultiplesOfNumber {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     int t=in.nextInt();
     if((t>=0)&&(t<=500)){
     for(int i=0;i<t;i++){
         int a = in.nextInt();
         int b = in.nextInt();
         if((a>=0)&&(a<=50)&&(b>=0)&&(b<=50)){
         int n = in.nextInt();
     if((n>=1)&&(n<=15)){
         int sum=a+b;
         System.out.print(sum+" ");
         for(int j=1;j<n;j++)
         {
             sum=sum+(int)Math.pow(2,j)*b;
             if (j==(n-1))
             {
                 System.out.println(sum);
                 break;
             }
             System.out.print(sum+" ");
         }
     }
     }
     }
 }
}
}
