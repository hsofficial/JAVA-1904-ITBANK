package question;

public class Movie {
	String name = "��ȭ����";
	double score = 0.0;
	String opendate = "YYYY-MM-DD";
	int chart = 0;
	public void printInfo() {
		System.out.println("��ȭ�� : " + name);
		System.out.println("���� : " + score);
		System.out.println("������ : " + opendate);
		System.out.println("���ŵ�� : " + chart);
	}
	
	public Movie(String name, double score, String opendate, int chart) {
		this.name = name;
		this.score = score;
		this.opendate = opendate;
		this.chart = chart;
	}
	public Movie(String name, double score) {
		this.name = name;
		this.score = score;
	}
	public Movie(String name) {
		this.name = name;
	}
}
