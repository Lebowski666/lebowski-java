class Zadanie5
{
	public static void main (String[] args)
	{
		int a = 7;
		if (!chisloPolozOrOtric(a))
			System.out.println("����� " + a + " �������������");
		else
			System.out.println("����� " + a + " �������������");
	
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