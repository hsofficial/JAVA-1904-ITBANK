package question2;

public class Friend extends Man implements Companion{
	Friend(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return name;
	}
	
	String food = "���";
	
	@Override
	public String getFood() {
		return food;
	}
}
