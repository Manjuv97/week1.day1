package assignment1;
import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,i,fact=1;
       n=input.nextInt();
       for(i=1;i<=n;i++)
       {
    	   fact=fact*i;
    	   if(i<n)
    	   System.out.print(i+"*");
    	   else
    		   System.out.print(i);
       }
       System.out.print("="+fact);
	}

}
