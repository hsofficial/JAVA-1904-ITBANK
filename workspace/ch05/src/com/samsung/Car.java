package com.samsung;

import com.hwajin.Handle;

public class Car {
	public static void main(String[] args) {
		//서로 다른 패키지(회사)라서 바로 사용이 안됨
		//리눅스 : 상대경로 절대경로
		Handle handle = new Handle();
		//패키지명을 다 적으면 import없이도 사용가능
		kr.co.kumho.Tire tire = new kr.co.kumho.Tire();
		
		handle.run();
		tire.run();
	}
}
