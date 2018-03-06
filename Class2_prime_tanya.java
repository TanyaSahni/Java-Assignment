package class2;

public class Class2_prime_tanya {
	public static void main(String args[])
	{
		int n,i,c=0;
		n=1234;
		for(i=1;i<=n;i++)
		{
			if( n %i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("n is a prime no");
		}
		else
		{
			System.out.println(" n is not a prime no");
		}
		
	}

}
