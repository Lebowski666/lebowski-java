package animals;

public class Tiger extends Animal implements Jumpable, Swimable {
    private int swim_limit;
    private float jump_limit;

    public Tiger(String name) {
        this.name = name;
        this.run_limit = 320;
        swim_limit = 250;
        jump_limit = 11f;
    }

    @Override
    public String voice() {
        return "ahrrrrrrrrr";
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