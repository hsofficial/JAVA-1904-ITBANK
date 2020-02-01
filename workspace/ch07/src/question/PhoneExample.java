package question;

public class PhoneExample {
		public static void main(String[] args) {
			PhoneInfo familly = new PhoneInfo("이지금","010-1234-5678");
			PhoneSchoolInfo school = new PhoneSchoolInfo("이지은", "010-1111-1111", "예술대", 3);
			PhoneCompanyInfo company = new PhoneCompanyInfo("이지동", "010-2222-2222", "강사부");
			
			//showInfo()라는 메소드가 클래스마다 다르게 작동하도록 오버라이딩
			//이름 : 송동열, 번호 : 010-5567-1430
			//이름 : 송진우, 번호 : 010-1111-1111, 전공 : 디자인, 학년 : 3
			//이름 : 김태문, 번호 : 010-2222-2222, 부서 : 강사부
			familly.showInfo();
			school.showInfo();
			company.showInfo();
	}

}
