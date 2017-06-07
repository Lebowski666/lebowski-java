/**
 * Homework_7
 * author Trashkov Sergey
 * version 29/05/2017
 */
public class HW7 {

    public static void main(String[] args) {
        Cats[] cats = {new Cat1("Barsik", 11, false), new Cat2("Murzik",8, false)}; //создаем массив котов
        // Cat cat = new Cat("Barsik", 41);
        Plate plate = new Plate(17); //создаем тарелку
        for (Cats c : cats) {
            System.out.println(plate);
            c.eat(plate);
            System.out.println(c);

        }
        System.out.println("Добавим в тарелку еды");
        plate.increaseFood(10);
        System.out.println(plate);


    }
}
class Cats {
    String name;
    int appetite;
    boolean satiety;
    Cats(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    void eat(Plate plate) {
        //plate.decreaseFood(appetite);
        if (appetite <= plate.getFood()) { //получаем значение true или false для сытости кота
            this.satiety = plate.isHungry(appetite);
        }
        else {
            System.out.println("Похоже что кто-то останется голодным");
        }
    }
}
class Cat1 extends Cats{
    Cat1(String name, int appetite, boolean satiety) {
       super(name, appetite, satiety);
    }
    @Override
    public String toString() {
        return "Имя кота -  " + name + "; аппетит кота - " + appetite + "; сытость - " + satiety; //выводим данные про первого кота в консоль
    }
}

class Cat2 extends Cats{
    Cat2(String name, int appetite, boolean satiety) {
        super(name, appetite, satiety);
    }
    @Override
    public String toString() {
        return "Имя кота -  " + name + "; аппетит кота - " + appetite + "; сытость - " + satiety; //выводим данные про второго кота в консоль
    }
}

class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }

    int getFood() { //получаем количество еды чтобы потом сравнить с аппетитом кота
        return food;
    }

    void decreaseFood(int food) {
        if ((this.food - food >= 0)) { //проверяем что в миске не отрицательное кол-во еды
            this.food -= food;
        }
    }
    void increaseFood(int f) { //добавляем еду в тарелку
        this.food += f;
    }

    boolean isHungry(int n) { //метод определяющий сытость кота
        if (this.food < n) {
            return false;
        }
        else {
            this.food -= n;
            return true;
        }

    }

    @Override
    public String toString() {
        return "plate: " + food; //выводим содержимое тарелки в консоль
    }
}