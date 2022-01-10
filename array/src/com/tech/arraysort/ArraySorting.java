package com.tech.arraysort;
// sorting larger number to smaller and print largest of 2 
public class ArraySorting 
{
public static void main(String[] args)
	{
		int []a= {2,3,6,7,5,4,9,8,1,90};
		for(int i=0;i<a.length;i++)// compare the values one by one
		{
			for(int j=0;j<a.length;j++)/// used to store the value
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
	}
		for(int i=0;i<a.length;i++)// used to print the value
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------------");
		System.out.println( " second largest " + a[6]);
	}
}
