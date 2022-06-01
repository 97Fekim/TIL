- SQL = Structural Query Language
- 배울 종류 : mysql + 오라클
- 환경 : mysql workbench
- 결과적으로 필요한거 : mysql server(커맨드로 접근가능) + mysql workbench(GUI)

# 환경 설정
- 버전문제로 8.0.20 버전 설치 (최신은 27)
- 환경변수/시스템변수/Path 에 mysql server가 설치된 경로(/bin)를 추가.
- SET GLOBAL time_zone='Asia/Seoul'; SET time_zone='Asia/Seoul'; 을 입력해서 시간을 서울로 수정한다.
- Workbench > 왼쪽아래 Administration tap 클릭 > 왼쪽 Server Status 클릭 > 재생버튼이 초록색인 것을 확인 > 정상설치 완료
- 환경변수에서, mysql 서버의 .exe 파일의 경로를 path로 추가한다.
- mysql 서버의 시간을 'SYSTEM' 에서 'ASIA/SEOUL' 로 변경한다.

# mysql 자료형
- int : 정수타입
- small int : 작은 값의 정수타입
- char(n) : n자리의 문자열
- varchar(n) : n자리의 문자열
- date : 날짜타입

# 기초 문법
## where (조건문)
```sql
-- 홍길동인 이름만 가져온다.
select name from usertbl where name='홍길동'
```
## and
```sql
-- and
select userid, name from usertbl where birthyear >= 1970 and height >= 182;
```
## or
```sql
-- or
select userid, name from usertbl where birthyear >= 1970 or height >= 182;
```
## between
```sql
select name, height from usertbl where height >= 180 and height >= 183;
-- 위의 구문을 between을 사용해 아래 구문으로 바꿀 수 있다.
select name, height from usertbl where height between 180 and 183;
```
## in
```sql
-- in (집합) : 집합에 포함되는 데이터만 가져온다.
select name, addr from usertbl where addr in('경남', '전남', '경북');
```
## like 
```sql
-- 1) name이 'Hi'으로 시작하는 모든 데이터의 name, height를 가져온다.
select name, height from usertbl where name like 'Hi%';

-- 2) name이 'Hi'으로 끝나는 모든 데이터의 name, height를 가져온다.
select name, height from usertbl where name like '%Hi';

-- 3) name이 '_'의 갯수만큼 이후 'Hi'로 끝나는 모든 데이터의 name, height를 가져온다.
select name, height from usertbl where name like '_Hi';
```

## ifNull
```sql
-- NAME 칼럼의 데이터를 가져오는데, null인 경우 'No name'으로 치환해서 가져온다
SELECT ifNull(NAME,'No name') from animal_ins order by animal_id;
```

## sub query
- query안에 또다른 query를 사용하는걸 sub query라고 한다.
- 주의해야할 점은 sub query가 두개 이상을 반환하면, any나 all을 적용해야 한다.
- any : 하나의 sub query에 대한 조건에만 만족하는지
- all : 가져온 sub query 모두에 대한 조건에 만족하는지
```sql
-- 1) 하나의 데이터를 반환하는 sub query의 사용
select name, height from usertbl
	where height > (select height from usertbl where name='김경호');

-- 2) 두개의 데이터를 반환하는 sub query의 사용
-- 2-1) any
select name, height from usertbl
	where height > any (select height from usertbl where (name='김경호' or name='은지원'));

-- 2-2) all
select name, height from usertbl
	where height > all (select height from usertbl where (name='김경호' or name='은지원'));
```

## 정렬
- order by 를 사용한다.
```sql
-- mDate를 기준으로 오름차순 정렬 기본값은 오름차순이다.
select name, mDate from usertbl order by mDate asc;
-- mDate를 기준으로 내림차순 정렬, desc는 내림차순을 의미.
select name, mDate from usertbl order by mDate desc;
```

## limit
```sql
-- 상위 3개만 가져온다.
select * from usertbl limit 3;
```

## 테이블 복사
```sql
-- 테이블 전체 복사해서 새로운 테이블 생성
create table NEW_TABLE (select * from ORIGINAL_TABLE);
-- 테이블에서 id, phone, addr만 복사해서 새로운 테이블 생성
create table NEW_TABLE (select id,phone,addr from ORIGINAL_TABLE)
```

## group by
```sql
-- group by : userid가 1,1,2,2,3,1,4,1,2,3,2 이렇게 있다고 하면
-- 1,2,3,4에 대해서 따로 가져온다.
select userid, sum(amount) from buytbl group by userid;
```

## 집계 함수
- sum, count, avg, stddev(표준편차), min, max ....

## having 절
- where 구문에 집계함수가 들어갈 수 없다. 써야할 경우에는 having문으로 사용한다.
- having은 group by 쿼리의 where 절이라고 보면 된다.
- <code>group by ___ having ___</code> 의 형태로 사용한다.

## update
- update시 safe Error가 발생할 수 있다.
- set sql_safe_updates=0; 코드를 먹이면 안전모드가 풀리며, update가 정상적으로 가능해진다.
```sql
-- 이름이 '김개똥'인 사람의 이름을 모두 '바비킴'으로 바꿔라
update usertbl set name='김개똥' where name = '바비킴';
-- 키가 170 이상인 모든 데이터의 이름을 '홍말자'로 바꿔라
update usertbl set name='홍말자' where height >= 170;
```


# 변수
## 변수의 선언
```sql
set @myVar1 = 5;
set @myVar3 = 4.25;
set @myVar4 = '가수 이름 == > ';
```

## cast (형 변환)
```sql
-- 정수로 형변환
select cast(5.45 as signed int);
-- 날짜로 형변환
select cast('2020$12$12' as date);
```

# Procedure
- Function과 유사하지만 다른 특성을 가진 처리기
```sql
-- delimiter의 생성
delimiter $$
create procedure ifProc()
begin 
	declare var1 int;	
    set var1 = 100;		
    
    if var1 = 100 then 	
	select '100입니다';
	else
		select '100이 아닙니다.';
	end if;
end $$
delimiter ;		-- 여기까지 프로시저 생성
call ifproc();	-- 호출
```


# temp(0303) (추후에 정리)
## 0303
- switch case
- ascii()
- format() : 소수점
- bin(), hex(), oct() : 2,16,8진수 출력
- left(), right()
- LCASE(), UCASE() : isUpper, inLower 라고 보면 된다.
- LPAD(), RPAD() : 문자열의 왼쪽이나 오른쪽에 길이를 늘린 후, 문자를 추가한다.
- LTRIM(), RTRIM() : 문자열의 왼쪽이나 오른쪽의 공백을 제거한다. 중간의 공백은 제거하지 않는다.
- TRIM()
- SUBSTRING(string, a, b) : 문자열을 b개로 쪼갠후 a번째를 가져온다.
- ADDDATE() : 날짜 데이터에 인자만큼 날짜를 더한다. day, month, year 모두 가능하다.
- alter : table을 수정한다

## 0308
- 실습6.sql
- procedure와 function 학습
- JDBC = Java DataBase Connection
- 트리거 학습
- 트리거 조회 하는 방법
