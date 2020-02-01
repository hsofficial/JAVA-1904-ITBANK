package example2;

public class A4 extends Paper {
	public void paperSize() {
		System.out.println("A4용지 : 210mm x 297mm");
	}
	
	@Override
	public void printing() {
		System.out.println("A4용지를 프린트합니다.");
	}
}
