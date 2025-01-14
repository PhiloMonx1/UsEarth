# UsEarth
  * Us-Earth는 매일 바뀌는 환경미션을 완수하고 캐릭터(나무)를 성장시키는 환경지킴 서비스입니다. 
  * 커뮤니티를 통해 함께 환경 캠페인에 도전할 사람을 모으고, 환경 관련 소식도 받아볼 수 있습니다.
# 서비스사이트
  * [UsEarth 바로가기](https://usearth.co.kr)
  * [시연 영상+발표 영상](https://youtu.be/cB17NoXBuds)
# 개발환경
  * 언어  : JAVA 11
  * 프레임워크 : Spring boot 2.5.3
  * 서버 :  AWS EC2(Linux2 AMI(HVM) - Kernel 4.14)
  * 데이터베이스 :  MySQL (AWS RDS,8.0.28)
  * 그 외 : Aws S3 , Redis 
# 프로젝트기간
* 2022년 08월 26일 ~ 2022년 10월 06일
* 배포일 : 2022년 09월 29일
  
# 팀원
|박민규|이태민|김미리|김원호|조예린|
|:------:|:---:|:---:|:---:|:---:|
|Spring / BE|Spring / BE|React / FE|React / FE|Designer|
|[GitHub](https://github.com/Minkyu222341)|[GitHub](https://github.com/PhiloMonx1)|[GitHub](https://github.com/loveyoujgb)|[GitHub](https://github.com/woonhk90/us-earth_fe)||
# Stack
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"> 
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/querydsl -F8DC75?style=for-the-badge&logo=querydsl&logoColor=white"> <img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black"> 
<img src="https://img.shields.io/badge/amazonaws-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"> <img src="https://img.shields.io/badge/codedeploy -569A31?style=for-the-badge&logo=codedeploy&logoColor=white"> <img src="https://img.shields.io/badge/AmazonS3 -569A31?style=for-the-badge&logo=AmazonS3&logoColor=white"> 
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/githubactions -2088FF?style=for-the-badge&logo=githubactions&logoColor=white"> <img src="https://img.shields.io/badge/postman -FF6C37?style=for-the-badge&logo=postman&logoColor=white"> <img src="https://img.shields.io/badge/nginx -009639?style=for-the-badge&logo=nginx&logoColor=white"> <img src="https://img.shields.io/badge/slack -4A154B?style=for-the-badge&logo=slack&logoColor=white"> 
<img src="https://img.shields.io/badge/redis -DC382D?style=for-the-badge&logo=redis&logoColor=white">
<img src="https://img.shields.io/badge/Selenium -43B02A?style=for-the-badge&logo=Selenium&logoColor=white">
<img src="https://img.shields.io/badge/jwt -000000?style=for-the-badge&logo=jwt&logoColor=white">

# ERD / API
* [ERD(Entity Relationship Diagram)-WIKI이동](https://github.com/Us-Earth/UsEarth-BE/wiki/ERD)
* [API-WIKI이동](https://github.com/Us-Earth/UsEarth-BE/wiki/API)
# Architecture
![UsEarth아키텍처](https://user-images.githubusercontent.com/108817236/193409607-020133eb-0686-462b-8e87-ee643a1deb13.png)

# 트러블슈팅
  1. [CI/CD(지속적 통합 지속적 제공)-WIKI이동](https://github.com/Minkyu222341/UsEarth/wiki/CI-CD-(-%EC%A7%80%EC%86%8D%EC%A0%81-%ED%86%B5%ED%95%A9-%EC%A7%80%EC%86%8D%EC%A0%81-%EC%A0%9C%EA%B3%B5-))
  2. [웹페이지 크롤링-WIKI이동](https://github.com/Us-Earth/UsEarth/wiki/Selenium-%ED%81%AC%EB%A1%A4%EB%A7%81)
  3. [Slack Webook-WIKI이동](https://github.com/Us-Earth/UsEarth/wiki/Slack-WebWook---%EC%97%90%EB%9F%AC%EB%A1%9C%EA%B7%B8)
  4. [QueryDsl 도입-WIKI이동](https://github.com/pnci1029/hanghae_8D_BE/wiki/QueryDSL-%EC%A0%81%EC%9A%A9)
  5. [대기질 API 스케줄러 미작동-WIKI이동](https://github.com/Us-Earth/UsEarth-BE/wiki/%EB%8C%80%EA%B8%B0%EC%A7%88-API-%EC%8A%A4%EC%BC%80%EC%A4%84%EB%9F%AC-%EB%AF%B8%EC%9E%91%EB%8F%99-%EB%AC%B8%EC%A0%9C)
  6. [비속어 필터 메서드 실행속도-WIKI이동](https://github.com/Us-Earth/UsEarth-BE/wiki/%EB%B9%84%EC%86%8D%EC%96%B4-%ED%95%84%ED%84%B0-%EB%A9%94%EC%84%9C%EB%93%9C-%EC%8B%A4%ED%96%89%EC%86%8D%EB%8F%84-%EB%AC%B8%EC%A0%9C)
  7. [MySQL 8.0.20 LocalDate 타입 데이터 하루 전으로 들어가는 문제-WIKI이동](https://github.com/Us-Earth/UsEarth-BE/wiki/MySQL-8.2.0-LocalDate-%ED%83%80%EC%9E%85-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%95%98%EB%A3%A8-%EC%A0%84%EC%9C%BC%EB%A1%9C-%EB%93%A4%EC%96%B4%EA%B0%80%EB%8A%94-%EB%AC%B8%EC%A0%9C)
  8. [이미지 리사이징-WIKI이동](https://github.com/Us-Earth/UsEarth-BE/wiki/%EC%9D%B4%EB%AF%B8%EC%A7%80-%EB%A6%AC%EC%82%AC%EC%9D%B4%EC%A7%95)
