package class_learning;
import java.util.ArrayList;
import java.util.List;


public class Car_main 
{
	public static void main(String[] args) 
	{
		List<Car> cars = new ArrayList<>();
		
		for(int i = 0; i < 30; ++i)
		{
			Car car = new Car();
			car.setColor("����� : " + (int)(Math.random()*10));
			car.setName("������ : " + (int)(Math.random()*100));
			car.setWindowNumber((int)(Math.random()*1000));
			car.setDoorNumber((int)(Math.random()*10000));
			cars.add(car);
		}
		
		for(Car i : cars)
		{
			System.out.println("���� : "+i.getColor());
			System.out.println("�̸� : "+i.getName());
			System.out.println("���� ���� : "+i.getDoorNumber());
			System.out.println("���� : "+i.getColor());
			System.out.println("----------------------");
		}

	}
}
