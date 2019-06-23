package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable {
    protected List<E> personList = new ArrayList<E>();
    public People() {

    }
    public void add(E person) {
        personList.add(person);

    }
    public E findById(long id) {
        for(E person : personList) {
            if(person.getId() == id) {
                   return person;

            }
        }
        return null;
    }
    public Boolean contains(E person) {
        if(personList.contains(person)) {
            return true;
        }
        return false;
    }
    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {
        E person = findById(id);
        personList.remove(person);
    }
    public void removeAll() {
        personList.clear();
    }
    public int count() {
       return personList.size();
    }
    public abstract E[] toArray();

    public Iterator iterator() {
        return personList.iterator();
    }

}


