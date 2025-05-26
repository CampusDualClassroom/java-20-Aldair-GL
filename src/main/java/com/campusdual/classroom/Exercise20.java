package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> persons = new ArrayList<>();
        Person personA = new Person("Aldair", "Azpeitia");
        Teacher teach = new Teacher("Isidro","Cartalla","Math");
        PoliceOfficer polOff = new PoliceOfficer("James","Lannister","Kings´s Bodyguard");
        Doctor doc = new Doctor("Pedro","Alcazar","Otorrino");


        persons.add(personA);
        persons.add(teach);
        persons.add(polOff);
        persons.add(doc);

        return persons;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person person : stringList) {
          person.getDetails();
        }

    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
