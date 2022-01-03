
public class func_test {

	public static void test()
	{
		System.out.println("test 함수가 호출되었어요");
	}
	
	public static void test2()
	{
		System.out.println("test2 함수가 호출되었어요");
	}
	
	public static int test3()
	{
		System.out.println("test3 함수가 호출되며 정수를 반환합니다");
		return 5;
	}
	
	public static int test4(int i, int j)
	{
		System.out.println("test4 함수가 호출되며 정수를 반환합니다");
		return i + j;
	}
	
	public static int test5(int i, int j, int v)
	{
		System.out.println("test5 함수가 호출되며 정수를 반환합니다");
		return i + j*v;
	}
	
	public static void main(String[] args) 
	{
		/* void 함수 */
		test();
		test2();
		
		/* 정수를 반환하는 함수 */
		int i = test3();
		System.out.println(i);
		
		/* 정수 두개를 더해 반환하는 함수 */
		int j = test4(500,1000);
		System.out.println(j);
		
		// 문제4) 위의 test5함수 호출하여 결과를 출력하세요
		int k = test5(100,500,700);
		System.out.println(k);
	}
}
