/*
 * Homework_3_1
 * author Trashkov Sergey
 * version 16/05/2017
*/
import java.util.*;

 
public class HW3 {
	
	static boolean playAgain = true;
     
    public static void main (String[] args) {
		while (playAgain) {
			Game();
		}
	}	
	public static void Game () {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int x = rand.nextInt(10);
		int counter = 0;
		int chislo;
		System.out.println("��������� �������� ����� �� 0 �� 9. � ��� ���� 3 ������� ����� ������� ���");
		do {
			System.out.println("������� �����: ");
            chislo = sc.nextInt();
			counter++;
			playAgain = false;
			if (chislo == x) {
				System.out.println("�� ��������! ������ �������? (1 - ��, 0 - ���)");
				//��� ������������� ��������� ����������, �� �� ��� =(
				try {
					int zapros1 = sc.nextInt();
					if (zapros1 == 0) {
						break;
					} 
					if (zapros1 == 1) {
						playAgain = true;
					}
				} 
				catch (Exception e) {
					System.out.println("����������, ������� 1 ��� ������� ��� 0 ��� ������");
				}
			}
			if (chislo < x) {
				System.out.println("��������� ���� ����� ������ �����������");
			}
			if (chislo > x) {
				System.out.println("��������� ���� ����� ������ �����������");
			}
		}
		while ((chislo != x) && (counter < 3)); 
		if (chislo != x) { 
			System.out.println("�� ��������� ���������� �������. ������ �������? (1 - ��, 0 - ���)");
			int zapros2 = sc.nextInt();
			if (zapros2 == 0) {
				playAgain = false;
			} 
			else {
				playAgain = true;
			}
		}
		
	}	
		

}