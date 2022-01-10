package DoublyLinkedList;

public class Main_class
{

	public static void main(String[] args)
	{
		DoublyLinkedList list1 = new DoublyLinkedList();
		list1.insertFirstNode("aaa");
		list1.insertFirstNode("zzz");
		list1.removeMiddleNode(0);
		
		System.out.println(list1.toString());
	}
}

