# 트위터 접속하기

트위터에 애플리케이션을 등록 후 발급받은 크레덴셜을 이용해서 스프링 소셜 구성 및 트위터에 접근한다.

## 순서 - [참고](http://hleecaster.com/twitter-api-developer/)

1. https://developer.twitter.com/en/apps에 접속한다.  
2. 로그인을 한다.  
3. Create an app을 클릭한다.  
4. 트위터 API를 사용하는 목적에 대한 여러가지 이유를 영어로 입력한다 -_-  
5. 개발자 정책에 동의한다.  
6. 프로젝트 콘솔에서 create project를 한 후 정보를 입력한다. (어렵다 -_-)  
7. API 키와, API 시크릿을 발급받으면 application.properties 파일에 저장한다.  

```properties
twitter.appId=hmMVwCjG6JJ4q6J7WBxWCDnq6
twitter.appSecret=QyIAABTbNjWWSwowidexiGc1WwrNQjWhjuR063i0Ae9YFbS4aA
```

8. 트위터에 접속하기 위해 TwitterConnectionFactory를 추가한다.  
이클래스는  API키/시크릿을 이용해 트위터에 접속 요청을 한다. - (config.SocialConfig)
