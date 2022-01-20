# 람다식이란?
- 함수(메소드)를 간단한 식(Expression)으로 표현하는 방법
- 함수형 인터페이스는 추상 메소드가 하나이다. >  하나의 인터페이스에 하나의 함수
- @FunctionalInterface Annotation을 붙이면, 함수형 인터페이스임을 자바가 알게 된다. Annotation을 안넣어도 상관 없다.

```
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
