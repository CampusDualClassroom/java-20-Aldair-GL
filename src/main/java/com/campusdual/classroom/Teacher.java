package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails() {
		System.out.println("Teacher " + name + " " + surname + ", del area " + area.toLowerCase());
	}
}
