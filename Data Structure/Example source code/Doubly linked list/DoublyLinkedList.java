package DoublyLinkedList;

public class DoublyLinkedList
{
	ListNode head;
	ListNode tail;
	int size = 0;
	
	public DoublyLinkedList()
	{
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	
	public void insertFirstNode(String data)
	{
		ListNode newNode = new ListNode(data);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else if(head != null)
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void insertMiddleNode(int index, String data)
	{
		if(index == 0)
		{
			insertFirstNode(data);
		}
		else if(index == size)
		{
			insertLastNode(data);
		}
		else
		{
			ListNode newNode = new ListNode(data);
			ListNode prevNode = getNode(index-1);
			ListNode nextNode = prevNode.next;
			
			// 새 노드의 전후 설정
			newNode.prev = prevNode;
			newNode.next = nextNode;
			
			// 이전 노드의 전후 설정
			prevNode.next = newNode;
			
			// 이후 노드의 전후 설정
			nextNode.prev = newNode;
			
			size++;
		}
	}
	
	public void insertLastNode(String data)
	{
		if(size == 0)
		{
			insertFirstNode(data);
		}
		else
		{
			ListNode newNode = new ListNode(data);
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			size++;
		}
	}
	
	public String removeFirstNode()
	{
		if(size == 0)
		{
			return null;
		}
	
		ListNode removeNode = head;
		head = null;
		head = removeNode.next;
		head.prev = null;
		size--;
		
		return removeNode.getData();
		
	}
	
	public String removeLastNode()
	{
		if(size==0)
		{
			return null;
		}
		else
		{
			ListNode removeNode = tail;
			tail = null;
			tail = removeNode.prev;
			tail.next = null;
			size--;
			return removeNode.getData();
		}
	}
	
	public String removeMiddleNode(int index)
	{
		if(size == 0)
			return null;
		
		if(index == 0)
			return removeFirstNode();
		else if(index == size-1)
			return removeLastNode();
		else
		{
			ListNode removeNode = getNode(index);
			ListNode prevNode = removeNode.prev;
			ListNode nextNode = removeNode.next;
			
			prevNode.next = nextNode;
			nextNode.prev = prevNode;
			size--;
			return removeNode.getData();
		}
	}
	
	public ListNode getNode(int index)
	{
		if(index < size/2)
		{
			ListNode node = head;
			for(int i = 0; i < index; i++)
			{
				node = node.next;
			}
			return node;
		}
		else
		{
			ListNode node = tail;
			for(int i = size-1; i > index; i--)
			{
				node = node.prev;
			}
			return node;
		}
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer("[");
		if(size != 0)
		{
			ListNode node = head;
			result.append(node.getData());
			while(node.next != null)
			{
				node = node.next;
				result.append(", ");
				result.append(node.getData());
			}
		}
		result.append("]");
		return result.toString();
		
	}

}
