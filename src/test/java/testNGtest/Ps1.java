package testNGtest;

public class Ps1 {
	
	public static String s;
	public void m1() {
		s=new String("qwer");
	}
	public static void s() {
		System.out.println(s.toUpperCase());
		
	}

	public static void main(String[] args) {
		new Ps1().m1();
		System.out.println(s);
		new Ps1().s();
		new Ps1().qw();

	}
	public void qw()
	{
		s();
	}

}
