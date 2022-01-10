  package method;

public class Recursion
{
	int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return(n*factorial(n-1));
	} 
	public static void main(String[] args) {
		
	
		  Recursion recursion = new Recursion();
		  System.out.println(recursion.factorial(5));
	}
}

	
