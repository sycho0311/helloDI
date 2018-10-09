package kr.ac.hansung.cse;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PetOwner {

	// 한번 설정한 AnimalType이 변경되지 않음.
	private final AnimalType animal;

	/*
	// 스프링컨테이너를 통해 Bean을 설정 및 생성, 관리 
	// 생성자를 통해 미리 설정한 AnimalType 값으로 주입시킨다.
	public PetOwner(AnimalType animal) {
		super();
		this.animal = animal;
	}
	*/

	public void play() {
		animal.sound();
	}
}
