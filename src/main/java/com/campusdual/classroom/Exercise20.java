package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        ArrayList<Person> PeopleList = new ArrayList<Person>();
        Person p = new Person("John", "Smith");
        Person t = new Teacher("María", "Montessori", "Educación");
        Person po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Person d = new Doctor("Gregory", "House", "Nefrología e infectología");
        PeopleList.add(p);
        PeopleList.add(t);
        PeopleList.add(po);
        PeopleList.add(d);

        return PeopleList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.get(i).getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
