package setterGetter2;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member("나현수",22,"남자");
		member1.info();
		
		Member member2 = new Member("송동열", 30, "남자");
		member2.setName("☆★"); //잘못된 데이터 => setter가 걸러줘야함
		member2.setName("이지동");
		member2.info();
	}
	
}
