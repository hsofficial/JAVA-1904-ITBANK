package setterGetter2;

import java.util.regex.Pattern;

public class Member {
	//�ʵ�(private)
	private String name, gender;
	private int age;
	
	//������(default)
	Member(){}
	Member(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		/* ����θ� >>> charAt()���� ���ڸ� �ϳ��� �̾ƿͼ� -> ASCII�ڵ�� �˻�
		 * ���ڿ��� �˻�(String)
		 * ^ : ����
		 * $ : ~����
		 * [] : �ѱ���
		 * [abc] : abc�� �ѱ���
		 * ? : ���� �Ǵ� �ѱ���
		 * * : ���� �Ǵ� ��������
		 * PatternŬ������ matches��� static�޼ҵ尡 �´��� ����
		 */
		if(Pattern.matches("^[��-����-�R]*$", name)) {
			this.name = name;
		}
		else {
			System.out.println("�̸��� �ѱ۷θ� ��ϰ��� �մϴ�.");
		}
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0)
			this.age = age;
		else
			System.out.println("�߸��� �Է��Դϴ�.");
	}
	public void info() {
		System.out.printf("�̸� : %s, ���� : %d, ���� : %s\n",name,age,gender);
	}
}
