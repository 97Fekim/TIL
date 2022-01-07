package CircularLinkedList;

public class CircularLinkedList 
{
	private ListNode CL;
	
	/* ������ */
	public CircularLinkedList()
	{
		this.CL = null;
	}
	
	/* ������ ��忡 ���� */
	public void insertLastNode(String str)
	{
		ListNode newNode = new ListNode(str);
		
		/* ����Ʈ�� ����ִ� ��� */
		if(CL == null)
		{
			CL = newNode;		
			newNode.link = CL;	
		}
		else
		{
			ListNode temp = new ListNode();
			temp = CL;
			while(temp.link != CL)
			{
				temp = temp.link;	
			}
			newNode.link = temp.link;		
			temp.link = newNode;		
		}
	}
	
	/* ù��° ��忡 ����*/
	public void insertFirstNode(String str)
	{
		ListNode newNode = new ListNode(str);
		if(CL == null)
		{	
			CL = newNode;
		}
		else
		{
			ListNode temp = CL;
			while(temp.link != CL)
			{
				temp = temp.link;
			}
			newNode.link = temp.link;
			temp.link = newNode;
			CL = newNode;
		}
	}
	
	/* �߰� ��忡 ���� */
	public void insertMiddleNode(String str, ListNode pre)
	{
		ListNode newNode = new ListNode(str);
		if(CL == null)
			CL = newNode;
		else
		{
			newNode.link = pre.link;
			pre.link = newNode.link;
		}
	}
	
	/* ������ ��� ���� */
	public void deleteLastNode()
	{
		if(CL == null)
			return ;
		else
		{
			ListNode prev = CL;
			ListNode temp = prev.link;
			while(temp.link != CL)
			{
				prev = temp;
				temp = temp.link;
			}
			prev.link = temp.link;
		}
	}
	
	/* ù��° ��� ���� */
	public void deleteFirstNode()
	{
		if(CL == null)
			return ;
		else
		{
			ListNode temp = CL;
			while(temp.link != CL)
			{
				temp = temp.link;
			}
			ListNode old = temp.link;
			CL = old.link;
			temp.link = CL;
		}
			
	}
	
	/* �߰���� ���� */
	public void deleteMiddleNode(String str)
	{
		if(CL == null)
			return ;
		else
		{
			ListNode prev = CL;
			ListNode temp = CL.link;
			while(temp.data != str)
			{
				prev = temp;
				temp = temp.link;
			}
			prev.link = temp.link;	
		}
	}
	
	/* ��� �˻� */
	public ListNode searchNode(String str)
	{
		if(CL == null)
			return null;
		else
		{
			ListNode temp = CL;
			while(temp.data != str)
			{	
				temp = temp.link;
			}
		return temp;
		}
	}
	
	/* ����Ʈ ��� */
	public void printList()
	{
		if(CL == null)
			return ;
		else
		{
			ListNode temp = CL;
			while(temp.link != CL)
			{
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
	}
	
}
