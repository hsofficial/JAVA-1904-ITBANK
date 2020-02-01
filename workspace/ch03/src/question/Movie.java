package question;

public class Movie {
	String name = "영화제목";
	double score = 0.0;
	String opendate = "YYYY-MM-DD";
	int chart = 0;
	public void printInfo() {
		System.out.println("영화명 : " + name);
		System.out.println("평점 : " + score);
		System.out.println("개봉일 : " + opendate);
		System.out.println("예매등수 : " + chart);
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
