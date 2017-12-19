package day1Exercises.src.day1Exercises;

import java.util.ArrayList;

public class PersonManager {

	ArrayList<Person> personList = new ArrayList<Person>();

	public void outputList() {
		for (Person Pr : personList) {
			System.out.println(Pr);
		}
	}

	public Person findPerson(String name) {
		Person returnedPerson = null;
		for (Person Pr : personList) {
			if (Pr.getName().equals(name)) {
				returnedPerson = Pr;
			}
		}
		return returnedPerson;
	}
}
