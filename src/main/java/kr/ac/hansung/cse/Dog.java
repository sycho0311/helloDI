package kr.ac.hansung.cse;

import lombok.Setter;

@Setter
public class Dog implements AnimalType {

	private String myName;

	/*
	// 의존성 주입을 통해 myName의 값을 외부로부터 받아와서 초기 설정을 한다.
	// lombok 라이브러리를 통해 설정 가능 -> 코드를 줄일 수 있음.
	public void setMyName(String myName) {
		this.myName = myName;
	}
	*/

	@Override
	public void sound() {
		System.out.println("Dog name is " + myName + " : Bow Wow");
	}

}
