package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {
    @Test
    public void instructorTest() {
        Instructors instructors = Instructors.getInstance();
        int actual = instructors.count();
        Assert.assertEquals(3,actual);
    }

}