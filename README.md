# refactoring study
코딩으로 학습하는 리팩토링

#### 냄새 1.이해하기 힘든 이름 (Mysterius Name)
깔끔한 코드에서 가장 중요한 것 하나가 바로 "좋은 이름"

> 사용할 수 있는 리팩토링 기술 <br>
> •함수 선언 변경하기 (Change Function Declaration): 함수명으로만 이해 가능 <br>
> •변수 이름 바꾸기 (Rename Variable): 많이 사용되는 변수 일수록 더 고민하여 이름 짓기 <br>
> •필드 이름 바꾸기 (Rename Field): Record 자료구조의 필드 (자바14 버전부터 지원)


#### 냄새 2.중복코드 (Duplicated Code)
비슷한지 완전히 동일한 코드 인지, 코드 변경시 모든 곳을 변경

> 사용할 수 있는 리팩토링 기술 <br>
> • 동일한 코드를 여러 메소드에서 사용하는 경우, 함수 추출하기 (Extract Function): "의도"와 "구현" 분리하기 <br>
> • 코드가 비슷하게 생겼지만 완전히 같지는 않은 경우, 코드 분리하기 (Slide Statements) <br>
> • 여러 하위 클래스에 동일한 코드가 있다면, 메소드 올리기 (Pull Up Method) 