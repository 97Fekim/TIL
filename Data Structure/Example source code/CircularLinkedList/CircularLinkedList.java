package CircularLinkedList;

public class CircularLinkedList 
{
	private ListNode CL;
	
	/* 생성자 */
	public CircularLinkedList()
	{
		this.CL = null;
	}
	
	/* 마지막 노드에 삽입 */
	public void insertLastNode(String str)
	{
		ListNode newNode = new ListNode(str);
		
		/* 리스트가 비어있는 경우 */
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
	
	/* 첫번째 노드에 삽입*/
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
	
	/* 중간 노드에 삽입 */
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
	
	/* 마지막 노드 삭제 */
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
	
	/* 첫번째 노드 삭제 */
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
	
	/* 중간노드 삭제 */
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
	
	/* 노드 검색 */
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
	
	/* 리스트 출력 */
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
