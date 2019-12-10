package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    public Instructors(){
        for (Educator educator : Educator.values()){
            this.add(new Instructor(educator.getID(),educator.getName()));
        }
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}
