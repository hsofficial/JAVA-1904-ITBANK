package question2;

public class Man {
	
	String name;
	Man(String name){
		this.name = name;
	}
	void give(Companion a){
		if(a instanceof Friend)
			System.out.println(this.name + "이 "+a.getName()+"에게 "+a.getFood()+"를 준다.");
			
		else if(a instanceof Animal)
			System.out.println(this.name + "이 "+a.getName()+"에게 "+a.getFood()+"를 먹이로 준다.");
		
		else
			System.out.println("오류");
	}
}
