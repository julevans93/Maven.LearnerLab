package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person> implements Iterable {
    private ArrayList<Person> personList;

    public People(ArrayList<Person> personList){
        this.personList = personList;
    }

    public People(){
        this.personList = new ArrayList<Person>();
    }

    public Boolean add(Person person){
         return personList.add(person);
    }

    public Person findById(long id){
        for (Person person: personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public Boolean contains(Person person){
        if (personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public Boolean remove(long id){
        for (Person person : personList){
        if (person.getId() == id){
            return personList.remove(person);
            }
        }
        return false;
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] personArray = new Person[personList.size()];
        for (Person person : personList){
            Arrays.fill(personArray, person);
        }

        return personArray;
    }


    public Iterator iterator() {
        return personList.iterator();
    }
}
