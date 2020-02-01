package array2;

//자료형 클래스
public class Member {
	private String name;
	private String id, password;
	private int age;
	Member(){}//디폴트 생성자
	Member(String name, String id, String password, int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
