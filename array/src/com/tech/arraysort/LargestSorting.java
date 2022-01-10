package com.tech.arraysort;

public class LargestSorting {

	public static void main(String[] args) {
	int []a= {10,24,35,45,67,56,87,90,43,26};
	int n=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(n<a [i])
		{
			n=a[i];
		}
	}
	System.out.println("largest elements in array " + n);

	}

}
