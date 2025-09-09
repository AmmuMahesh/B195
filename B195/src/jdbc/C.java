package jdbc;

public class C extends P
{	
	public void m1(int x) 
	{
		System.out.println("M1-C");
	}
	public static void main(String[] args)
	{
		 C c = new C();
		 c.m1();
		 c.m1(10);
		
	}
}
