package example4;

public class Fruit {
	//�����ε� : �Ű������� ���� �ٸ� �޼ҵ尡 ����Ǵ� ��
	//�������̵� : ������ �޼ҵ忡 �ٸ������ �߰�
	
	int price;
	double gram;
	
	Fruit(int price, double gram){
		this.price = price;
		this.gram = gram;
	}
	void info() {
		System.out.printf("���� : %d��, ���� : %.2f(g)\n",this.price, this.gram);
	}
}
