package setterGetter3;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setCpu("abcsadasdfasdasfasdf"); //열글자가 넘음
		com.setCpu("Intel Xeon");
		
		//gb라는 글자가 있어야함
		com.setRam("500mb");
		com.setRam("32gb");
		
		//windows라는 글자가 있어야함
		com.setOs("linux");
		com.setOs("windows");
		
		com.setPrice(1300000);
		
		com.info();
	}
}
