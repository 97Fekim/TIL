- sql developer, OracleXE112 파일 설치
- 주석 : <code>--</code>
- grant로 권한을 부여하는것이 첫번째, 그래야 데이터베이스를 관리할 수 있다.
- Oracle은 mysql과 다르게, 데이터의 삽입 명령의 마지막에 꼭 <strong>commit;</strong>을 써줘야 변경사항이 적용된다.

# SQL 기초 데이터 타입
- number(n) : n자리의 숫자
- varchar2(n) : n자리의 문자 (Oracle에서만 varchar2 사용)
- data : 날짜 타입
- 

# SQL 기초문법 활용
## create 문
```sql
create table [TABLE_NAME]{
    COLUMM_NAME TYPE(DATA_NUMBER), -- + null or not null
    ...
}
```

## insert 문
```sql
-- table에 한번에 넣기
insert into TABLE_NAME values(data1, data2, data3, ...);

-- table의 각 columm에 넣기
insert into TABLE_NAME(columm1, columm2 ...) values(data1, data2 ...)
```

## select 문
```sql
-- table의 모든 데이터 출력하기
select * fromt TABLE_NAME;
```

## drop 문
```sql
-- table을 제거한다.
drop table TABLE_NAME;
```

## constrain(제약조건)

### primary key
```sql
-- KEY_NAME은 고유한 key가 되어, 중복될 수 없는 key가 된다.
constraint CONSTARINT_NAME primary key (KEY_NAME);
```

### foreign key
```sql
-- 부모 primary key에 없는 값을 자식의 key에 추가시 오류가 발생.  
constraint CONSTRAINT_NAME foreign key (KEY_NAME) references PARENT_NAME(PARENT_KEY);
```