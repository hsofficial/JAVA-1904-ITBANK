package interfaceExample2;

/* 상속과 구현을 동시에 할때는 상속을 먼저 적어주고 구현을 젃는다(extends > implements)
 * class는 다중 상속이 불가능하나 interface는 다중 구현이 가능함
 * RemoteControl는 사실 적을 필요없음 > 상속받은 TV가 다 구현해 둠
 */

public class SmartTv extends TV implements Searchable, RemoteControl{

	@Override
	public void search(String url) {
		System.out.println("검색 : " + url);
		
	}

}
