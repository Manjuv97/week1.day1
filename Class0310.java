package assignment1;

import java.util.Scanner;

public class Class0310 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,i,a=0,b=1,sum=0;
		n=input.nextInt();
		System.out.print(a+" "+b);
		
		for(i=2;i<n;i++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;

	}

	}
}

