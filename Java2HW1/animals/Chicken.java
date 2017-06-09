package animals;

public class Chicken extends Animal implements Jumpable {
    private float jump_limit;

    public Chicken(String name) {
        this.name = name;
        this.run_limit = 30;
        jump_limit = 2f;
    }

    @Override
    public String voice() {
        return "cip-cip-cip";
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
}