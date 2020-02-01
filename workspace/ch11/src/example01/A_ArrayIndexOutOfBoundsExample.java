package example01;

public class A_ArrayIndexOutOfBoundsExample {
	//String[] args :  매개변수 >> main 함수를 호출할 때 넣어주는 매개변수
	//run configurations에 있는 arguments에 값을 넣어주면 매개변수로 저장
	//1 3 => args[0] = 1; args[1] = 3
	//args[2]배열이 된다
	public static void main(String[] args) {
		try {// 예외가 발생할 것 같은 코드를 try 블록에 넣어줌
			String data1 = args[0];
			String data2 = args[1];
			
			//ArrayIndexOutOfBoundsException형태의 예외가 발생
			//catch메소드에게 ArrayIndexOutOfBoundsException형태의 인자를 전달
			String data3 = args[2]; //없는 인덱스 접근
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println(num1 + num2);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		}
		catch(Exception e) {
			System.out.println("알 수 없는 오류입니다.");
		}
	}
}
