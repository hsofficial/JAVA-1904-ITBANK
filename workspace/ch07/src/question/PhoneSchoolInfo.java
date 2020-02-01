package question;

//subclass ÇÐ¿ì
public class PhoneSchoolInfo extends PhoneInfo{
	public String dept;
	public int schoolyear;
	
	public PhoneSchoolInfo(String name, String number, String dept, int schoolyear){
		super(name, number);
		this.dept = dept;
		this.schoolyear = schoolyear;
	}
	@Override
	void showInfo() {
		System.out.println(this.name + this.number + this.dept + this.schoolyear);
	}
}
