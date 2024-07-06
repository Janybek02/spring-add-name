package com.example.course.personDAO;

import com.example.course.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private int PERSON_ID;
    private final List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PERSON_ID, "John"));
        people.add(new Person(++PERSON_ID, "Mike"));
        people.add(new Person(++PERSON_ID, "Jan"));
        people.add(new Person(++PERSON_ID, "Bla"));
        people.add(new Person(++PERSON_ID, "who knows"));

    }
    public List<Person> show(){
        return people;
    }
    public Person getPerson(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void save(Person person) {
        person.setId(++PERSON_ID);
        people.add(person);
    }


}
