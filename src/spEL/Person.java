package spEL;

import java.util.Date;

public class Person {
	private int age;
	private String name;
	private Date bir;
	public Person(int age, String name, Date bir) {
		super();
		this.age = age;
		this.name = name;
		this.bir = bir;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBir() {
		return bir;
	}
	public void setBir(Date bir) {
		this.bir = bir;
	}

}
