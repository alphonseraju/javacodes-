package StudentClass;

public class exampleoverRiding {
	public class Animal {
	    public void makeSound() {
	        System.out.println("Generic Animal Sound");
	    }
	}

	public class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Bark");
	    }
	}


}
