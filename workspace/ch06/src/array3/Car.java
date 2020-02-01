package array3;

import java.text.DecimalFormat;

public class Car {
	private String ownerName;
	private String carName;
	private int price;
	
	Car(){}
	Car(String ownerName, String carName, int price){
		this.ownerName = ownerName;
		this.carName = carName;
		this.price = price;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void info() {
		System.out.println("---------------------");
		System.out.println("소유자 : " + ownerName);
		System.out.println("모델명 : " + carName);
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDf = df.format(price);
		System.out.println("가격 : " + priceDf);
	}
	
}
