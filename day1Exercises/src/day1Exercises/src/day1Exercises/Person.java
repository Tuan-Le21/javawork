package day1Exercises.src.day1Exercises;

public class Person {
	// first declare the dataTypes
	private String name;
	private int age;
	private String jobTitle;

	// This is the constructor
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

	}

	// This is how to get the name to the dataType.
	public void setName(String getName) {
		this.name = getName;

	}

	// This is how to assign the age to the dataType
	public void setAge(int getAge) {
		this.age = getAge;

	}

	// This is how to assign the jobTitle to the dataType.
	public void setJobTitle(String getJobTitle) {
		this.jobTitle = getJobTitle;

	}

	// Method to return all three of these in a formatted string
	public String toString() {
		return "Name: " + name + " Age: " + age + " Job Title: " + jobTitle;

	}

	public String getName() {
		return name;
	}

}
