package io.zipcoder.interfaces.configuration;

import io.zipcoder.interfaces.Classroom;
import io.zipcoder.interfaces.Instructors;
import io.zipcoder.interfaces.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Bean
    public Classroom currentCohort(){
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohort(){
        return new Classroom(instructors, previousStudents);
    }
}
