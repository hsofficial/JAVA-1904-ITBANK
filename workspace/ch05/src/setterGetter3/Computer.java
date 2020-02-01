package setterGetter3;

import java.text.DecimalFormat;

public class Computer {
	private String cpu;
	private String ram;
	private String os;
	private int price;
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		if(cpu.length() > 10)
			System.out.println("등록할 수 없는 프로세서입니다.");
		else
			this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		//GB => GB라는 글자가 있는지 검사
		//String.indexof() : 문자열에서 찾는 값의 인덱스번호 반환 / 아니면 -1 반환
//		if(ram.indexOf("GB") == -1 || ram.indexOf("gb") == -1 )
//			System.out.println("등록할 수 없는 메모리 입니다.");
		//toUpperCase() : 대문자로 바꿔주는 메소드
		if(ram.toUpperCase().indexOf("GB") == -1)
			System.out.println("등록할 수 없는 메모리 입니다.");
		else
			this.ram = ram;
	}
	
	public String getOs() {
		return os;
	}
	
	public void setOs(String os) {
		//Windows를 넘겨줘야지 작동하도록
		if(os.toUpperCase().indexOf("WINDOWS") == -1)
			System.out.println("Windows가 아니거나 잘못된 운영체제입니다.");
		this.os = os;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("잘못된 입력값입니다.");
	}
	
	public void info() {
		System.out.println("운영체제 : " + os);
		System.out.println("RAM : " + ram);
		System.out.println("CPU : " + cpu);
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDf = df.format(price);
		System.out.println("가격 : " + priceDf);
	}
	

}
