/* Java 2 Homework 3 Task 1
 * author Trashkov Sergey
 * version 16/06/17 
*/
import java.util.*;

public class Java2HW3 {
	public static void main(String[] args) {
		//create array of words
		String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "banana", "carrot", "cherry", "apple", "grape", "melon", "leak", "kiwi", "mango", "lemon", "nut", "olive", "pea", "peanut", "carrot", "pepper", "pineapple", "banana", "leak"};
		//print array
		System.out.println(Arrays.toString(words));
		//create HashMap
		HashMap<String, Integer> wordToCount = new HashMap<>();
		//count number of duplicate words
		for (String word : words) {
			if (!wordToCount.containsKey(word)) {
				wordToCount.put(word, 0);
			}
			wordToCount.put(word, wordToCount.get(word) + 1);
		}
		//print word and the number of its repetitions
		for (String word : wordToCount.keySet()) {
			System.out.println(word + " - " + wordToCount.get(word));
		}
		//print size of array words
		System.out.println("There are " + words.length + " words in the array");
		//print size of wordToCount
		System.out.println("There are " + wordToCount.size() + " non-repeating words in the array");
	}
}

