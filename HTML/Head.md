# HTML head
> HTML의 head를 사용하는 목적과 HTML 문서에 어떤 영향을 끼칠 수 있는지에 대해 학습합니다.

## HTML head 란?
```
<HTML문서 예시>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>My test page</title>
  </head>
  <body>
    <p>This is my page</p>
  </body>
</html>
```
* 페이지를 열 때 브라우저에 표시되는 **&lt;body&gt;** 요소와 다르게, **head**의 내용은 페이지에 표시되지 않는다. 대신 **head 의 내용이 하는 일은 페이지에 대한 metadata를 포함하는 것이다.**
## 메타데이터 : &lt;meta&gt; 요소
### 1. 문서의 character 인코딩을 특정하기
```
<meta charset="utf-8>
```
* 이 요소는 문서의 character 문서에서 허용하는 문자 집합(character set)에 대해서 간단히 표시한다. utf-8은 전세계적인 character 집합으로, 다양한 언어의 문자를 포함한다.
### 2. 이름과 설명을 추가
많은 **&lt;meta&gt;** 요소가 <code>name</code>과 <code>content</code> 속성을 갖는다.
* <code>name</code>은 메타 요소가 어떤 정보의 형태를 갖고 있는지 알려준다. 
* <code>content</code>는 실제 메타데이터의 컨텐츠이다.
* 즉 <code>name</code>과 <code>content</code>는 key와 value처럼 한 쌍인 것이다.
### 3. 다양한 타입의 메타데이터
* Facebook, Twitter 등 기업들은 독점적인 형태의 자체 메타데이터를 가지고 있다.

