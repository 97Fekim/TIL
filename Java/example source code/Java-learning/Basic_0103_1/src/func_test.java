
public class Func_test {

	public static void test()
	{
		System.out.println("test �Լ��� ȣ��Ǿ����");
	}
	
	public static void test2()
	{
		System.out.println("test2 �Լ��� ȣ��Ǿ����");
	}
	
	public static int test3()
	{
		System.out.println("test3 �Լ��� ȣ��Ǹ� ������ ��ȯ�մϴ�");
		return 5;
	}
	
	public static int test4(int i, int j)
	{
		System.out.println("test4 �Լ��� ȣ��Ǹ� ������ ��ȯ�մϴ�");
		return i + j;
	}
	
	public static int test5(int i, int j, int v)
	{
		System.out.println("test5 �Լ��� ȣ��Ǹ� ������ ��ȯ�մϴ�");
		return i + j*v;
	}
	
	public static void main(String[] args) 
	{
		/* void �Լ� */
		test();
		test2();
		
		/* ������ ��ȯ�ϴ� �Լ� */
		int i = test3();
		System.out.println(i);
		
		/* ���� �ΰ��� ���� ��ȯ�ϴ� �Լ� */
		int j = test4(500,1000);
		System.out.println(j);
		
		// ����4) ���� test5�Լ� ȣ���Ͽ� ����� ����ϼ���
		int k = test5(100,500,700);
		System.out.println(k);
	}
}