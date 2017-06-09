import animals.*;
import obstances.*;
import java2hw1.*;
/**
 *
 * @author Trashkov Serget
 * @version (09/06/2017
 */
public class Main {

    public static void main(String[] args) {
       /* Animal[] zoo = {new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};
        Track track = new Track(80);
        Wall wall = new Wall(3);
        Water water = new Water(10);
        
        for (Animal animal : zoo) {
            System.out.println(animal + " say: " + animal.voice());
            System.out.println(" run: " + track.doIt(animal));
            System.out.println(" jump: " + wall.doIt(animal));
            System.out.println(" swim: " + water.doIt(animal));
        }   */ 
        Course c = new Course(new Pass[] {new Track(80), new Water(3), new Wall(10)});
        Team t1 = new Team("Веселые зверята", new Animal[] {new Cat("Murzik"), new Dog("Sharik"), new Hen("Izzy"), new Hippo("Hippopo")});
        System.out.println(t1);
        c.doIt(t1);
        t1.showResult();
        Team t2 = new Team("Брутальные зверищи", new Animal[] {new Chicken("Tcipa"), new Lion("Sherhan"), new Tiger("Sablezub"), new Elephant("Dambo")});
        System.out.println(t2);
        c.doIt(t2);
        t2.showResult();
    }
}