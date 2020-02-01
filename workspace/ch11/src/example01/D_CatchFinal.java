package example01;

public class D_CatchFinal {
	public static void main(String[] args) {
		/* try{
		 * 	예외가 발생할 가능성이 있는 문장
		 * }catch(Exception e){
		 * 	예외 처리문장
		 * }finally{
		 * 	예외의 발생여부와 상관없이 마지막에 수행되는 문장
		 * }
		 * try에서 메모리할당을 했어 에러메시지가 떠요 다쓰고 해제를 해야겠죠?
		 * finally에서 합니다.
		 */
		String[] name = new String[2];
		try {
			name[0] = "송진우";
			System.out.println("이름 : " + name[0]);
			
			name[1] = "송동열";
			System.out.println("이름 : " + name[1]);
			
			name[2] = "송보민";
			System.out.println("이름 : " + name[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 참조 에러 발생");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally { //예외가 발생되든 안발생되든 무조건 실행되는 문장
			System.out.println("시스템 종료");
		}

	}

}
