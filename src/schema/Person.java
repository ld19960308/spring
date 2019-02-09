package schema;

import java.util.*;

public class Person {
	private Axe axe;
	private int age;
	private List schools;
	private Map Scores;
	private Set axes;
	public Axe getAxe() {
		return axe;
	}
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List getSchools() {
		return schools;
	}
	public void setSchools(List schools) {
		this.schools = schools;
	}
	public Map getScores() {
		return Scores;
	}
	public void setScores(Map scores) {
		Scores = scores;
	}
	public Set getAxes() {
		return axes;
	}
	public void setAxes(Set axes) {
		this.axes = axes;
	}

}
