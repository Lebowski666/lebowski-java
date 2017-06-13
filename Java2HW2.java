/* Java 2 Homework 2
 * author Trashkov Sergey
 * version 13/06/17 
*/
import java.util.*;

public class Java2HW2 {
	public static void main(String[] args) {
		try {
			String str = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0"; //create string
			//String str = "1 3 1 2\n2 a 2 2\n5 6 7 1\n3 3 1 0"; //test1
			//String str = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0 7"; //test2
			//String str = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0\n 4 5 6 7"; //test3
            System.out.println(strToArray(str));
		}
		catch (NumberFormatException ex) {
			System.out.println("There is a symbol or word in the array");
        } 
		catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
	public static int strToArray(String str) throws NumberFormatException, ArrayIndexOutOfBoundsException {
		final int SIZE = 4; // set the size of the array
		String[] arrayOne = str.split("\n"); //turn string to one-dimensional array
		if (arrayOne.length != SIZE)
            throw new ArrayIndexOutOfBoundsException("Wrong number of rows"); //create manual exception
		System.out.println(Arrays.toString(arrayOne)); //print one-dimensional array
		String[][] arrayTwo = new String[SIZE][SIZE]; //turn one-dimensional array to two-dimensional array
		for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = arrayOne[i].split(" ");
            System.out.println(Arrays.toString(arrayTwo[i])); //print two-dimensional array
			if (arrayTwo[i].length != SIZE) {
                throw new ArrayIndexOutOfBoundsException("Wrong number of columns"); //create manual exception
			}
		}
		int result = 0;
		for (String[] line : arrayTwo)
            for (String s : line)
                result += Integer.parseInt(s); //find the sum of array elements
				result /= 2;
		return result; //sum of array elements after dividing by 2
	}
}