package inheritancejava;

public abstract class Animal {
	private String name;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//abstract method
	public abstract String getAnimalName();
//commited for the master
}
