package com.version1.TestSpringBootApp.service;

import com.version1.TestSpringBootApp.model.Person;
import org.springframework.stereotype.Service;

@Service
public class RenamePersonService implements PersonService {

    private final String newFirstName;
    private final String newSurnameName;

    public RenamePersonService() {
        this.newFirstName = "NewName";
        this.newSurnameName = "NewSurname";
    }

    @Override
    public void handlePersonData(Person person) {
        System.out.printf("Previous name: Firstname: %s Surname: %s", person.getFirstName(), person.getSurname());

        person.setFirstName(newFirstName);
        person.setSurname(newSurnameName);

        System.out.printf("New name: Firstname: %s Surname: %s", person.getFirstName(), person.getSurname());
    }

}
