package question2;

public class Animal implements Companion {
	
	String name;
	String food;
	
	Animal(String name){
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getFood() {
		return food;
	}
}
