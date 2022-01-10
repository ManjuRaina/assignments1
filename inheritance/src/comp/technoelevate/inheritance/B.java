package comp.technoelevate.inheritance;

public class B extends A 

{
	static void m1()
	{
	    System.out.println("m1");
	}
	static void m2()
	{
		  System.out.println("m2");
			
	}
	static void m3()
	{
		System.out.println("m3");
		
	}
	static void  m4()
	{
		System.out.println("m3");
		
	}

public static void main(String[] args)
	{
		B b=new B();
		m1();
		m2();
		m3();
		m4();
		
	}
	
	
}
