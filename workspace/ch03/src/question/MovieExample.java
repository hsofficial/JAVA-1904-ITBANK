package question;

public class MovieExample {
	public static void main(String[] args) {
		/* 제목, 평점, 개봉일, 예매등수를 저장하는 Movie클래스 선언
		 * 인자의 개수에 따라 다른 생성자가 실행되도록 오버로딩하시오
		 * printfInfo()메소드를 만들어 필드의 데이터를 출력되게 하시오
		 */
		//String, double, String, int
		Movie m1 = new Movie("보헤미안 랩소디", 9.5,"2018-10-31", 1);
		m1.printInfo();
		
		Movie m2 = new Movie("신비한 동물들과 그린델왈드의 범죄", 7.74);//String, double
		m2.printInfo();
		
		Movie m3 = new Movie("어벤져스 엔드게임");//String
		m3.printInfo();
	}
}