```html
<!-- button -->
<button type="button" class="btn btn-primary modifyBtn">Modify</button>
```

```javascript
/* modify button handler */
<script>
    $(".modifyBtn").click(function(){

        if(!confirm("수정하시겠습니까?")){
            return ;
        }

        actionForm
            .attr("action", "/guestbook/modify")
            .attr("method", "post");
        actionForm.submit();
    })
</script>
```

- 버튼을 누를시, form태그의 action과 method를 변경 가능하다
- if(!confirm) 을 이용해서 유저에게 한번 물어볼 수 있다.