# Java에서 해쉬맵 사용하기
<strong>사용법</strong>
```
import java.util.HashMap;
import java.util.Map;
```

## 1. 키(Key), 값(Value) 저장(put), 읽기(get) 예

```
public class Main 
{
	public static void main(String[] args)
    {
		Map<String,Integer> map=new HashMap();	//<키 자료형, 값 자료형>
		map.put("A", 100);
		map.put("B", 101);
		map.put("C", 102);
		map.put("C", 103); //중복된 key가 들어갈때는 이전 키,값을 지금의 것으로 업데이트
		System.out.println(map);
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("C"));
	}
}
------------------------------------------------------------------
{A=100, B=101, C=103}
100
101
103
```
## 2. containsKey, containsValue
- <code>containsKey(key)</code> : 해당 key에 상응하는 Value가 있는지 확인한다.
- <code>contatinsValue(Value)</code> : 해당 Value에 상응하는 Key가 있는지 확인한다.

## 3. putAll
- <code>map1.putAll(map2)</code> : map1에게 map2의 모든 데이터를 넘겨준다.
- 아래처럼 <code>putAll</code> 메소드 대신, 생성과 동시에 map의 모든 데이터를 넘겨줄 수도 있다.
```
Map<String,Integer> map2=new HashMap(map1);
```

## 4. keySet을 사용한 모든 키 순회
- list처럼 증가하는 index를 사용할 방법이 없지만 keySet 메소드를 이용하여 키를 Set으로 넘겨주어 Map에 존재하는 키를 모두 순회할 수 있다.
```
public static void main(String[] ar) 
{
	Map<String,Integer> map=new HashMap();
	map.put("key1",50);
	map.put("key2",100);
	map.put("key3",150);
	map.put("key4",200);
		
	System.out.println("All key-value pairs");
	for(String key:map.keySet()) {
		System.out.println("{"+key+","+map.get(key)+"}");
	}
}
-----------------------------------
All key-value pairs
{key1,50}
{key2,100}
{key3,150}
{key4,200}
```

## 5. Foreach() 메소드로 순환하기

```
Map<String,Integer> hm = new HashMap();
hm.put("http", 80);
hm.put("ssh", 22);
hm.put("dns", 53);
hm.put("telnet",23);
hm.put("ftp", 21);
hm.forEach((key,value)->
{
    System.out.println("{"+key+","+value+"}");
});
-----------------------------------
{ftp,21}
{telnet,23}
{dns,53}
{http,80}
{ssh,22}
```

## 참고문헌
https://reakwon.tistory.com/151
