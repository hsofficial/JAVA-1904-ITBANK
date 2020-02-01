package question;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Phone {
	private static String company;
	private String model;
	private static double promotion;
	private int price;
	private double promo_price;
	
	public String getCompany() {
		return company;
	}
	public static void setCompany(String c) {
		company = c;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(Pattern.matches("^[A-Z a-z 0-9 -]*$", model)) {
			this.model = model;
		}
		else {
			System.out.println("이름은 영어/숫자로만 등록가능 합니다.");
		}
	}
	public double getPromotion() {
		return promotion;
	}
	public static void setPromotion(double p) {
		promotion = p;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0 && price <= 3000000)
			this.price = price;
		else
			System.out.println("잘못된 입력값입니다.");
	}
	public void info() {
		promo_price = price - ( price * (promotion / 100) );
		System.out.println("제조사 : " + company);
		
		System.out.println("모델명 : " + model);
		
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDf = df.format(price);
		System.out.println("정가 : " + priceDf);
		
		DecimalFormat df1 = new DecimalFormat("#,###");
		String promo_priceDf = df1.format(promo_price);
		System.out.println("구매가 : " + promo_priceDf);
	}
	
}
