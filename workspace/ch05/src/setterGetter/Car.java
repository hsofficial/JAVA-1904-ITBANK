package setterGetter;

public class Car {
	//보통 필드는 private으로 많이 선언
		private String ownerName;
		private String carName;
		private int price;
		
		//생성자(default)
		Car(String ownerName, String carName, int price){
			this.ownerName = ownerName;
			this.carName = carName;
			this.price = price;
		}
		
		//Setter, Getter : 데이터를 넣을때는 setter, 데이터를 가져갈때는 getter
		void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		String getOwnerName() {
			return this.ownerName;
		}
		//필드를 전부 private으로 제한 => 내 클래스 내부에서만 접근가능
		//올바른 데이터가 들어가도록 검사 후 넣기
		void setPrice(int price) {
			if(price >= 0)
				this.price = price;
			else
				System.out.println("잘못된 입력입니다.");
		}
}
