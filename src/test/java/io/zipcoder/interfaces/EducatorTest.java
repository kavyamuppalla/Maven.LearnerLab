package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Test
    public void testImplementation() {
        Educator educator = Educator.KRIS;
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void testTeach() {
        long id = 3;
        String name = "name";
        Educator educator = Educator.KRIS;
        double totalStudyTime = 10;
        double numberOfHours = 8;
        Learner learner = new Student(id,name,totalStudyTime);
        educator.teach(learner,numberOfHours);
        Assert.assertEquals(18, learner.getTotalStudyTime().doubleValue(), 0);

    }
    @Test
    public void testLecture() {
        long id = 4;
        String name = "name1";
        Educator educator = Educator.KRIS;

        Learner learner1 = new Student(100,name,10);
        Learner learner2 = new Student(101,name,20);
        Learner[] learners = new Learner[]{learner1, learner2};
        double numberOfHours = 20;

        educator.lecture(learners, numberOfHours);

        Assert.assertEquals(20, learner1.getTotalStudyTime().doubleValue(), 0);
        Assert.assertEquals(30, learner2.getTotalStudyTime().doubleValue(), 0);

    }

}