package example01;

public class C_CatchBlock {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}  catch (ArithmeticException e) {
			System.out.println("ArithmeticException발생");
			//printStackTrace : 예외 발생 당시의 호출스택에 있던 메소드의 정보와 예외 메시지를 화면에 출력
			e.printStackTrace();
			//getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지 얻음
			System.out.println(e.getMessage());
			System.out.println(4);
			//Exception >> Object와 유사함(예외클래스의 최상위 클래스)
		} catch(Exception e) { //ArithmeticException예외를 제외한 모든 예외처리
			System.out.println("Exception");
		}
	}
}
