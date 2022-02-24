# 학원 수업 키워드 정리
- 오늘 하루 뭘 배웠는지 큰 그림으로 정리합니다.
- 후에 프로젝트를 하면서 찾아봐야 할 키워드가 생겼을 때 찾아 쓰기 용이함을 기대합니다.

## html/css/javascript (0203 ~ )
### 0203
- h 태그, p 태그, style 태그에 컬러 넣기
- 계산기 만들기 (가상 함수 배열, button, jQuery 이용)
- ol 태그
- table, table관련 태그(tr, th, td)
- 링크 바꾸기 (a 태그, button, jQuery)
- 일정 시간마다 색 바꾸기 (button, jQuery, .css)
- 랜덤으로 버튼 색 바꾸기 (button, jQuery, .css)
### 0204
- colgroup
- 랜덤위치에 랜덤색으로 바꾸기 (button, jQuery, .css)
- javascript json 객체 다루기. (map, filter, reduce도 이용)
- json에 함수와 valu 동시에 넣어서 호출하기.
- 계산기 만들기 (input 태그, jQuery 이용)
- 계산기 만들기 (json에 람다함수, value넣어서 활용)
### 0207
- id, class 이용 색 바꾸기 (id, class, jQuery, .css)
- button 이용 target 추가 (jQuery, .attr)
- fieldset, id, class, .change 이용 버튼 색 추가 (jQuery, .change, .css,)
- form 태그의 post, get 방식
- jQuery의 addClass, removeClass
- 3버튼 번갈아가며 색칠(jQuery addClass, removeClass 이용)
- input 클래스의 모든 값 더하기 (jQuery, Number)
### 0208
- input에 값 집어넣기 ( .val() 이용 )
- input값 가져와서 출력하기, 태그의 값 변경하기 ( .val(), .attr() 이용)
- 32가지 case별 태그에 스타일 넣는 방법
- select 태그 이용, 선택한 문자열을 input 태그에 삽입하는 예제.
### 0209
- input 태그를 배열로 관리
- select, optgroup, datalist, option 태그
- select 태그의 값을 다른 input에 자동으로 입력
### 0210
- progress 태그
- 태그의 속성값 가져오기 (.attr(element))
- <strong>semantic tag</strong> : header, nav(navigator), main, footer 로 이루어진 html 골격 구조
- addClass(), removeClass() 이용
- text-shadow 예제
### 0214
- prompt()함수를 이용해 윈도우 창으로 값 읽어오기
- 명시적/암묵적 형변환
- 객체 구조분해 (key.key.key.key........)
- 버튼으로 이미지 위치 변경
### 0217
- each문 학습(버튼과 input으로 응용)
- closure (내부 함수가 자신이 선언되었을때의 환경을 기억하여, 자신이 선언되었을때의 환경 밖에서 호출되어도, 그 환경을 기억할 수 있는 함수)
### 0221
- node.js 설치
- 터미널에서 javascript 명령어 사용하기 (node 명령어로 접속)
- react로 간단한 hello world 앱 만들기 (리액트 초기설정하는 방법, 프로젝트 생성및 관리와 빌드)
- [리액트 프로젝트 생성](https://velog.io/@rkdden12/React-1-Hello-World)
- 리액트는 SPA(Single Page Application)이다. 하나의 페이지에서 동작하는것.
- 함수형 Component 만들기(Components 폴더에 대문자로 ____.js 파일)
- (rafce + Enter : 자동완성)#
### 0224
- Hello.js, Say.js 같이 .js 가 들어간 파일을 컴포넌트라 칭한다/
- 컴포넌트는 일종의 UI 조각이라고 생각하면 이해하기 쉽다.
- JSX는 리액트에서 생김새를 정의할 때 사용하는 문법이다.
- Self Closing 태그 (하나의 태그에 닫힘이 들어간 태그)를 사용하면 하나의 태그로 바로 열고 닫힌 태그를 만들 수 있다.
- 두개 이상의 태그는 반드시 하나의 태그로 닫혀있어야 한다. 하지만 불필요한 태그 남용을 막기 위해 Fragment(이름없는 태그)를 사용 가능하다.
- JSX에서 style과 CSS 클래스를 설정하는 방법은 html과 다르게, camelCase 형태로 네이밍 해주어야 한다. (예를들면 background-color -> backgroundColor)
- JSX에서 Component에 parameter를 넘겨줄때 props를 사용한다. props를 여러개 넘겨주면 props.___로 사용 가능하다.
- 