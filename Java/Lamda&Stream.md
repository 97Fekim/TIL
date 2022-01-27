# 람다식이란?
- 람다는 이름 없는 함수이다.
- 함수형 코드 방식이 객체지향 코드에 비해서 사람이 읽기에 편한 코드의 표현방식이므로, 람다식이 사용된다 
- 함수(메소드)를 간단한 식(Expression)으로 표현하는 방법
- 함수형 인터페이스는 추상 메소드가 하나이다. >  하나의 인터페이스에 하나의 함수
- @FunctionalInterface Annotation을 붙이면, 함수형 인터페이스임을 자바가 알게 된다. Annotation을 안넣어도 상관 없다.
- Optional은 null이 반환받을 가능성이 있는 변수를 선언할 때 사용한다. try catch를 지저분하게 사용하지 않을 수 있기 때문에 사용한다. 그리고 데이터를 꺼내올때는 .get()을 사용하여 꺼내온다
 
```java
@FunctionalInterface
public interface MySum { 
    public int sum(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        MySum func = (a,b) -> a+b;
        System.out.println(func.sum(10,11));
    }
}
-----------------------
<실행 결과>
21
```

- 함수가 일급 객체(시민) => function이 first citizen
- first citizen => 1) 함수가 변수에 저장
- 2) 함수가 다른 함수의 매개변수로 전달 가능
- 3) 함수가 다른 함수의 반환타입으로 반환됨


# 람다식의 stream
- map(), filter(), reduce() 안에는 모두 함수가 들어가야 한다.
## map
- 람다식의 명령문이라고 생각하면 된다.
## filter()
- 람다식의 if문(흐름제어)이라고 생각하면 된다. true, false만 반환한다.
## reduce()
- 람다식의 마지막(terminal operator)에만 들어간다

