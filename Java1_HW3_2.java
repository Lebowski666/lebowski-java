/*
 * Homework_3_2
 * author Trashkov Sergey
 * version 16/05/2017
*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
 
public class HW3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //System.out.println(Arrays.toString(words));
        int n = rnd.nextInt(words.length);
        //System.out.println(words[n]);
        System.out.println("��������� �������� �����, ���������� �������");
        char[] chs = words[n].toCharArray();
        char[] chCmp = new char[chs.length];
        for (int i = 0; i < chs.length; i++) {
            chCmp[i] = '*';
        }
 
        while (true) {
            System.out.print("������� ����� (������� 0 ��� ������): ");
            word = sc.nextLine();
            if (word.equals("0")) {
                break;
            }
            if (word.equals(words[n])) {
                System.out.println("�� �������");
                break;
            } else {
                System.out.println("�� �� �������");
                char[] chWord = word.toCharArray();
 
                for (int i = 0; i < chs.length; i++) {
                    if (i >= chWord.length) {
                        break;
                    }
                    if (chs[i] == chWord[i]) {
                        chCmp[i] = chs[i];
                    }
                }
                System.out.println(String.valueOf(chCmp));
            }
        }
 
    }
}