package question;

public class PhoneExample {
		public static void main(String[] args) {
			PhoneInfo familly = new PhoneInfo("������","010-1234-5678");
			PhoneSchoolInfo school = new PhoneSchoolInfo("������", "010-1111-1111", "������", 3);
			PhoneCompanyInfo company = new PhoneCompanyInfo("������", "010-2222-2222", "�����");
			
			//showInfo()��� �޼ҵ尡 Ŭ�������� �ٸ��� �۵��ϵ��� �������̵�
			//�̸� : �۵���, ��ȣ : 010-5567-1430
			//�̸� : ������, ��ȣ : 010-1111-1111, ���� : ������, �г� : 3
			//�̸� : ���¹�, ��ȣ : 010-2222-2222, �μ� : �����
			familly.showInfo();
			school.showInfo();
			company.showInfo();
	}

}
