# HTML
## HTML요소(Element)의 구조
```
<p>Hi there!</p>
```
1. **여는 태그, 닫는 태그** : 꺾쇠 안에 있는 p와 /p 사이에 내용이 들어간다.
2. **내용** : 요소(Element)의 내용이다.
3. **요소(Element)** : 여는 태그, 닫는 태그, 내용 세가지를 통틀어 요소라고 한다. 
## 포함된 요소(Element in Element)
```
<p>Hi there, you <strong>so</strong> cool!</p>
```
- p 태그가 strong 태그를 둘러싸고 있다.
## HTML 요소의 종류
1. **블럭 레벨 요소** : 일반적으로 페이지의 구조적 요소를 나타낼 때 사용된다. 붙여서 코딩을 해도 새로운 줄에 Output이 나타난다. [블럭 레벨 요소 문서](https://developer.mozilla.org/en-US/docs/Web/HTML/Block-level_elements)
> p는 블럭 레벨 요소이다.
2. **인라인 요소** : 문장, 단어 같은 작은 부분에 대해서 적용하는 요소이다. 붙여서 코딩을 하면 같은 줄에 Output이 나타난다. [인라인 요소 문서](https://developer.mozilla.org/en-US/docs/Web/HTML/Inline_elements)
> a, em, strong 등이 인라인 요소이다.
3. **빈 요소** : 주로 문서에 무언가를 첨부하기 위해 단일 태그(Single tag)를 사용하는 요소
## 요소의 속성
- 속성은 요소에 실제론 나타내고 싶지 않지만, 추가적인 내용을 담고 싶을 때 사용한다.
```
<p class="editor-note">Hi there, you </p>
```
- 주로 사용되는 속성 요소
```
<target>
href = "https://www.mozilla.rog."
// 이 속성은 연결하고자 하는 웹 주소를 지정한다.
```
```
<title>
title = "The Mozilla homepage"
// 이 속성은 링크에 대한 추가 정보를 나타낸다. 이 내용은 링크 위로 마우스를 옮겼을때 나타날 것
```
```
<target>
target = "_blank_"
// 링크를 새 탭에서 보여줍니다. 현재 탭에서 링크를 보여주고 싶다면, 이 속성을 생략하면 된다.
```
## 참과 거짓 속성(Boolean attributes)
```
<disabled>>

<input type="text" disabled="disabled">
<input type="text" disabled>
// 둘 모두, text를 비활성화 시킨다.
```
## 속성값의 따옴표 생략
- 속성값은 " "를 생략이 가능하다. 하지만 따옴표는 붙이는 편이 좋다. 따옴표를 붙이는 마크업 코딩 방식이 코드의 가독성을 향상시킬 뿐아니라, 예상치 못한 오류를 방지할 수 있다.
- HTML에서 큰따옴표(" ")와 작은따옴표(' ')는 문장에 적용했을때, 동일하게 동작한다. 하지만 주의해야할 것은 두 가지를 섞어 쓰면 안된다.
```
<a href='http://www.example.com' title='Isn't this fun?'>A link to my example.</a>
// 위 문장은, Isn't의 작은 따옴표에 의해 예상치 못한 오류가 발생한다.
```
```
<a href='http://www.example.com' title='Isn&#39;t this fun?'>A link to my example.</a>
// 위의 문장으로 변경하면( ' => #39) 정상적으로 동작할 것이다.
```
## HTML 문서의 구조
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
1. **!DOCTYPE html** : 문서 형식을 나타낸다. 요즘엔 신경쓰지 않으며, 역사적 유물일 뿐이다. !DOCTYPE html은 유효한 문서 형식을 나타내는 짧은 문장일뿐이고, 이것만 알고 있으면 된다.
2. **html, /html** : html 요소이다. 이 요소는 전체 페이지의 콘텐츠를 포함하며, 기본 요소로도 알려져 있다.
3. **head, /head** : head 요소이다. 이 요소는 홈페이지 이용자에게는 보이지 않지만, 검색 결과에 노출 될 키워드, 홈페이지 설명, CSS 스타일, character setdeclaration 등 HTML 페이지의 모든 내용을 담고 있다.
4. **meta charset="utf-8"** : HTML 문서의 문자 인코딩 설정을 UTF-8로 지정하는 것이며, UTF-8에는 전세계에서 사용되는 언어에 대한 대부분의 문자가 포함된다. 이 설정을 사용하면 페이지에 포함된 모든 텍스트 내용을 처리할 수 있다. UTF-8를 설정하면 나중에 문자 인코딩과 관련된 일부 문제를 피하는데 도움이 될 수 있으므로, 문자 인코딩 설정을 하지 않을 이유가 없다.
5. **title,/title** : title 요소이다. 이 요소를 사용하면 페이지 제목이 설정되며, 페이지가 로드되는 브라우저 탭에 표시되는 제목으로 사용된다. 페이지 제목은 페이지가 책갈피 될 때 페이지를 설명하는 데에도 사용된다.
6. **body,/body** : body 요소이다. 여기에는 텍스트, 이미지, 비디오, 게임, 재생 가능한 오디오 트랙 등을 비롯하여 페이지에 표시되는 모든 콘텐츠가 포함된다.
## HTML 공백
```
<p>Dogs are silly.</p>
<p>Dogs        are       silly.</p>
```
* 두 코드의 스니펫은 동일하다. HTML 파서가 코드를 렌더링할 때 각 공백 시퀀스를 단일 공백으로 줄이기 때문이다. 하지만 가독성을 위해 적절한 공백을 선택하는 것이 개발자의 몫이다.

## Entity references : HTML에 특수문자 포함
* HTML에서 **&lt;**, **&gt;**,**&quot;**,**&amp;**는 특수문자다. 따라서 이를 텍스트에 포함시키려면, 아래 표를 활용해 코드를 작성해야 한다. [엔티티 참조 표](https://en.wikipedia.org/wiki/List_of_XML_and_HTML_character_entity_references)
<table class="standard-table">
 <thead>
  <tr>
   <th scope="col">Literal character</th>
   <th scope="col">Character reference equivalent</th>
  </tr>
 </thead>
 <tbody>
  <tr>
   <td>&lt;</td>
   <td>&amp;lt;</td>
  </tr>
  <tr>
   <td>&gt;</td>
   <td>&amp;gt;</td>
  </tr>
  <tr>
   <td>"</td>
   <td>&amp;quot;</td>
  </tr>
  <tr>
   <td>'</td>
   <td>&amp;apos;</td>
  </tr>
  <tr>
   <td>&amp;</td>
   <td>&amp;amp;</td>
  </tr>
 </tbody>
</table>
## HTML 주석
* HTML 주석을 쓰려면 특수 마커 <code>&lt;!--</code>&nbsp;및&nbsp;<code>--&gt;</code>로 주석을 묶는다.
```
<p>I'm not inside a comment</p>
```
> <p>I'm not inside a comment</p>
```
<p><!--I'm--> not inside a comment</p>
```
> <p><!--I'm--> not inside a comment</p>

## Tips.
1. em : 이탤릭 강조 효과를 준다.
2. strong : 진한 글씨 효과를 준다
3. img : 해당 위치에이미지를 삽입하기 위한 요소이다.
```
<img src="https://raw.githubusercontent.com/mdn/beginner-html-site/gh-pages/images/firefox-icon.png">
```
<img src="https://raw.githubusercontent.com/mdn/beginner-html-site/gh-pages/images/firefox-icon.png"> 
## 참고 문헌
[MDN Web Docs](https://developer.mozilla.org/ko/docs/Learn/HTML/Introduction_to_HTML/Getting_started)
