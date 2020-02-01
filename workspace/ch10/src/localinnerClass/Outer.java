package localinnerClass;

public class Outer {
	/* ��ø, inner, nested class��� �θ��ϴ�.
	 * class���ο� �� �ٸ� class�� ���ԵǴ� ����
	 * ��Ӱ� ����� ����
	 * �ٱ����� Ŭ���� : �θ�
	 * ������ Ŭ���� : �ڽ�
	 * �ڽ��� �θ��� ��� ����� ����(extends, implements���̵� ����)
	 * UI���α׷��ֿ� ���� ���Դϴ�.
	 */
	String f = "OuterField";
	void method() {
		System.out.println("OuterMethod");
	}
	class Inner{
		//Ŭ������ 3��� : ������, �ʵ�, �޼ҵ�
		Inner(){}//�����ڰ� ȣ��Ǿ�� ��ü ����
		String f = "InnerField";
		void method() {
			System.out.println("InnerMethod");
		}
		void show() {
			System.out.println("inner field : " + this.f);
			//����� ���� �ʾƵ� �θ� Ŭ���� ���� ����
			System.out.println("outer field : " + f);
			
			this.method(); //InnerŬ������ �޼ҵ�
			Outer.this.method(); //OuterŬ������ �޼ҵ�
		}
	}
}




