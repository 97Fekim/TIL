# StringBuffer 사용하기

## String과 StringBuffer 차이점
- String은 고정된 길이의 불변 문자열이다. 그래서 String 객체를 변경시 실제로 변경되는 것이 아닌 새로운 String 객체를 생성한다. 하지만 StringBuffer와 StringBuilder는 그 객체 자체가 변경된다.
- <strong>따라서 문자열의 변경이 잦은 작업이라면 StringBuffer 또는 StringBuilder 클래스의 사용을 고려한다.</strong>
- 멀티쓰레드의 환경 여부에따라 고려해야할 점도 있지만, 쓰레드를 모르는 현재 작성 시점에서는 넘어간다.

## 생성
- 기본 생성자
: <code>String Buffer sb = new StringBuffer();</code>
- int size 값을 인자로 하는 생성자 : buffer의 사이즈를 지정한다.
: <code>StringBuffer sb = new StringBuffer(20);</code>
- String 문자열을 인자로 하는 생성자 : 제일 많이 사용하는 생성자
: <code>StringBuffer sb = new StringBuffer("Yang");</code>

## StringBuffer 메소드
- 1. <code>append() </code> : 문자열을 추가하기 위해 사용한다.
- 2. <code>length(), capacity()</code> : 문자열의 길이나 전체 할당된 capacity를 구한다.
- 3. <code>insert</code> : 문자열을 맨 뒤에 삽입하는 append()와 달리 시작 인덱스를 지정하여 원하는 위치에 삽입할 수 있다.
- 4. <code>reverse()</code> : 문자열을 뒤집을 때 사용한다.
- 5. <code>delete(), deleteCharAt()</code> : 인덱스를 지정하여 문자열의 일부분을 삭제하거나 한 문자만 삭제할 때 사용한다. (deleteCharAt(int start, int end) 에서 start 인덱스부터 (end-1) 인덱스까지가 삭제됨에 유의한다.)
- 6. <code>replace()</code> : 문자열의 일부분을 다른 문자열로 치환할 수 있다. (문자열의 인덱스는 0부터 시작하며, start 인덱스부터 (end-1)인덱스까지가 치환됨에 유의한다.)

## 출처
https://yangbox.tistory.com/58 [양's World])