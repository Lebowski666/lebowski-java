class Zadanie5
{
	public static void main (String[] args)
	{
		int a = 7;
		if (!chisloPolozOrOtric(a))
			System.out.println("число " + a + " положительное");
		else
			System.out.println("число " + a + " отрицательное");
	
	}
	static boolean chisloPolozOrOtric(int a)
	{
			if (a < 0)
			{
				return true;
			} 
			 else
			{
				return false;
			}
	}
}