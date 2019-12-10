package io.zipcoder.interfaces;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPeople {
    private ArrayList<Person> personList;
    Person person;
    People people;


    @Before
    public void setUp(){
        personList = new ArrayList<Person>();
        person = new Person(2L, "Bob");
        people = new People();
    }

    @Test
    public void testAdd(){

        Assert.assertEquals(true, personList.add(person));
    }

    @Test
    public void testRemove(){
        personList.add(person);

        Assert.assertEquals(true,personList.remove(person));
    }

    @Test
    public void testFindById(){
        people.add(person);

        Person expected = person;
        Person actual = people.findById(2L);

        Assert.assertEquals(expected,actual);
    }
}
