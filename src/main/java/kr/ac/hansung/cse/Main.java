package kr.ac.hansung.cse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Spring Container를 생성하여 초기 설정을 마친다.
		// Bean 생성 및 관리
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/ac/hansung/cse/conf/animal.xml");
		
		// Container에서 생성한 Bean을 가져와서 사용한다.
		// 이미 주입된 값들을 바로 가져와서 사용할 수 있음.
		PetOwner person = (PetOwner)context.getBean("petowner");
		
		person.play();
		
		context.close();
	}

}
