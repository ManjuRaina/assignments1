class Factorial
{
public static void main(String[] args)
{
Scanner sc=new scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int i=0;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial"+fact);
}
}
