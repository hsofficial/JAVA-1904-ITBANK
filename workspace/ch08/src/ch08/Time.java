package ch08;

//final Ŭ���� : ����� �� ���� Ŭ����
public final class Time {

	private int hour;
	private int minute;
	private int second;
	Time(){}
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//ūŸ���� ����Ÿ���� �ٹ޾Ƹ��� �� �־��
	//��ü�߿��� ���� ū Ÿ�� Object
	//double = int
	//Object = Time
	//obj = bPlan
	
	@Override	//ObjectŬ������ equals�� �������̵�
	public boolean equals(Object obj) {//ObjectŬ���� ���·� �Ű����� => ��� Ŭ������ ��ü�� �޾Ƹ����ž�
		/* instanceof : obj��ü�� ��� Ŭ������ �����ϰ� �ִ��� ���θ� �˻�
		 * �ش�Ŭ������ ��ü�� ������ ������ true �ƴϸ� false
		 * ������ equals�޼ҵ带 TimeŬ������ ���� ��ü�� ���� ���ϴ� ������� �ٲٰڴ�.(overriding)
		 */
		if(obj instanceof Time) {
			Time target = (Time)obj; //Object�� ū�� => Time������ >>> ��������ȯ time
			if(this.hour == target.getHour() && this.minute == target.getMinute()
					&&this.second == target.getSecond()) {
				return true;
			}
		}
		//TimeŬ������ ���� ��ü�� �ƴϰų� ������ �ʵ尡 ���� �޶�� => false
		return false;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
