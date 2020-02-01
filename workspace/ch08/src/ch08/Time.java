package ch08;

//final 클래스 : 상속할 수 없는 클래스
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
	
	//큰타입은 작은타입을 다받아먹을 수 있어요
	//객체중에서 가장 큰 타입 Object
	//double = int
	//Object = Time
	//obj = bPlan
	
	@Override	//Object클래스의 equals를 오버라이딩
	public boolean equals(Object obj) {//Object클래스 형태로 매개변수 => 모든 클래스의 객체를 받아먹을거야
		/* instanceof : obj객체가 어느 클래스를 참조하고 있는지 여부를 검사
		 * 해당클래스의 객체를 가지고 있으면 true 아니면 false
		 * 기존의 equals메소드를 Time클래스로 만든 객체의 값을 비교하는 기능으로 바꾸겠다.(overriding)
		 */
		if(obj instanceof Time) {
			Time target = (Time)obj; //Object가 큰놈 => Time작은놈 >>> 강제형변환 time
			if(this.hour == target.getHour() && this.minute == target.getMinute()
					&&this.second == target.getSecond()) {
				return true;
			}
		}
		//Time클래스로 만든 객체가 아니거나 서로의 필드가 값이 달라요 => false
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
