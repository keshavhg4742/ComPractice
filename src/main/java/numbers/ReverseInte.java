package numbers;

public class ReverseInte {

	public static void main(String[] args) {
		int i=20456,rev=0,j=i;
		
		while(i!=0)
		{
			int re=i%10;
			rev=rev*10+re;
			i=i/10;
			
		}
		System.out.println("given num is "+j+" and its reverse is "+rev);

	}

}
