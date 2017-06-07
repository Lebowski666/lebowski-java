/**
 * Homework_7
 * author Trashkov Sergey
 * version 29/05/2017
 */
public class HW7 {

    public static void main(String[] args) {
        Cats[] cats = {new Cat1("Barsik", 11, false), new Cat2("Murzik",8, false)}; //������� ������ �����
        // Cat cat = new Cat("Barsik", 41);
        Plate plate = new Plate(17); //������� �������
        for (Cats c : cats) {
            System.out.println(plate);
            c.eat(plate);
            System.out.println(c);

        }
        System.out.println("������� � ������� ���");
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
        if (appetite <= plate.getFood()) { //�������� �������� true ��� false ��� ������� ����
            this.satiety = plate.isHungry(appetite);
        }
        else {
            System.out.println("������ ��� ���-�� ��������� ��������");
        }
    }
}
class Cat1 extends Cats{
    Cat1(String name, int appetite, boolean satiety) {
       super(name, appetite, satiety);
    }
    @Override
    public String toString() {
        return "��� ���� -  " + name + "; ������� ���� - " + appetite + "; ������� - " + satiety; //������� ������ ��� ������� ���� � �������
    }
}

class Cat2 extends Cats{
    Cat2(String name, int appetite, boolean satiety) {
        super(name, appetite, satiety);
    }
    @Override
    public String toString() {
        return "��� ���� -  " + name + "; ������� ���� - " + appetite + "; ������� - " + satiety; //������� ������ ��� ������� ���� � �������
    }
}

class Plate {
    private int food;
    Plate(int food) {
        this.food = food;
    }

    int getFood() { //�������� ���������� ��� ����� ����� �������� � ��������� ����
        return food;
    }

    void decreaseFood(int food) {
        if ((this.food - food >= 0)) { //��������� ��� � ����� �� ������������� ���-�� ���
            this.food -= food;
        }
    }
    void increaseFood(int f) { //��������� ��� � �������
        this.food += f;
    }

    boolean isHungry(int n) { //����� ������������ ������� ����
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
        return "plate: " + food; //������� ���������� ������� � �������
    }
}