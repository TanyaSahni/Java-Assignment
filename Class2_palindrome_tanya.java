package class2;

public class Class2_palindrome_tanya {

	public static void main( String args[])
	{
		int n, n1 ,rev = 0, rem;
		n = 123321;
		n1 = n;
		while( n > 0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if (n1 == rev)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println(" given number is not a palindrome");
		}
		
	}

}
