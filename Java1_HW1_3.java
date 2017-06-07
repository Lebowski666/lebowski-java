class Zadanie4
{
	public static void main (String[] args)
	{
		System.out.println("Результат равен " + sravnenie(10, 7));
	}
	public static boolean sravnenie(int a, int b)
	{
        int result = a + b;
        return (result>=10 && result<=20);
	}
}