package question;

public abstract class People {
	/* �ʵ� : �̸�, ����, ���, �б�
	 * �ʵ忡 ���� �Է¹޴� ������ ����
	 * �ڽ��� �ʵ��� ���� �˷��ִ� talk �߻�޼ҵ� ����
	 */
	String name;
	String hobby;
	String school;
	int age;
	
	public People(String name, String hobby, String school, int age) {
		this.name = name;
		this.hobby = hobby;
		this.school = school;
		this.age = age;
	}		
	abstract void talk();
}
