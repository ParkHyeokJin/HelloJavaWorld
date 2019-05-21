# The DesignPattern - java

### AbstractFactory Pattern  

### Singleton Pattern  
- 싱글톤 패턴 : 싱글톤 패턴으로 클래스를 생성할 경우 최초 클래스 로딩에 메모리에 할당을하고(static) 이후 인스턴스를 만들어 활용하는 패턴. 메모리에 이점이 있음  
- 활용처 : DBCP(Database Connection Pool), logger 등등

### Adapter Pattern  
- 어뎁터 패턴의 :호환 되지 않는 인터페이스를 재정의 해서 활용 할 수 있는 패턴  
- 활용처 : 레거시 시스템의 변경 할 수 없는 인터페이스를 재정의 해서 활용 할 수 있음.
 
### Builder Pattern  
__1) chap1__  
- 빌더 패턴 : 객체의 생성 알고리즘 과 조립을 분리 하는 것  
- 빌더 패턴의 이점 : 객체 생성을 할 경우 유연하게 하기 위함.  
- 활용처 : 객체 생성

__2) chap2(Effective java style)__  
- 각 인자가 어떤 의미인지 쉽게 알 수 있다.   
- 한 번에 객체를 생성하므로 객체 일관성이 깨지지 않는다.   
- build() 함수가 잘못된 값이 입력되었는지 검증하게 할 수도 있다.   
- setter 메소드가 없으므로 변경 불가능 객체를 만들 수 있다.  

### Memento Pattern  
- 메멘토 패턴 : 객체의 상태 정보를 저장 및 복원(Rollback) 하는 패턴  
- 활용 처 : 문자 되돌리기등 상태를 되돌릴 때 사용함.
