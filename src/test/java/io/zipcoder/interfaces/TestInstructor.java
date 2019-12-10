package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructor {
    Instructor instructor;
    Student student1;
    Student student2;
    Student[] students;

    @Before
    public void setUp(){
        instructor = new Instructor(null,null);
        student1 = new Student(null, null);
        student2 = new Student(null, null);
        students = new Student[]{student1, student2};
    }

    @Test
    public void testImplementation(){
        Boolean expected = true;
        Boolean actual = instructor instanceof Teacher;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritance(){
        Boolean expected = true;
        Boolean actual = instructor instanceof Person;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTeach(){
        instructor.teach(student1, 2.0);

        Double expected = 2.0;
        Double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture(){
        instructor.lecture(students, 12.0);

        Assert.assertEquals(6.0, student1.getTotalStudyTime(), 0.0001);
        Assert.assertEquals(6.0, student2.getTotalStudyTime(), 0.0001);
    }
}

