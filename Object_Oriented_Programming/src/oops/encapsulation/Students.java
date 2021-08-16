package oops.encapsulation;

public class Students {
	
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=21) {
			System.out.println("Invalid age for a student");
		} else {
			this.age = age;
		}

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
