package example2;

public class PointExample {
	public static void main(String[] args) {
		Point3D point = new Point3D(5, 7, 10);
		
		//부모필드
		System.out.println("x : " + point.x);
		System.out.println("y : " + point.y);
		//자식필드
		System.out.println("z : " + point.z);
		point.show();
	}
}
