/* Homework_2
 * @author Trashkov Sergey
 * version 12/05/2017
*/
import java.util.Arrays;
class HW2 {
	public static void main (String[] args) {
		array1();
		System.out.println();
		array2();
		System.out.println();
		array3();
		System.out.println();
		array4();
		System.out.println();
		array5();
	}
	//Task_1
	static void array1 () {
		int[] nums = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {   
			if (nums[i] == 0) {
				nums[i] = nums[i] + 1;
			}
			else {
				nums[i] = nums[i] - 1;
			}
			System.out.print(" " + nums[i] + " ");     
		}
	}
	//Task_2
	static void array2 () {
		int counter = 0;
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {	
			arr[i] = counter;         
			counter = counter + 3;
			System.out.print(arr[i] + " "); 
		}
	}
	//Task_3
	static void array3 () {
		int[] nums = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {   
			if (nums[i] < 6) {
				nums[i] = nums[i] * 2;
			}
			System.out.print(" " + nums[i] + " ");     
		}
	}
	//Task_4
	static void array4 () {    
		int[][] table = new int[4][4];     
		for (int i = 0; i < table.length; i++) {        
			for (int j = 0; j < table.length; j++) {          
				table[i][i] = 1;
				table[j][table.length - 1 - j] = 1; 
				System.out.print(table[i][j] + " ");          
			}         
			System.out.println();     
		} 
	}
	//Task_5
	static void array5 () { 
		int[] nums = { 1, 5, 3, 2, 11, 4, 7, 15, -4, 8, 9, 21 };
		System.out.println(Arrays.toString(nums));
		int min, max;	
		min = max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}	
		System.out.println("min = " + min + "; max = " + max);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

