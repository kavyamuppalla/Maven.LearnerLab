package io.zipcoder.interfaces;

public class Person {
   final long id;
    String name;


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
   }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

}
