package example2;

public class Point3D extends Point{
	int z;
	
	/* this : 내 객체
	 * super : 부모 클래스
	 * Point3D생성자 호출 => 부모생성자 호출 => 부모생성자 종료 => 내 생성자 종료
	 * 생성자를 호출하지 않으면 객체가 생성이 안됨
	 * 상속받는다고 끝이 아니라 부모생성자를 호출해서 부모객체를 들고와야함
	 */
	
	void show() {
		System.out.println(this.x + ", " + this.y);
		System.out.println(super.x + ", " + super.y);
	}
	
	Point3D(int x, int y, int z){
		super(x, y);
		//부모클래스의 생성자에 매개변수가 있을때는 인자를 전달 => 부모 객체를 생성
		
		//super();
		this.z = z;
	}

}
