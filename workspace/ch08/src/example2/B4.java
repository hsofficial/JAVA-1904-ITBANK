package example2;

public class B4 extends Paper {
	public void paperSize() {
		System.out.println("B4용지 : 257mm x 364mm");
	}
	
	@Override
	public void printing() {
		System.out.println("B4용지를 프린트합니다.");
	}
}
