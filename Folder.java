package 상속01;

public class Folder extends Tell {
	// 상속받을 하위(자식) 클래스
	// 하위클래스명 extends 상위클래스명
	// 상위클래스에 있는 데이터와 기능을 전부 물려받음.

	// 확장-> 필요한 기능만 추가로 개발
	public void Camera() {
		System.out.println("사진을 찍다.");
	}

	// 오버라이딩-> 재정의
	@Override // 어노테이션 : 오버라이딩됐다고 표시한 참조주석
	public void ButtonClick() {
		// 기능은 전혀달라도 상관없다
		// 다만 이름만 같아야함.
		System.out.println("똑 똑 독 버튼을 클릭합니다.");
	}

}
