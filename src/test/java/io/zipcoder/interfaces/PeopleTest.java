package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;

import java.util.Iterator;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        People people = Students.getInstance();
        Person person = new Person(5,"Name");
        people.add(person);
        int actual = people.count();
        Assert.assertEquals(5,actual);
        people.remove(person);
    }

    @Test
    public void findById() {
        People people = Students.getInstance();
        Person actual = people.findById(1);
        Assert.assertEquals(1,actual.getId());

    }

    @Test
    public void contains() {
        People people = Students.getInstance();
        Person person = new Person(1,"name");
        Boolean actual = people.contains(person);
        Assert.assertFalse(actual);

    }

    @Test
    public void remove() {
        People people = Students.getInstance();
        Person person = new Person(1,"name");
        people.add(person);
        people.remove(person);

        Assert.assertEquals(4,people.count());

    }

    @Test
    public void remove1() {
        People people = Students.getInstance();
        Person person = new Student(5,"name", 20);
        int prevCount = people.count();
        people.add(person);
        people.remove(5);
        Assert.assertEquals(prevCount,people.count());

    }

    @Test
    public void removeAll() {
        People people = Students.getInstance();
        people.removeAll();
        Assert.assertEquals(0,people.count());
    }

    @Test
    public void count() {
        People people = Students.getInstance();
        int actual = people.count();
        Assert.assertEquals(4,actual);
    }

    @Test
    public void toArray() {
        People people = Students.getInstance();
        Person[] actual = people.toArray();
        Assert.assertEquals(4,actual.length);
    }

    @Test
    public void iterator() {
        People people = Students.getInstance();
        Iterator actual = people.iterator();
        Assert.assertTrue(actual.hasNext());
    }
}