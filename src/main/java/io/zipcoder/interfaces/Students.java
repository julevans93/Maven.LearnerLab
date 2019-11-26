package io.zipcoder.interfaces;

import sun.jvm.hotspot.oops.Instance;


public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student doshi = new Student(1L, "Miral Doshi");
        super.add(doshi);
        Student mendoza = new Student(2L, "Angel Mendoza");
        super.add(mendoza);
        Student botello = new Student(3L, "Maira Botello");
        super.add(botello);
        Student king = new Student(4L, "Michael King");
        super.add(king);
    }

    public static Students getInstance(){
        return INSTANCE;
    }


}
