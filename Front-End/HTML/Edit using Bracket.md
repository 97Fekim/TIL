# HTML 파일을 편집하기 전에,, 준비해야 할 것
- 폴더는 css, js, images, plugins 네개를 생성해둔다.

## css 폴더
- 실제 작업을 진행할 style.css 파일과 reset.css 파일 두가지를 준비한다.
- 꼭 reset.css 파일을 준비해 놓는다.
(html5doctor 사이트에서 제공하는 소스를 사용한다.)

## images 폴더
- 작업에 사용될 이미지들이 저장될 폴더이다.

## js
- 페이지를 동적으로 움직이게 하기 위한 소스들이 담길 디렉토리이다.

## plugins
- 

# 이미지 삽입
- img src = // 삽입시 원본 크기 그대로 삽입하기 때문에 스크롤바가 생긴다. 그래서 잘 사용하지 않는다. 다만, 태그로 width와 height를 100%로 지정해준다면 스크롤 없이 삽입할 수는 있다. 하지만 이래도 부자연스럽게 들어간다.
- 그래서 클래스를 이용하여 삽입하는 방식을 사용한다.
> div 태그에 class를 붙인후, css 파일에서 class에 url을 넣는다.<br>
><strong>그리고 html, body 태그와 함께, width height를 모두 100%로 적용해준다</strong>