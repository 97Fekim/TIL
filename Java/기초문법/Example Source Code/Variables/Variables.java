package Jungsuck;

public class Variables 
{
	public static void main(String[] args) 
	{
		/* ���� �ڷ��� */
		int a = 7;
		float f = 111.111f;
		double d = 1111.1111d;
		System.out.println(a+f+d);
		
		/* ���� �ڷ��� */
		Class_Truck truck1 = new Class_Truck(1, "Fe1", 1, 1);
		Class_Truck truck2 = new Class_Truck(2, "Fe2", 2, 2);
		Class_Truck truck3 = new Class_Truck(3, "Fe3", 3, 3);
		Class_Truck truck4 = new Class_Truck(4, "Fe4", 4, 4);
		
		/* Ŭ���� �迭 */
		Class_Truck[] trucks = new Class_Truck[4];
		trucks[0] = truck1;
		trucks[1] = truck2;
		trucks[2] = truck3;
		trucks[3] = truck4;
		
		/* Ŭ���� �迭�� ��� ��� */
		for(int i = 0; i < 4; ++i)
		{	
			System.out.println("Ʈ��"+ (i+1) + "�� ���� ���� : " + trucks[i].getDoor());
			System.out.println("Ʈ��"+ (i+1) + "�� ������ �̸� : " + trucks[i].getName());
			System.out.println("Ʈ��"+ (i+1) + "�� ���� : " + trucks[i].getPrice());
			System.out.println("Ʈ��"+ (i+1) + "�� �ڵ� : " + trucks[i].getHandle());
			System.out.println('\n');
		}
		
		for(Class_Truck i: trucks)
		{
			System.out.println(i.getDoor());
			System.out.println(i.getName());
			System.out.println(i.getPrice());
			System.out.println(i.getHandle());
			System.out.println('\n');
		}
		
		
	}
}
