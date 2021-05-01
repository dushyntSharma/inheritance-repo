package inheritancejava;

public class Cat extends Animal {
	private byte age;
	private int height;

	public Cat(byte age, int height) {
		super();
		this.age = age;
		this.height = height;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, byte age, int height) {
		super(name);
		// TODO Auto-generated constructor stub
		this.age = age;
		this.height = height;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "Cat";
	}

}
