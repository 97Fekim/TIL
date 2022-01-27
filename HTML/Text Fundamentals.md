# HTML Text Fundamentals
> 문단, 제목, 목록, 강조 및 인용구를 포함한 구조와 의미를 부여하기 위해 텍스트의 기본 페이지를 표시하는 방법에 대해 학습한다.

## 기본적인 것 : 제목과 단락.
* 기사, 신문, 교과서, 잡지 등 무엇을 읽든 간에 텍스트는 제목과 단락으로 구성된다. 구조화된 텍스트는 그렇지 않은 텍스트보다 더 쉽고 잘 읽힌다.
* HTML에서 각 단락은 아래의 코드처럼 <code>&lt;p&gt;</code> 요소 안에 둘러싸여 있어야 한다.

```html
<p>But i am a women</p>
```

* 각 제목도 아래의 코드처럼 **heading** 요소 안에 둘러싸여 있어야 한다. 

```html
<h>I'm your father.</h>
```

* **heading** 요소는 총 6개가 있다. <code>&lt;h1&gt;</code>,<code>&lt;h2&gt;</code>,<code>&lt;h3&gt;</code>,<code>&lt;h4&gt;</code>,<code>&lt;h5&gt;</code>,<code>&lt;h6&gt;</code>
* 각 요소에서는 문서에서 다른 수준의 내용을 나타낸다. 메인 제목을 <code>&lt;h1&gt;</code>으로 나타내고, 소제목을 <code>&lt;h2&gt;</code>, 소제목의 소제목을 <code>&lt;h3&gt;</code> 로 나타내는 방식이다.
## 구조화된 계층 구현하기

```html
<h1>"h1 제목"</h1>
<p>"h1 단락"</p>
<h2>"h2 제목"</h2>
<p>"h2 단락"</p>
<h3>"h3 제목"</h3>
<p>"h3 단락"</p>
```

↓↓↓
<h1>"h1 제목"</h1>
<p>"h1 단락"</p>
<h2>"h2 제목"</h2>
<p>"h2 단락"</p>
<h3>"h3 제목" </h3>
<p>"h3 단락"</p>

## 구조화된 계층 구현시 기억해야 할 관례
<ul>
    <li>가급적이면 페이지 당 하나의 <code>&lt;h1&gt;</code>만 사용해야 한다. <code>&lt;h1&gt;</code>은 최상위에 있는 표제이며, 나머지 다른 표제들은 계층적으로 이것 밑에 위치한다.</li>
    <li>각 표제들은 계층적으로 올바른 순서로 사용해야 함을 명심한다. 즉 <code>&lt;h3&gt;</code>을 상위 표제로 사용하고 하위표제로 <code>&lt;h4&gt;</code> 를 사용하면 안된다는 말이다.</li>
    <li>6개의 Heading을 사용할 수 있지만 꼭 필요한 것이 아니라면, 한 페이지에 3개 이상을 사용하지 않도록 한다. 3개 이상인 경우, 차라리 컨텐츠를 여러 페이지로 나누는 것이 바람직하다. </li>
</ul>

## 사용자는 웹사이트에 오래 머물지 않는다.
* 유저는 필요한 컨텐츠를 빠르게 훑어보는 경향이 있고, 자주 heading만 읽기도 한다.
* 따라서 개발자는 컨텐츠를 구조적인 markup에 적용시켜야할 필요가 있다.

## 리스트
### 1. 순서 없는 리스트 (&lt;ul&gt;)
* &lt;li&gt;는 list item을 의미한다.
* &lt;ul&gt;은 unordered list를 의미한다. (순서가 없는)
* &lt;ol&gt;은 ordered list를 의미한다. (순서가 있는)

```html
<ul>
milk
eggs
bread
hummus
</ul>
```

↓↓↓
<ul>
milk
eggs
bread
hummus
</ul>

```html
<ul>
    <li>milk</li>
    <li>eggs</li>
    <li>bread</li>
    <li>hummus</li>
</ul>
```

