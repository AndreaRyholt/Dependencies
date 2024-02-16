package com.example.dependencies.alting;

import com.example.dependencies.alting.Person;

import java.util.ArrayList;
@org.springframework.stereotype.Repository
public class Repository {
    private ArrayList people;

    Repository() {
        this.people = new ArrayList<>();
        people.add(new Person("Tine", 45));
        people.add(new Person("Mads", 14));
        people.add(new Person("Karen", 18));
    }

    public ArrayList getPeople() {
        return people;
    }

}
