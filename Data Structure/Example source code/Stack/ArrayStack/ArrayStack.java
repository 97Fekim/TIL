package ArrayStack;

class ArrayStack implements Stack_interface 
{
	private int top;
	private int stackSize;
	private char itemArray[];
	
	/* Constructor */
	public ArrayStack(int stackSize)
	{
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == stackSize -1);
	}
	
	public void push(char item)
	{
		if(isFull())
		{
			System.out.println("stack full!");;
		}
		else
		{
			itemArray[++top] = item;
		}
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
			return(itemArray[top--]);
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
			top--;
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
			return itemArray[top];
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
			System.out.printf("Array stack >> ");
			for(int i = 0; i <= top; ++i)
			{
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
	}

}
