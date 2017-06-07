 /*Homework_5
 * author Trashkov Sergey
 * version 23/05/2017
 */
//import java.util.Arrays;

public class Homework5 {
	public static void main(String[] args) {
		Sotrudnik[] persArray = new Sotrudnik[5];
		persArray[0] = new Sotrudnik("Иванов Иван", "Инженер", "ivivan@mailbox.com", "66-44-66", 30000, 30); 
		persArray[1] = new Sotrudnik("Петров Петр", "Грузчик", "pepetrov@mailbox.com", "66-44-67", 15000, 45);
		persArray[2] = new Sotrudnik("Сидоров Михаил", "Зам. директора", "sidmihail@mailbox.com", "66-44-68", 55000, 41);
		persArray[3] = new Sotrudnik("Козлова Анна", "Бухгалтер", "annakozlova@mailbox.com", "70-70-75", 25000, 35);
		persArray[4] = new Sotrudnik("Иванова Наталья", "Главный бухгалтер", "inatalya@mailbox.com", "71-80-85", 45000, 53);
		//System.out.println(Arrays.toString(persArray));
		for (Sotrudnik sotr : persArray)
			if (sotr.getAge() > 40)
			System.out.println(sotr);
	}
}

class Sotrudnik {
	String fio;
	String dolznost;
	String email;
	String phone;
	int zarplata;
	int age;
	
	public Sotrudnik(String fio, String dolznost, String email, String phone, int zarplata, int age) {
		this.fio = fio;
		this.dolznost = dolznost;
		this.email = email;
		this.phone = phone;
		this.zarplata = zarplata;
		this.age = age;
	}
	
	public String toString() {
		return (fio + "; " + dolznost + "; " + email + "; " + phone + "; " + zarplata + "; " + age);
	}
	
	public int getAge() {
		return age;
    }
		
}