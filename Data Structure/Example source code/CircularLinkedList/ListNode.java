package CircularLinkedList;

public class ListNode 
{
	String data;
	ListNode link;
	
	/* 생성자 */
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
	public ListNode(String data, ListNode node)
	{
		this.data = data;
		this.link = node;
		this.link = null;
	}
	
	/* 자료 반환 */
	public String getData()
	{
		return this.data;
	}
}
