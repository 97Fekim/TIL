- javascript에서 객체는 key, value의 쌍으로 이루어진 데이터이다.

- 반복문을 사용하여 배열을 다룰때 다음처럼 활용 가능
```javascript
const f = (i) => {
    for(const u of i){
        //
    }
}
```
- spread operator : 자바의 가변인자. 아래의 코드처럼, ...u 는 어떤 인자를 받던 간에 배열처럼 관리한다.
```javascript
const f = (...u) => {   // 자바의 가변인자
            var sum = 0;        // spread operator, c++
            for(const i of u){
                sum += i;
            }
            return sum;
        }
        console.log(f(2,3,4,5,6,8));
```