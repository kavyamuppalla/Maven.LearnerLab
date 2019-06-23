package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation() {
        long id = 4;
        String name = "nma";
        Instructor instructor = new Instructor(id,name);
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance() {
        long id = 2;
        String name = "example1";
        Instructor instructor = new Instructor(id,name);
        Assert.assertTrue(instructor instanceof Person);

    }
    @Test
    public void testTeach() {
        long id = 3;
        String name = "name";
        Instructor instructor = new Instructor(id,name);
        double totalStudyTime = 10;
        double numberOfHours = 8;
        Learner learner = new Student(id,name,totalStudyTime);
        instructor.teach(learner,numberOfHours);
        Assert.assertEquals(18, learner.getTotalStudyTime().doubleValue(), 0);

    }
    @Test
    public void testLecture() {
        long id = 4;
        String name = "name1";
        Instructor instructor = new Instructor(id,name);

        Learner learner1 = new Student(100,name,10);
        Learner learner2 = new Student(101,name,20);
        Learner[] learners = new Learner[]{learner1, learner2};
        double numberOfHours = 20;

        instructor.lecture(learners, numberOfHours);

        Assert.assertEquals(20, learner1.getTotalStudyTime().doubleValue(), 0);
        Assert.assertEquals(30, learner2.getTotalStudyTime().doubleValue(), 0);

    }
}
