package inheritancejava;

public class AsianCat extends Cat {
	public AsianCat(String name, byte age, int height) {
		super(name, age, height);
	}
	
	//override method of Cat class 
	public String getAnimalName() {
		return "AsianCat";
	}
	
	//commented for the master
}
