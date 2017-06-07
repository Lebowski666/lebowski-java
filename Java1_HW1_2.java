class Zadanie3
{
	public static void main (String[] args)
	{
		System.out.println("Результат равен: " + result(5,10,50,25));
	}
	static int result (int a, int b, int c, int d)
	{
		return a * (b + (c / d));
	}
}