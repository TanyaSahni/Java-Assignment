package class2;

public class Class2_leapyear_tanya {
	public static void main( String args[])
	{
		int year;
		year=2009;
		if(( year%400 == 0)||(year%4 == 0)&&(year % 100 != 0))
			System.out.println("year"+year+" is a leap year");
		else
			System.out.println("year"+year+" is not a leap year");
			
	}
}
