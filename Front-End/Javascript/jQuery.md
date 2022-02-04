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

- <code>.eq</code> : 일반적으로 개체를 여러개 만들면 그 개체들은 배열로 저장된다. 이때 .eq(index)로 해당 인덱스의 개체를 가져올 수 있다.
- <code>.val</code> : 어떤 개체가 가지고 있는 값을 가져온다.
- <code>$('object')</code> : 특정한 개체를 호출한다. 버튼이면 버튼, 헤드면 헤드, 단락이면 단락
- <code>.attr(a,b)</code> : 이 a 를 찾아서, a의 값을 두번째 매개변수 b로 변경한다.