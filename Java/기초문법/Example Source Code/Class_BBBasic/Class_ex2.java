package class_ex;

public class Class_ex2 
{
	/* ����ƽ �޼ҵ� */
	public static int sum(int a, int b)
	{
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		Class_ex1 ex1 = new Class_ex1();	// ������(Ŭ���� �̸��� ������ �Լ�)
		// Class_ex1 (Ÿ��), ex1(��������/��ü)
		// Ŭ���� (���赵��)
		// Ŭ������ ������, ��ǰ(�ǹ�)�� �����Ѵ� => ��ü(Object/�ν��Ͻ�/instance)
		// ��ü���°� �޸𸮿� �ö� �����̴�.
		// �ڹ� ==> ��ü ���� ��� OOP(Object Oriented Program)
		// �׻� ��ü�� ���� �� Ŭ������ ����� �����ض�.
		// �����ڴ� ��ü ������ �ڵ����� ȣ���, new Ű����� �Բ� �����
		
		ex1.math = 70;
		ex1.eng = 30;
		ex1.korea = 100;
				
		int math = ex1.math;	// math�� ��������(local variable), ex1.math�� �������.
		int eng = ex1.eng;
		int korea = ex1.korea;
		int total = math + eng + korea;
		
		System.out.println(math + " " + eng + " " + korea + " " + total);
		System.out.println(Class_ex1.mung);
		
		System.out.println(ex1.avg(20.9f));
		
	}
}
