package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {
    Student student = new Student(null, null);

    public TestStudent() {

    }

    @Test
    public void testImplementation(){

        Boolean expected = true;
        Boolean actual = student instanceof Learner;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritance(){

        Boolean expected = true;
        Boolean actual = student instanceof Person;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLearn(){

        student.Learn(2.0);

        Double expected = 2.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }
}
