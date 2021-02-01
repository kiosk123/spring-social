# 스프링 소셜 구성

스프링 소셜은 핵심 모듈 + 서비스 공급자(트위터, 페이스북, 깃헙 등..)별 확장 모듈로 구성된다.  
|모듈|설명|
|--------|-------|
|spring-social-core|스프링 소셜의 코어 모듈. 메인 공유 인프라 클래스가 들어있음|
|spring-social-config|스프링 소셜의 구성 모듈. 스프링 소셜을 쉽게 구성 가능|
|spring-social-web|스프링 소셜의 웹 연계 모듈. 간편하게 사용가능한 필터 및 컨트롤러 존재|
|spring-social-security|스프링 시큐리티 연계 모듈|


## 설명

- 스프링 소셜 기능 활성화를 위해 @Configuration 구성 클래스(**config.SocialConfig**)에 **@EnableSocial** 붙인다.
  - **SocialConfigurer(SocialConfigurerAdapter)**를 구현하여 빈으로 등록되어 있으면 자동 감지된다.
  - **SocialConfigurer(SocialConfigurerAdapter)**는 하나 이상의 서비스 공급자 구성을 추가할때 쓰는 빈이다.
- **SocialConfigurerAdapter**의 **getUserIdSource()** 메서드를 오버라이드하고 **new StaticUserIdSource()** 반환하게 한다
  - **new StaticUserIdSource()**는 UserIdSource로 현재 유저를 식별하고 이 이 유저를 이용해 서비스 공급자에 접속 가능한 커넥션을 찾는다
- 찾은 커넥션은 유저 별로 **ConnectionRepository**에 보관한다.
- 어떤 **ConnectionRepository**을 사용할지는 현재 유저에 해당하는 **UsersConnectionRepository**인터페이스에 의해 결정된다.
  - **UsersConnectionRepository**의 기본 구현체는 **InMemoryUsersConnectionRepository**
- 애플리케이션이 서비스 공급자를 액세스 할 때 쓸 API키는 프로퍼티 파일에 담아 클래스패스에 둔다.