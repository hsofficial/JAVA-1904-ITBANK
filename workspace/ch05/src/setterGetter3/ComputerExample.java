package setterGetter3;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setCpu("abcsadasdfasdasfasdf"); //�����ڰ� ����
		com.setCpu("Intel Xeon");
		
		//gb��� ���ڰ� �־����
		com.setRam("500mb");
		com.setRam("32gb");
		
		//windows��� ���ڰ� �־����
		com.setOs("linux");
		com.setOs("windows");
		
		com.setPrice(1300000);
		
		com.info();
	}
}
