package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE  = new Instructors();
    private Instructors() {
        Instructor instructor1 = new Instructor(1,"Kris");
        add(instructor1);
        Instructor instructor2 = new Instructor(2,"Dolio");
        add(instructor2);
        Instructor instructor3 = new Instructor(3,"Wilhem");
        add(instructor3);

    }
    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[]{});
    }
}
