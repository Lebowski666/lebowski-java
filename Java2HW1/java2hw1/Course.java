package java2hw1;

import obstances.*;


public class Course {
    Pass[] course;

    public Course(Pass[] p) {
        course = new Pass[p.length];
        course = p;
    }

    public void doIt(Team t) {
        for (Pass obstacle : course)
            t.doIt(obstacle);
    }

}