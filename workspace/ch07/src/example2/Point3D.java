package example2;

public class Point3D extends Point{
	int z;
	
	/* this : �� ��ü
	 * super : �θ� Ŭ����
	 * Point3D������ ȣ�� => �θ������ ȣ�� => �θ������ ���� => �� ������ ����
	 * �����ڸ� ȣ������ ������ ��ü�� ������ �ȵ�
	 * ��ӹ޴´ٰ� ���� �ƴ϶� �θ�����ڸ� ȣ���ؼ� �θ�ü�� ���;���
	 */
	
	void show() {
		System.out.println(this.x + ", " + this.y);
		System.out.println(super.x + ", " + super.y);
	}
	
	Point3D(int x, int y, int z){
		super(x, y);
		//�θ�Ŭ������ �����ڿ� �Ű������� �������� ���ڸ� ���� => �θ� ��ü�� ����
		
		//super();
		this.z = z;
	}

}
