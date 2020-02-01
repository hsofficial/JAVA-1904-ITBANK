package toStringExample;

class Card{
	String kind;
	int num;
	Card(){ 
		this.kind = "SPADE";
		this.num = 1;
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return "종류 : " + kind + ", 숫자 : " + num;
	}
}

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		//객체들을 바로 출력하면 객체.toString()메소드 호출
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(c1.toString());
	}
}
