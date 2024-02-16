package com.example.dependencies.alting;

import com.example.dependencies.alting.Repository;

import java.util.ArrayList;
@org.springframework.stereotype.Service
public class Service {
    Repository repository = new Repository();

    public ArrayList getPeople() {
        return repository.getPeople();
    }

}
