package com.samsung;

import com.hwajin.Handle;

public class Car {
	public static void main(String[] args) {
		//���� �ٸ� ��Ű��(ȸ��)�� �ٷ� ����� �ȵ�
		//������ : ����� ������
		Handle handle = new Handle();
		//��Ű������ �� ������ import���̵� ��밡��
		kr.co.kumho.Tire tire = new kr.co.kumho.Tire();
		
		handle.run();
		tire.run();
	}
}
