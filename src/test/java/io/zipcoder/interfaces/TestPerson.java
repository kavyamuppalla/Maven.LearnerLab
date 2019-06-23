package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        long id = 100;
        String name = "abc";
        Person p = new Person(id, name);
        Assert.assertEquals(100,p.getId());
        Assert.assertEquals("abc",p.getName());
    }
    @Test
    public void testSetName() {
        long id = 200;
        String name = "xyz";
        Person p = new Person(id,name);
        p.setName("abc");

        Assert.assertEquals(id, p.getId());
        Assert.assertEquals("abc", p.getName());

    }

}
