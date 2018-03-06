package class2;

public class Class2_reverse_tanya {
	public static void main( String args[])
	{
		int n, r = 0;
		n = 12345;
		while(n !=0);
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
		System.out.println("Reverse is"+n);
	}

}
