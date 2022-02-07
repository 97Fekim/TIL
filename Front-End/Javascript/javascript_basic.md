# Javascript 시작
- html 소스의 &lt;body&gt; 부분에 &lt;script&gt; 태그를 넣으면, script 태그 속에서 javascript 문법을 사용할 수 있다.
- var ,let 모두 변수나 객체를 선언하는 키워드이다
- 자바스크립트는 모든걸 다 객체로 관리한다.
- 배열은 <code>let temp = []</code> 형식으로 선언한다.
- 객체는 <code>let temp = {}</code> 형식으로 선언한다.
- id는 '#', 클래스는 '.' 이다.
- 중요 태그 : a, h1~h6, table, div, p, br, hr
- 가장 중요 태그 : form // 스프링에서 엄청 많이 사용함
- form 태그는 client(브라우저)에서 서버(백엔드/스프링/스프링부트)에 데이터를 전송
- 전송 방식은 get, post 방식 두가지가 있다.
- get은 url에 데이터를 전송한다.
- post는 url에 데이터를 실지 않고, html의 body 태그에 숨겨서 전송한다 (보안관련, image)
- .change(function(){___}) 함수를 이용해, 값이 바뀌었을때 특정 함수를 호출 가능하다.

## 객체
- javascript에서 객체는 key, value의 쌍으로 이루어진 데이터이다.

## 반복문
- 반복문을 사용하여 배열을 다룰때 다음처럼 활용 가능
```javascript
const f = (i) => {
    for(const u of i){
        //
    }
}
```


## temp
- spread operator : 자바의 가변인자. 아래의 코드처럼, ...u 는 어떤 인자를 받던 간에 배열처럼 관리한다.
```javascript
const f = (...u) => {   // 자바의 가변인자
            var sum = 0;        // spread operator, c++
            for(const i of u){
                sum += i;
            }
            return sum;
        }
        console.log(f(2,3,4,5,6,8));
```