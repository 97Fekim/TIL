- 주석 : <code>--</code>
- Oracle은 mysql과 다르게, 데이터의 삽입 명령의 마지막에 꼭 <strong>commit;</strong>을 써줘야 변경사항이 적용된다.

# SQL 기초 데이터 타입
- number(n) : n자리의 숫자
- varchar2(n) : n자리의 문자 (Oracle에서만 varchar2 사용)
- date : 날짜 타입

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
- 1. 모든 데이터 가져오기
```sql
select * from TABLE_NAME;
```
- 2. 데이터의 갯수를 가져오기
```sql
select count(DATA_NAME) from TABLE_NAME;
```
- 3. 데이터 중복 제거 후 가져오기
```sql
select distinct DATA_NAME from TABLE_NAME;
```
- 4. null을 다른 문자로 치환하여 가져오기(NVL)
```sql
-- 학생의 이름이 없으면 '이름이 없음'으로 가져옴
SELECT NVL(name, '이름이 없음') FROM tbl_student;
```



## drop 문
```sql
-- table을 제거한다.
drop table TABLE_NAME;
```

## constrain(제약조건)

### null, not null
```sql
-- default 값이 null이 된다. (삽입할 필요 없음)
create table TABLE_NAME(
    DATA_NAME TYPE_NAME(n) null;
);

-- null이 아닌 값을 삽입해야 한다. (냅둘시 오류)
create table TABLE_NAME(
    DATA_NAME TYPE_NAME(n) not null;
);
```
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

### check
```sql
-- 교수라는 data는 '교수', '부교수', '조교수', '초빙교수' 중의 하나여야만 한다.
position varchar(10) constraint professor_ck check(position in ('교수', '부교수', '조교수', '초빙교수'))
```

# CRUD란?
- Create(Create, Insert(추가)), Read(조회/select), Update(alter, update(수정)), Delete(삭제)의 약자
- alter는 테이블의 구조를 변경하고, update는 데이터(레코드/행) 을 변경한다.
