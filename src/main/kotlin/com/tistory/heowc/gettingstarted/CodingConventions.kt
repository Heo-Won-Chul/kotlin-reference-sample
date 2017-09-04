package com.tistory.heowc.gettingstarted

class CodingConventions {
	/*
		네이밍 스타일
		- 이름은 카멜케이스 사용(언더스코어를 피해라)
		- 타입은 대문자로 사용
		- 메소드와 프로퍼티는 소문자로 시작
		- 들여쓰기는 4칸 사용
		- public funtion에는 Kotlin Doc에 나타나는 것과 같은 문서 존재.
	*/


	/*
		콜론
		- 유형과 슈퍼 유형 구분 시, 앞에 공백 O
		- 인스턴스와 유형 구분 시, 앞에 공백 X
	*/
	interface Foo<out T : Any> {
		fun Foo(a: Int): T
	}


	/*
		람다
		- 람다 식에서는 화살표 주위 뿐만 아니라 중괄호 주위에도 공백을 사용.
	*/
	fun getFilteredAndMultiple(list: List<Int>): List<Int> {
		return list.filter { it > 10 }.map { element -> element * 2 }
	}


	/*
		클래스
		- 매개변수가 적은 클래스는 한 줄로 작성.
	*/

	open class Human(id: Int, name: String)

	/*
		더 헤더가 있는 클래스는 생성자의 매개변수가 들여쓰기가 있는 별도의 줄로 서식을 지정
		상속을 사용하면 슈퍼클래스나 인터페이스는 같은이 괄호와 같은 줄에 존재
	*/

	class Person(
			id: Int,
			name: String,
			surname: String
	) : Human(id, name) {
		// ...
	}

	/*
		다중 인터페이스의 경우 슈퍼 클래스가 먼저 위치
		각 인터페이스는 다른 행에 위치
	*/
	interface KotlinMaker {

	}

	class PersonImpl(
			id: Int,
			name: String,
			surname: String
	) : Human(id, name),
		KotlinMaker {
		// ...
	}

	/*
		생성자의 매개변수는 기본 들여쓰기 또는 연속 들여쓰기(일반 들여쓰기의 두배)를 사용
	*/


	/*
		단위
		- 함수가 Unit을 반환하면 생략
	*/
	fun bar() {
		// ...
	}


	/*
		함수 vs 프로퍼티
		- 매개변수가 없는 함수의 경우에는 읽기전용 프로퍼티와 호환
		- 다음과 같은 경우 함수에 대한 속성을 선호
			1. 어떤 예외도 던지지 않는다
			2. 복잡성 O(1)
			3. 계산이 저렴
			4. 동일 결과 반환
	*/
}