public class LinkedList_ex 
{
	public static void main(String[] args) 
	{
		LinkedList list1 = new LinkedList();
		list1.insertLastNode("AAA");
		list1.insertLastNode("BBB");
		list1.insertLastNode("CCC");
		list1.insertLastNode("DDD");
		list1.deleteLastNode();
		list1.prinList();
		
		ListNode temp;
		temp = list1.searchNode("CCC");
		list1.insertMiddleNode(temp, "XXX");
		list1.insertMiddleNode(temp, "YYY");
		list1.insertMiddleNode(temp, "ZZZ");
		list1.prinList();
	}
}

class LinkedList
{
	private ListNode head;
	
	/* Constructor */
	public LinkedList()
	{
		head = null;
	}
	
	public void insertMiddleNode(ListNode pre, String data)
	{
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	
	public void insertLastNode(String data)
	{
		ListNode newNode = new ListNode(data);
		if(head == null)
			 this.head = newNode;
		else
		{
			ListNode temp = head;
			while(temp.link != null)
				temp = temp.link;
			temp.link = newNode;
		}
	}
	
	public void deleteLastNode()
	{
		if(head == null)
			return ;
		if(head.link == null)
			head = head.link;
		else
		{
			ListNode temp = head.link;
			ListNode pre = head;
			while(temp.link != null)
			{
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
		
	}
	
	public void prinList()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData() + " ");
			temp = temp.link;
		}
	}
	
	ListNode searchNode(String data)
	{
		ListNode temp = head;
		while(temp != null)
		{
			if(temp.getData() == data)
				return temp;
			else
				temp = temp.link;
		}
		return temp;
	}
}


class ListNode
{
	private String data;
	public ListNode link;
	
	/* Constructor */
	public ListNode()
	{
		this.data = null;
		this.link = null;
	}
	public ListNode(String data)
	{
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link)
	{
		this.data = data;
		this.link = link;
	}
	public String getData()
	{
		return this.data;
	}
}
