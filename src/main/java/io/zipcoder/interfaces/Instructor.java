package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.Learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {

    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        for (Learner learner : learners){
            learner.Learn(numberOfHours / learners.length);
        }
    }
}
