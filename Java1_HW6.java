/*Homework_6
 * author Trashkov Sergey
 * version 26/05/2017
 */

class HW6 {
	public static void main(String[] args) {
		Cat cat = new Cat(200, 2, 0);
		System.out.println("Cat -  run: " + cat.run(150) + "; jump: " + cat.jump(1.5f) + "; swim: " + cat.swim(3));
		Dog dog = new Dog(500, 0.5f, 10);
		System.out.println("Dog - run: " + dog.run(499) + "; jump: " + dog.jump(0.3f) + "; swim: " + dog.swim(11));
	}
}

abstract class Animal {
	private int run;
	private float jump;
	private int swim;
		
	Animal (int run, float jump, int swim) {
		this.run = run;
		this.jump = jump;
		this.swim = swim;
	}
	
	boolean run(int length) {
        return length <= run;
    }
    boolean jump(float height)  {
        return height <= jump;
    }
	boolean swim(int length)  {
        return length <= swim;
    }
}

class Cat extends Animal { 
	Cat(int run, float jump, int swim) {
        super(run, jump, swim);
       
    }
	@Override //переопределяем метод swim, потому что по условию кот не плавает.
    boolean swim(int length) {
        return false;
    }
}

class Dog extends Animal { 
	Dog(int run, float jump, int swim) {
        super(run, jump, swim);
    }
}