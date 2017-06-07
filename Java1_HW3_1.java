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
		System.out.println("Программа загадала число от 0 до 9. У вас есть 3 попытки чтобы угадать его");
		do {
			System.out.println("Введите число: ");
            chislo = sc.nextInt();
			counter++;
			playAgain = false;
			if (chislo == x) {
				System.out.println("Вы победили! Начать сначала? (1 - Да, 0 - Нет)");
				//Тут планировалась обработка исключений, но ее нет =(
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
					System.out.println("Пожалуйста, нажмите 1 для повтора или 0 для выхода");
				}
			}
			if (chislo < x) {
				System.out.println("Введенное вами число меньше загаданного");
			}
			if (chislo > x) {
				System.out.println("Введенное вами число больше загаданного");
			}
		}
		while ((chislo != x) && (counter < 3)); 
		if (chislo != x) { 
			System.out.println("Вы исчерпали количество попыток. Начать сначала? (1 - Да, 0 - Нет)");
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