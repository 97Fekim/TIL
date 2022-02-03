- alt 태그는, img가 없을때 보여지는 컨텐츠이다.
- h는 head(제목)의 약자이다. h1부터 h6까지 사용한다.
- p는 paragraph(문단,단락)의 약자이다. 
- [자주 사용되는 태그 정리](https://pridiot.tistory.com/6)
- ul tag : unordered(순서가 없는) -> 동그라미
- ol tag : ordered(순서가 있는) -> 숫자
- ol tag에 start = " " 를 붙이면, 어떤 문자나 숫자로 시작하는지 명시가 가능하다.

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