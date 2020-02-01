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
			System.out.println("����� �� ���� ���μ����Դϴ�.");
		else
			this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		//GB => GB��� ���ڰ� �ִ��� �˻�
		//String.indexof() : ���ڿ����� ã�� ���� �ε�����ȣ ��ȯ / �ƴϸ� -1 ��ȯ
//		if(ram.indexOf("GB") == -1 || ram.indexOf("gb") == -1 )
//			System.out.println("����� �� ���� �޸� �Դϴ�.");
		//toUpperCase() : �빮�ڷ� �ٲ��ִ� �޼ҵ�
		if(ram.toUpperCase().indexOf("GB") == -1)
			System.out.println("����� �� ���� �޸� �Դϴ�.");
		else
			this.ram = ram;
	}
	
	public String getOs() {
		return os;
	}
	
	public void setOs(String os) {
		//Windows�� �Ѱ������ �۵��ϵ���
		if(os.toUpperCase().indexOf("WINDOWS") == -1)
			System.out.println("Windows�� �ƴϰų� �߸��� �ü���Դϴ�.");
		this.os = os;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("�߸��� �Է°��Դϴ�.");
	}
	
	public void info() {
		System.out.println("�ü�� : " + os);
		System.out.println("RAM : " + ram);
		System.out.println("CPU : " + cpu);
		DecimalFormat df = new DecimalFormat("#,###");
		String priceDf = df.format(price);
		System.out.println("���� : " + priceDf);
	}
	

}
