package class6;

public class RectangleExample {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		
		System.out.println(rec.area(5.5));	//double
		
		System.out.println(rec.area(5));	//int
		
		System.out.println(rec.area(6,3));	//double x2
	}
}
