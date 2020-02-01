package question;

public class PhoneExample {
	public static void main(String[] args) {
		//모든 핸드폰 할인률(static) : 20.5%
		Phone.setPromotion(20.5);
		Phone.setCompany("Samsung");//핸드폰제조회사
		
		Phone hp1 = new Phone();
		//모델명(제약 : 영문 + 숫자만 가능하도록)
		hp1.setModel("SM-F900");
		//가격(제약 : 음수이거나 300만원을 초과할 수 없도록)
		hp1.setPrice(2223000);
		hp1.info();
		/* 회사 : Apple
		 * 모델명 : xr
		 * 정가 : 1200000
		 * 할인가 : 954000
		 */
	}

}
