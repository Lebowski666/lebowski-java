package animals;
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal implements Jumpable, Swimable {
    private int swim_limit;
    private float jump_limit;

    public Dog(String name) {
        this.name = name;
        this.run_limit = 200;
        swim_limit = 150;
        jump_limit = 2.3f;
    }

    @Override
    public String voice() {
        return "woof-woof";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
}