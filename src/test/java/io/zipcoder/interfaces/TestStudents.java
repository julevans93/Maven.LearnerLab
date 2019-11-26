package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    Students students;

    @Test
    public void testStudents(){
        students.getInstance();
        Integer expected = 4;
        Integer actual = students.count();

        Assert.assertEquals(expected,actual);
    }
}
