package DoublyLinkedList;

public class ListNode
{
	public ListNode prev;
	private String data;
	public ListNode next;
	
	public ListNode()
	{
		this.prev = null;
		this.data = null;
		this.next = null;
	}
	
	public ListNode(String data)
	{
		this.prev = null;
		this.data = data;
		this.next = null;
	}
	
	public String getData()
	{
		return this.data;
	}
}
