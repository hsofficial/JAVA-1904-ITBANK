package localinnerClass;

public class InnerExample {
	public static void main(String[] args) {
//		Outer.Inner : Ŭ������(�ڷ���)
//		new Outer() : ������ ȣ��
//  	Inner inner = new Inner();
		Outer outer = new Outer(); //�ٱ� Ŭ���� ��ü ����
		Outer.Inner inner = outer.new Inner(); 
		
		inner.show();
	}
}