package animals;


public class Elephant extends Animal implements Swimable {
    private int swim_limit;

    public Elephant(String name) {
        this.name = name;
        this.run_limit = 70;
        swim_limit = 180;
    }

    @Override
    public String voice() {
        return "ufffffff";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
}