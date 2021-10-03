package assignment1;
import java.util.Scanner;
public class Class3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);		
		 int n,m,i;
		boolean flag=true;
		n=input.nextInt();
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0) {
				System.out.print(n + " is not a prime number");
				flag=false;
				break;
			}
			
		}
		if(flag==true)
			System.out.print(n + " is a prime number");
		
		
       
	}

}
