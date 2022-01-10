package comp.technoelevate.inheritance;

public class Mobile {

	public static void main(String[] args) {
 Phone p=new Phone();
 p.cost=1200;
 p.color="hot pink";
 p.sim=2;
 p.brand="kachid";
 System.out.println(p.cost);
 System.out.println(p.color);
 System.out.println(p.sim);
 System.out.println(p.brand);
 SmartPhone s=new SmartPhone();
 s.cost=12000;
 s.color="orange";
 s.sim=2;
 s.brand="samsung";
 System.out.println(s.cost);
 System.out.println(s.color);
 System.out.println(s.sim);
 System.out.println(s.brand);
 s.playpug();
 s.suffering();
 

	}

}
