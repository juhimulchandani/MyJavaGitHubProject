package com.lti.demo;

public class Person {
	private String personName;
	private int personAge;
	private double personSal;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, int personAge, double personSal) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personSal = personSal;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public double getPersonSal() {
		return personSal;
	}
	public void setPersonSal(double personSal) {
		this.personSal = personSal;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personSal=" + personSal + "]";
	}
	
}
