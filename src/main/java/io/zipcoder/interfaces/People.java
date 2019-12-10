package io.zipcoder.interfaces;

import java.util.*;
import java.util.function.Consumer;

public class People<T extends Person> implements Iterable {
    private List<T> personList;

    public People(List<T> personList) {
        this.personList = personList;
    }

    public People(T... t) {
        this.personList = Arrays.asList(t);
    }

    public void add (T person) {
        personList.add(person);
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public int size(T person) {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<T> iterable) {
        iterable.forEach(person -> personList.add(person));
    }

    public T findById(long id) {
        for (T person : personList) {
            if (person.getId() == id) return person;
        }
        return null;
    }

    public List<T> findAll() {
        return personList;
    }

    public Iterator iterator() {
        return null;
    }

    public void forEach(Consumer action) {

    }

    public Spliterator spliterator() {
        return null;
    }
}
