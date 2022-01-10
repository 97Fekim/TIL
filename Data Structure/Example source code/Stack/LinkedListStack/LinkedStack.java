package LinkedListStack;

class LinkedStack implements Stack_interface
{
	private StackNode top;
	
	public boolean isEmpty()
	{
		return (top == null);
	}
	
	// 배열이 아니므로, isFull() 메소드는 필요가 없다.
	
	public void push(char data)
	{
		StackNode newNode = new StackNode();
		newNode.data = data;
		
		newNode.down = top;	// newNode는 마지막 노드가 되므로, newNode가 원래있던 top을 가리키도록 한다.
		top = newNode;	// newNode가 새로운 top이 된다.
	}
	
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("stack empty!");
			return 0;
		}
		else
		{
			char item = top.data;
			top = top.down;
			return item;
		}
	}
	
	public void delete()
	{
		if(isEmpty())
		{
			System.out.println("stack empty!");
		}
		else
		{
			top = top.down;
		}
	}
	
	public char peek()
	{
		if(isEmpty())
		{
			System.out.println("stack empty!");
			return 0;
		}
		else
		{
			return top.data;
		}
	}

	public void printStack()
	{	
		if(isEmpty())
		{
			System.out.println("stack empty!");
		}
		else
		{
			StackNode temp = top;
			System.out.println("Linked Stack >> ");
			while(temp != null)
			{
				System.out.printf("\t %c \n", temp.data);
				temp = temp.down;
			}
			System.out.println();
		}
	}
}

