package question;

//subclass ȸ�絿��
public class PhoneCompanyInfo extends PhoneInfo {
	public String dept;
	public PhoneCompanyInfo(String name, String number, String dept) {
		super(name, number);
		this.dept = dept;
	}
	@Override
	void showInfo() {
		System.out.println(this.name + this.number + this.dept);
	}
}
