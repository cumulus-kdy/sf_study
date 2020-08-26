# sf_study
study for Spring Framework

1주차 (2020.08.06 ~ 2020.08.10)<hr/>
---
##### 1. 개발 환경 세팅
- jdk/tomcat/mybatis, eclipse 설치 및 예제 수행
- PropertyNotFoundException 에러 발생 :
    - get, set 함수명을 칼럼명과 똑같이 설정해야 함. 대소문자 구분은 상관없는 듯 하나, jsp 파일에서는 멤버변수가 소문자로 시작해야 하는 듯 함.
- root-context.xml에서 bean을 찾을 수 없다는 에러가 발생 :
    - root-context.xml에서 xsi:schemaLocation에 해당 bean의 라이브러리?를 추가해야 하는 듯 함
    
##### 2. github 계정 생성
- <https://github.com/cumulus-kdy/sf_study.git>


2주차 (2020.08.13 ~ 2020.08.17)<hr/>
---
##### 1. 차트 테스트
- chart_test 프로젝트 생성 후 WebContent 하위에 example.html, data.tsv 생성

##### 2. 인터페이스 가이드 작성 및 업로드

3주차 (2020.08.20 ~ 2020.08.24)<hr/>
---
##### 1. RestController 활용한 DataBinding
- Jackson 라이브러리 추가
- restController.java 작성
- home.jsp 작성
- common_resource.jsp / home.js / home.css 작성
- jquery-1.12.4.min.js 추가
