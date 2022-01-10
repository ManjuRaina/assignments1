package com.tec.arraysmallestnumber;

public class Test {

	public static void main(String[] args)
	{
		int []a= {10,1,-1,-11,-99,10,40,50,60};
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		System.out.println(" "+a[5]);
		
		}
	}


