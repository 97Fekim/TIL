# 하이퍼링크
* URL은 HTML파일, 텍스트 파일, 이미지, 텍스트 문서들, 비디오와 오디오 파일들, 그리고 웹상에서 존재할 수 있는 어느 것이라 할지라도 연결할 수 있다.

## 링크의 구조
* <code>&lt;a&gt;</code>와 <code>href</code>속성은 이용해 하이퍼링크를 생성한다.
```
<p> I'm creating a link to 
<a href="https://www.mozilla.org/en-US/">the Mozilla homepage</a>.
</p>
```

<p> I'm creating a link to 
<a href="https://www.mozilla.org/en-US/">the Mozilla homepage</a>.
</p>

## title 속성에 부가적인 정보를 더하기

```
<p>This link
<a href="https://github.com/97Fekim" title="My Github">
_My Github_</a> is my Github link
</p>
```

<p>This link
<a href="https://github.com/97Fekim" title="My Github">
_My Github_</a> is my Github link
</p>

## Block level 링크
* 링크로 바꾸고 싶은 이미지가 있다면, &lt;a&gt;와 &lt;/a&gt; 사이에 그 이미지를 넣기만 하면 된다.

```
<a href="https://www.mozilla.org/en-US/">
  <img src="mozilla-image.png" alt="mozilla logo that links to the mozilla homepage">
</a>
```

<a href="https://www.mozilla.org/en-US/">
  <img src="mozilla-image.png" alt="mozilla logo that links to the mozilla homepage">
</a>

