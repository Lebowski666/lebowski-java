class Zadanie8
{
	public static void main (String[] args)
	{
		int year = 2017;
		System.out.println("Год " + year + " високосный? " + checkYear(year));
	}
	public static boolean checkYear(int year)
	{
		return (year%4 == 0 && (year%100 != 0 || year%400 ==0));
    }
}