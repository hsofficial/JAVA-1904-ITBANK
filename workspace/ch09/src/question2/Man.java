package question2;

public class Man {
	
	String name;
	Man(String name){
		this.name = name;
	}
	void give(Companion a){
		if(a instanceof Friend)
			System.out.println(this.name + "�� "+a.getName()+"���� "+a.getFood()+"�� �ش�.");
			
		else if(a instanceof Animal)
			System.out.println(this.name + "�� "+a.getName()+"���� "+a.getFood()+"�� ���̷� �ش�.");
		
		else
			System.out.println("����");
	}
}
