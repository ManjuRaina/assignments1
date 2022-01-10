package looping;

import java.util.Scanner;

public class Table {

	public static void main(String[] args)
	{  
		int sum=0;
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number"); 
	   int n=sc.nextInt();
	   for(int i=1;i<=10;i++) {
		   int a=i*n;
		   sum=sum+a;
		   System.out.println(n + "*" + i + "=" +a);
		   
		  }
		
		System.out.println("sum of number is"+   sum);


	}

}
