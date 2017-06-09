package java2hw1;

import animals.*;
import obstances.*;
import java.util.Arrays;

public class Team {
    private Animal[] animals;
    private String name;
    private String result;

    public Team(String name, Animal[] animals) {
        this.name = name;
        this.animals = new Animal[animals.length];
        this.animals = animals;
        result = "";
    }

    public void doIt(Pass obstacle) {
        result = result + obstacle.toString() + "\n"; //тут бы хотелось сделать нормальный вывод названия препятствия, но не успеваю
        for (Animal a : animals)
            result = result + a + " " + obstacle.doIt(a) + "\n";
    }

    public void showResult() {
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Команда: " + name + " " + Arrays.toString(animals);
    }
}
