package question2;

public class ManExample {
	public static void main(String[] args) {
		Man song = new Man("송진우");
		Cat c01 = new Cat("치즈");
		Dog d01 = new Dog("까미");
		Friend f01 = new Friend("홍인호");
		
		song.give(c01); //송진우가 치즈에게 생선을 줬다.
		song.give(d01); //송진우가 까미에게 개껌을 줬다.
		song.give(f01); //송진우가 홍인호에게 라면을 끓여줬다.
	}
}
