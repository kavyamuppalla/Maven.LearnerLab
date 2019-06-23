package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void StudentTests() {
    Students students = Students.getInstance();
    Person[] persons = students.toArray();
        Assert.assertEquals(4, persons.length);
    }

}