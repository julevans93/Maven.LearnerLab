package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPerson {
    private Long id;
    private String name;
    private Person person;

    public TestPerson(){

    }

    @Before
    public void setUp(){
        this.person = new Person(2L, null);
    }

    @Test
    public void setNameTest(){
        Long expected = 2L;
        Long actual = person.getId();

        Assert.assertEquals(expected,actual);

    }
}
