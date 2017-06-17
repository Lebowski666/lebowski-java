/* Java 2 Homework 3 Task 2
 * author Trashkov Sergey
 * version 16/06/17 
*/
import java.util.*;

public class Java2HW3_2 {
	public static void main(String[] args) {
		PhoneBook p = new PhoneBook();
        p.newRecord("Ivanov", new PhoneRecord("123-45-67", "ivanov@gmail.com"));
        p.newRecord("Petrov", new PhoneRecord("321-54-76", "petrov@gmail.com"));
        System.out.println(p.findPhone("Ivanov"));
        System.out.println(p.findEmail("Petrov"));
		System.out.println(p.findEmail("Sidorov"));
		System.out.println(p.findPhone("Sidorov"));
 	}
}

class PhoneBook {
    Map<String, PhoneRecord> p;

    public PhoneBook() {
        p = new TreeMap<>();
    }

    public void newRecord(String name, PhoneRecord record) {
        p.put(name, record);
    }

    public void newPhone(String name, String phone) {
        PhoneRecord record = p.get(name);
		if (record != null) {
			record.newPhone(phone);
		}	
    }

    public String findPhone(String name) {
        PhoneRecord record = p.get(name);
		if (record == null) {
			return "Can't find phone number for this name in the phonebook";
		}
		else {
			return record.getPhones();
		}
		
    }

    public String findEmail(String name) {
        PhoneRecord record = p.get(name);
		if (record == null) {
			return "Can't find email for this name in the phonebook";
		}
		else {
			return record.getEmails();
		}
	}
}

class PhoneRecord {
    List<String> phones;
    List<String> emails;

    public PhoneRecord(String phone, String email) {
        phones = new ArrayList<>();
        emails = new ArrayList<>();
        phones.add(phone);
        emails.add(email);
    }

    public void newPhone(String phone) {
        phones.add(phone);
    }

    public String getPhones() {
        return phones.toString();
    }    

    public String getEmails() {
        return emails.toString();
    }
}