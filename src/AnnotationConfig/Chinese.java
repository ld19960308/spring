package AnnotationConfig;

public class Chinese {
	private Axe axe;
	private String name;
	public Axe getAxe() {
		return axe;
	}
	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public void use(){
    	axe.use();
    }
}
