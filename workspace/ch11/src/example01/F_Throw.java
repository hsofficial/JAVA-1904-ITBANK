package example01;

public class F_Throw {
	public static void main(String[] args) {
		//메소드를 사용할때 예외처리를 해야 사용할 수 있게 만들어진 메소드들이 있어요
		try {
			findClass();			
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}catch(InstantiationException e) {
			
		}catch(IllegalAccessException e) {
			
		}
	}
	/* 1.한 예외상황에서 여러가지 처리방법이 필요할 때 사용
	 * 
	 * 2.명시적으로 예외를 확인하기 위해서
	 * 메소드 옆에다가 throws ClassNotFoundException 이 메소드에서 이런 예외가 발생할거야~
	 * 
	 * 3.해당 부분의 소스를 단순화 하고싶을때
	 * 예외처리 코드가 너무 길어지면 메소드를 만들어서 다른 곳으로 빼버린다.
	 */
	
	
	//findClass()를 호출한 main메소드로 ClassNotFoundException를 던져줄거야~
	private static void findClass() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Class 클래스의 forName메소드 
		//존재하는 타입이면 그 클래스의 객체형태를 반환
		String name1 = "진우";
		Class obj = Class.forName("java.lang.String");
		String name = obj.getName();	//클래스의 이름을 반환하는 메소드
		//newInstance : 클래스형태의 객체를 만들어주는 메소드
		String str = (String)obj.newInstance();
		str = "진우";
		System.out.println(str);
	}
}
