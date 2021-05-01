package inheritancejava;

public class InheritanceApp {
	public static void main(String[] args) {

		Cat tom = new Cat("Tom", (byte) 3, 20);
		Cat cat2 = new AsianCat("ATom", (byte) 2, 19);

		System.out.println("name: " + tom.getName());
		System.out.println("animalName: " + tom.getAnimalName());
		System.out.println("Age: " + tom.getAge());
		System.out.println("Height: " + tom.getHeight());

		System.out.println("-----------------");

		System.out.println("name: " + cat2.getName());
		System.out.println("age: " + cat2.getAge());
		System.out.println("Animal Name of cat2: " + cat2.getAnimalName());
	}

}
