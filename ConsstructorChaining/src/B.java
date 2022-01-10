
public class B  extends A{
	int a;
	int b;
	
	B(int a,int b ,int x,int y)
	{
		super(x,y);
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args)
	{
		B b=new B(1,2,3,4);
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.x);
		System.out.println(b.y);
		

	}

}
