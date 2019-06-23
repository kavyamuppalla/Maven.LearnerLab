package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        long id = 12;
        String name = "name";
        double totalStudyTime = 8.5;
        Student student = new Student(id,name,totalStudyTime);
        Assert.assertTrue(student instanceof Learner);

    }

    @Test
    public void testInheritance() {
        long id = 11;
        String name = "name1";
        double totalStudyTime = 9;
        Student student1 = new Student(id,name,totalStudyTime);
        Assert.assertTrue(student1 instanceof Person);
    }
    @Test
    public void testLearn() {
        long id = 8;
        String name = "name2";
        double totalStudyTime = 9.5;
        Student student = new Student(id,name,totalStudyTime);
        student.learn(2);
        Assert.assertEquals(11.5,student.getTotalStudyTime().doubleValue(),0.0);
    }
}
