/**
 * Java 2 Homework 5
 *
 * author Trashkov Sergey
 * version 23/06/17
 */
import java.util.Arrays;

public class Java2HW5 implements Runnable {
    static final int size = 10000000;
	static final int h = size / 2;
	static float[] arr = new float[size];
	static float[] a1 = new float[h];
    static float[] a2 = new float[h];

	public static void main(String[] args) {
		passThroughArray();
		splitArray();
    }

	public static void passThroughArray() {
		Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++)
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        System.out.println("Method passThroughArray lasts " + (System.currentTimeMillis() - a) + " ms");
	}
	
	public static void splitArray() {
		Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
		Thread t1 = new Thread("thread 1");
        Thread t2 = new Thread("thread 2");
		t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } 
		catch (InterruptedException å) { 
		
		}
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Method splitArray lasts " + (System.currentTimeMillis() - a) + " ms");
	}
	@Override
	public void run() {
		for (int i = 0; i < h; i++) {
            a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
		}
	}
}