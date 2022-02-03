## Contents 관련 태그
- [자주 사용되는 태그 정리](https://pridiot.tistory.com/6)
- alt 요소는, img가 없을때 보여지는 컨텐츠이다.
- h는 head(제목)의 약자이다. h1부터 h6까지 사용한다.
- p는 paragraph(문단,단락)의 약자이다. 
- ul tag : unordered(순서가 없는) -> 동그라미
- ol tag : ordered(순서가 있는) -> 숫자
- ol tag에 start = " " 를 붙이면, 어떤 문자나 숫자로 시작하는지 
명시가 가능하다.
- blockquote tag : 다른 블로그나 사이트의 글을 인용할때 사용. 이때 인용한 문장은 다른 텍스트보다 안으로 들여 써지므로 다른 텍스트와 구별됨
- hr tag : horizontal line의 약자로 줄긋기
- mark tag : 형광펜으로 칠한다

### 테이블
- table>tr>th 입력시 자동으로 테이블이 완성된다.
- tr : table row
- th : table head
- td : table data

### CSS BoxModel
- margin > border > padding 순서로 컨텐츠를 감싼다.
- CSS BoxModel 이미지를 참조한다.

## jQuery
- jQuery는 js 언어를 적용한다.
- jQuery는 js로 만들어진 라이브러리
- jQuery는 아래처럼 사용
```javascript
<script>
    $(document).ready(function(e){ 
            $('button').click(function(e){
                console.log("버튼이 눌렸다.");
            })
        })
</script>
```
- RGB로 색을 표현하면 색이 단순하다. 그래서 16진수로 색상을 표현한다
- ff(255) ee(1110 1110) 33(0011 0011) 의 형태로.
- 아래처럼 색을 표현한다.
```javascript
background-color : #ff00ff
```
