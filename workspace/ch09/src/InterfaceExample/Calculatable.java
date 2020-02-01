package InterfaceExample;

/* A, B팀이 각각 계산기 프로그램을 만들거에요 => 나중에 합칠거야
 * 큰 틀을 잡아준다.
 * 
 * 추상클래스는 상속이 한 번밖에 안되요
 * 인터페이스는 구현을 여러번 할 수 있어요
 * 
 * 조금이라도 클래스내부에서 구현이 되어있으면 추상클래스, 전혀 구현되지 않고 선언만 하면 인터페이스
 */

//추상클래스와 차이점
//1.상속을 여러번할 수 있어(implements)
//2.인터페이스 내부에는 구현부를 적을 수 없다.

public interface Calculatable {
//	public void minus() {System.out.println("빼기기능구현");} interface 내 구현 불가능
	public void setOperands(int first, int second, int third);
	public int sum();
	public int avg();

}
