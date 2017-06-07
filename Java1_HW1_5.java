class Zadanie6
{
	public static void main (String[] args)
	{
		int a = -7;
		if (ifOtricThenTrue(a))
			System.out.println(ifOtricThenTrue(a));
	}
	static boolean ifOtricThenTrue(int a)
	{
		if (a < 0) 
			return true;
	    return false;
	}
}