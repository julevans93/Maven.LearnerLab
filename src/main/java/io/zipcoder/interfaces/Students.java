package io.zipcoder.interfaces;

import sun.jvm.hotspot.oops.Instance;

import java.util.Iterator;


public class Students extends People<Student> {


    public Students(Student... students) {
        super(students);
    }

    @Override
    public Iterator<Student> iterator() {
        return findAll().iterator();
    }


}
