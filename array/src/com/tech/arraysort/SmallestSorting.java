package com.tech.arraysort;

public class SmallestSorting {

	public static void main(String[] args)
	{
		int []a= {10,9,8,7,6,5,4,3,2,1};
		int n=a[0];
		for(int i=0;i>a.length;i++)
		{
			if(n<a[i])
			{
				n=a[i];
			}
		}
		System.out.println("smallest elements  "+ n);
		
	}

}
