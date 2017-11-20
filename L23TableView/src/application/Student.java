package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student 
{
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty name;
	private final SimpleStringProperty surename;
	private final SimpleIntegerProperty age;

	public Student(Integer id, String name, String surename, Integer age) {
		super();
		this.id =new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.surename = new SimpleStringProperty(surename);
		this.age = new SimpleIntegerProperty(age);
	}

	public Integer getId() {
		return id.get();
	}

	public String getName() {
		return name.get();
	}

	public String getSurename() {
		return surename.get();
	}

	public Integer getAge() {
		return age.get();
	}
	
}
