package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        zipCodeWilmington.hostLecture(1,20);

        Assert.assertEquals(12.0,zipCodeWilmington.getStudyMap().get(zipCodeWilmington.getStudents().findById(1)));
    }

    @Test
    public void hostLecture1() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        zipCodeWilmington.hostLecture((Teacher) zipCodeWilmington.getInstructors().findById(1),20);
        Assert.assertEquals(7.0,zipCodeWilmington.getStudyMap().get(zipCodeWilmington.getStudents().findById(1)));
    }

    @Test
    public void hostLecture1Educator() {
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        zipCodeWilmington.hostLecture(Educator.KRIS,20);
        Assert.assertEquals(7.0,zipCodeWilmington.getStudyMap().get(zipCodeWilmington.getStudents().findById(1)));
    }

}