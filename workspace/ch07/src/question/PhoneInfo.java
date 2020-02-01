package question;

//superclass family
public class PhoneInfo {
	public String name;
	public String number;
	
	PhoneInfo(String name, String number){
		this.name = name;
		this.number = number;
	}
	void showInfo() {
		System.out.println(this.name + this.number);
	}
}
