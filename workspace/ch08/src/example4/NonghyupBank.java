package example4;

public class NonghyupBank extends Bank{
	public NonghyupBank(String name, int maxCount) {
		super(name, maxCount);
	}

	@Override
	public void counting() {	//¹Ì³³È½¼ö°¡ ¿Ã¶ó°¡´Â ¸Þ¼Òµå
		count++;
		if(count <= maxCount) {
			System.out.println("¹Ì³³È½¼ö : " + count + " / " + maxCount);
		}
		else {
			System.out.println("³óÇùÀºÇà ¹Ì³³È½¼ö°¡ ÃÊ°úµÇ¾ú½À´Ï´Ù.");
		}
	}
}
