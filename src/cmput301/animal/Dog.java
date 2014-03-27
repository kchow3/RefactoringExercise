package cmput301.animal;

public class Dog extends Pet {

	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void speak() {
		System.out.println("Dog Barks");
	}
}
