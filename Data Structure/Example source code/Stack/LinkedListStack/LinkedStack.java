package LinkedListStack;

class LinkedStack implements Stack_interface
{
	private StackNode top;
	
	public boolean isEmpty()
	{
		return (top == null);
	}
	
	// �迭�� �ƴϹǷ�, isFull() �޼ҵ�� �ʿ䰡 ����.
	
	public void push(char data)
	{
		StackNode newNode = new StackNode();
		newNode.data = data;
		
		newNode.down = top;	// newNode�� ������ ��尡 �ǹǷ�, newNode�� �����ִ� top�� ����Ű���� �Ѵ�.
		top = newNode;	// newNode�� ���ο� top�� �ȴ�.
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