↓↓↓
<ul>
    <li>milk</li>
    <li>eggs</li>
    <li>bread</li>
    <li>hummus</li>
</ul>

### 2. 순서 있는 리스트 (&lt;ol&gt;)

```html
<ol>
Drive to the end of the road
Turn right
Go straight across the first two roundabouts
Turn left at the third roundabout
The school is on your right, 300 meters up the road
</ol>
```

↓↓↓
<ol>
Drive to the end of the road
Turn right
Go straight across the first two roundabouts
Turn left at the third roundabout
The school is on your right, 300 meters up the road
</ol>

```html
<ol>
  <li>Drive to the end of the road</li>
  <li>Turn right</li>
  <li>Go straight across the first two roundabouts</li>
  <li>Turn left at the third roundabout</li>
  <li>The school is on your right, 300 meters up the road</li>
</ol>
```

↓↓↓
<ol>
  <li>Drive to the end of the road</li>
  <li>Turn right</li>
  <li>Go straight across the first two roundabouts</li>
  <li>Turn left at the third roundabout</li>
  <li>The school is on your right, 300 meters up the road</li>
</ol>

### 리스트 내부의 리스트 (Nesting lists)

```html
<ol>
  <li>Remove the skin from the garlic, and chop coarsely.</li>
  <li>Remove all the seeds and stalk from the pepper, and chop coarsely.</li>
  <li>Add all the ingredients into a food processor.</li>
  <li>Process all the ingredients into a paste.</li>
  <li>If you want a coarse "chunky" hummus, process it for a short time.</li>
  <li>If you want a smooth hummus, process it for a longer time.</li>
</ol>
```

↓↓↓
<ol>
  <li>Remove the skin from the garlic, and chop coarsely.</li>
  <li>Remove all the seeds and stalk from the pepper, and chop coarsely.</li>
  <li>Add all the ingredients into a food processor.</li>
  <li>Process all the ingredients into a paste.</li>
  <li>If you want a coarse "chunky" hummus, process it for a short time.</li>
  <li>If you want a smooth hummus, process it for a longer time.</li>
</ol>

```html
<ol>
    <li>Remove the skin from the garlic, and chop coarsely.</li>
    <li>Remove all the seeds and stalk from the pepper, and chop coarsely.</li>
    <li>Add all the ingredients into a food processor.</li>
    <ul>
        <li>Process all the ingredients into a paste.</li>
        <li>If you want a coarse "chunky" hummus, process it for a short time.</li>
        <li>If you want a smooth hummus, process it for a longer time.</li>
    </ul>
</ol>
```

↓↓↓
<ol>
    <li>Remove the skin from the garlic, and chop coarsely.</li>
    <li>Remove all the seeds and stalk from the pepper, and chop coarsely.</li>
    <li>Add all the ingredients into a food processor.</li>
    <ul>
        <li>Process all the ingredients into a paste.</li>
        <li>If you want a coarse "chunky" hummus, process it for a short time.</li>
        <li>If you want a smooth hummus, process it for a longer time.</li>
    </ul>
</ol>

## 중요와 강조
### 1. 중요(Emphasis)
* 대표적으로 &lt;em&gt;(emphasis) 가 사용된다.

```html
<p>I am <em>glad</em> you weren't <em>late</em>.</p>
```

↓↓↓
<p>I am <em>glad</em> you weren't <em>late</em>.</p>

### 2. 강조(Strong importance)
* 대표적으로 &lt;strong&gt;가 사용된다.

```html
<p>This liquid is <strong>highly toxic</strong>.</p>
```

↓↓↓
<p>This liquid is <strong>highly toxic</strong>.</p>

### 3. 이탤릭(Italic), 굵게(bold), underline(밑줄)
* 이탤릭 : &lt;i&gt;
* 굵게 : &lt;b&gt;
* 밑줄 : &lt;u&gt;

## 참고문헌
[Mozilla MDN Web Docs](https://developer.mozilla.org/ko/docs/Learn/HTML/Introduction_to_HTML/HTML_text_fundamentals)