package obstances;
import animals.*;

public class Track implements Pass {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        return animal.run(length);
    } 
}