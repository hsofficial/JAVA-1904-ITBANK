package class6;

public class Rectangle {
	/* Method Overloading
	 * �޼ҵ���� ���Ƶ� �ٸ� ����� �� �� ����
	 * �Ű������� Ÿ�� �Ǵ� ������ �ٸ� ��� �޼ҵ�� �ߺ� ���
	 * ��ȯ���� �ν����� �ƴ���(��ȯ������ ����)
	 */
	double area(double width) { //���簢���� ���̸� ���ϴ� �޼ҵ�(double)
		return width * width;
	}
	int area(int width) { //���簢���� ���̸� ���ϴ� �޼ҵ�(int)
		return width * width;
	}
//	double area(int width) { //�Ű������� �޶�� �����ε����� (��ȯ���� �������)
//		return (double)width * width;
//	}
	double area(double width, double height) { //���簢���� ���̸� ���ϴ� �޼ҵ�
		return width * height;
	}
}
