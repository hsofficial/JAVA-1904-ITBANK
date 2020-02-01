package class3;

public class Busan {
	//필드
	String city = "부산";
	String houseName;
	String houseNumber;
	
	//생성자
	//이름이 같으면 매개변수인지 필드인지 구분 불가
	//함수에서는 매개변수가 우선
	//this. : 내 객체의 필드
	public Busan(String houseName, String houseNumber) {
		this.houseName = houseName;
		this.houseNumber = houseNumber;
		
	}
}
