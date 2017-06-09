package animals;


public class Lion extends Animal implements Jumpable, Swimable {
    private int swim_limit;
    private float jump_limit;

    public Lion(String name) {
        this.name = name;
        this.run_limit = 300;
        swim_limit = 200;
        jump_limit = 5.5f;
    }

    @Override
    public String voice() {
        return "rrrrrr";
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