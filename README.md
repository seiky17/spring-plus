# SPRING PLUS 과제
## 📅 과제 기간
2025.03.10 ~ 2025.03.21 (12일)
## 📑 과제 내용
<details>
  <summary><b>Lv 1</b></summary>
  <h3>1. 코드 개선 - @Transactional의 이해</h3>
  
  &ensp; ✔️ 할 일 저장 기능을 구현한 API(/todos)를 호출할 때, 아래와 같은 에러가 발생하고 있어요.
  
  ```
  jakarta.servlet.ServletException: Request processing failed: org.springframework.orm.jpa.JpaSystemException: could not execute statement [Connection is read-only. Queries leading to data modification are not allowed] [insert into todos (contents,created_at,modified_at,title,user_id,weather) values (?,?,?,?,?,?)]
  ```
  &ensp; ✔️ 에러가 발생하지 않고 정상적으로 할 일을 저장 할 수 있도록 코드를 수정해주세요.
  
  <h3>2. 코드 추가 - JWT의 이해</h3>

  &ensp; ✔️ User의 정보에 nickname이 필요해졌어요.
  
  &emsp; - User 테이블에 nickname 컬럼을 추가해주세요.  
  &emsp; - nickname은 중복 가능합니다.

  &ensp; ✔️ 프론트엔드 개발자가 JWT에서 유저의 닉네임을 꺼내 화면에 보여주길 원하고 있어요.
  
  <h3>3. 코드 개선 - JPA의 이해</h3>

  &ensp; ✔️ 할 일 검색 시 weather 조건으로도 검색할 수 있어야해요.

  &emsp; - weather 조건은 있을 수도 있고, 없을 수도 있어요!

  &ensp; ✔️ 할 일 검색 시 수정일 기준으로 기간 검색이 가능해야해요.
  
  &emsp; - 기간의 시작과 끝 조건은 있을 수도 있고, 없을 수도 있어요!

  &ensp; ✔️ JPQL을 사용하고, 쿼리 메소드명은 자유롭게 지정하되 너무 길지 않게 해주세요.
     
  <h3>4. 테스트 코드 - 컨트롤러 테스트의 이해</h3>

  &ensp; ✔️ 테스트 패키지 org.example.expert.domain.todo.controller의 todo_단건_조회_시_todo가_존재하지_않아_예외가_발생한다() 테스트가 실패하고 있어요.

  &ensp; ✔️ 테스트가 정상적으로 수행되어 통과할 수 있도록 테스트 코드를 수정해주세요.
  
  <h3>5. 코드 개선 - AOP의 이해</h3>

  &ensp; ✔️ UserAdminController 클래스의 changeUserRole() 메소드가 실행 전 동작해야해요.

  &ensp; ✔️ AdminAccessLoggingAspect 클래스에 있는 AOP가 개발 의도에 맞도록 코드를 수정해주세요.
</details>

<details>
  <summary><b>Lv 2</b></summary>
  <h3>6. JPA Cascade</h3>
  
  &ensp; ✔️ 할 일을 새로 저장할 시, 할 일을 생성한 유저는 담당자로 자동 등록되어야 합니다.
  
  &ensp; ✔️ JPA의 cascade 기능을 활용해 할 일을 생성한 유저가 담당자로 등록될 수 있게 해주세요.

  <h3>7. N+1</h3>

  &ensp; ✔️ CommentController 클래스의 getComments() API를 호출할 때 N+1 문제가 발생하고 있어요. N+1 문제란, 데이터베이스 쿼리 성능 저하를 일으키는 대표적인 문제 중 하나로, 특히 연관된 엔티티를 조회할 때 발생해요.

  &ensp; ✔️ 해당 문제가 발생하지 않도록 코드를 수정해주세요.

  <h3>8. QueryDSL</h3>

  &ensp; ✔️ JPQL로 작성된 findByIdWithUser 를 QueryDSL로 변경합니다.

  &ensp; ✔️ 7번과 마찬가지로 N+1 문제가 발생하지 않도록 유의해 주세요!

  <h3>9. Spring Security</h3>

  &ensp; ✔️ 기존 Filter와 Argument Resolver를 사용하던 코드들을 Spring Security로 변경해주세요.  
  
  &emsp; - 접근 권한 및 유저 권한 기능은 그대로 유지해주세요.  
  &emsp; - 권한은 Spring Security의 기능을 사용해주세요.

  &ensp; ✔️ 토큰 기반 인증 방식은 유지할 거예요. JWT는 그대로 사용해주세요.
</details>

<details>
  <summary><b>Lv 3</b></summary>
  <h3>10. QueryDSL 을 사용하여 검색 기능 만들기</h3>

  &ensp; ✔️ 새로운 API로 만들어주세요.
  
  &ensp; ✔️ 검색 조건은 다음과 같아요.

  &emsp; - 검색 키워드로 일정의 제목을 검색할 수 있어요.

  &emsp;&emsp; ◦ 제목은 부분적으로 일치해도 검색이 가능해요.

  &emsp; - 일정의 생성일 범위로 검색할 수 있어요.

  &emsp;&emsp; ◦ 일정을 생성일 최신순으로 정렬해주세요.

  &emsp; - 담당자의 닉네임으로도 검색이 가능해요.

  &emsp;&emsp; ◦ 닉네임은 부분적으로 일치해도 검색이 가능해요. 

  &ensp; ✔️ 다음의 내용을 포함해서 검색 결과를 반환해주세요.

  &emsp; - 일정에 대한 모든 정보가 아닌, 제목만 넣어주세요.  
  &emsp; - 해당 일정의 담당자 수를 넣어주세요.  
  &emsp; - 해당 일정의 총 댓글 개수를 넣어주세요.

  &ensp; ✔️ 검색 결과는 페이징 처리되어 반환되도록 합니다.

  <h3>11. Transaction 심화</h3>

  &ensp; ✔️ 매니저 등록 요청을 기록하는 로그 테이블을 만들어주세요.

  &emsp; - DB 테이블명: log

  &ensp; ✔️ 매니저 등록과는 별개로 로그 테이블에는 항상 요청 로그가 남아야 해요.

  &emsp; - 매니저 등록은 실패할 수 있지만, 로그는 반드시 저장되어야 합니다.  
  &emsp; - 로그 생성 시간은 반드시 필요합니다.  
  &emsp; - 그 외 로그에 들어가는 내용은 원하는 정보를 자유롭게 넣어주세요.
</details>

## ✏️ 트러블슈팅
<a href="https://devlily-1.tistory.com/41" target="_blank">
<img src="https://github.com/user-attachments/assets/bf360d08-77b9-4cef-aee4-4f6828be7f51" width="50" height="50"/>
