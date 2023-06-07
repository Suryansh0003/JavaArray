package pwnew;

class demoo {
	private int age;
	private String name;

	demoo(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	public void show() {
		System.out.println(age + " " + name);
	}

	void setdataandname(int age, String name) {
		this.age = age;
		this.name = name;

	}

	int getAge() {
		return age;

	}

	String getName() {
		return name;
	}

//	void setname(String name) {
//		this.name=name;
//	}

}

public class encapulation {
	public static void main(String[] args) {
		demoo d = new demoo(77, "hydra");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println();
		d.setdataandname(67, "Suryansh");
		int std = d.getAge();
		System.out.println(std);
		d.getName();
		System.out.println(d.getName());

//		d.show();

	}

}
//