package LinkedListStack;

public class Main_class
{
	public static void main(String[] args)
	{
		LinkedStack stack1 = new LinkedStack();
		
		stack1.push('A');
		stack1.push('B');
		stack1.push('C');
		stack1.push('D');
		stack1.push('E');
		stack1.printStack();
		
		stack1.delete();
		stack1.delete();
		stack1.delete();
		stack1.printStack();
		
		stack1.push('X');
		stack1.push('Y');
		stack1.push('Z');
		stack1.printStack();
		
		char pop_temp = stack1.pop();
		System.out.println("pop_temp : "+pop_temp);
		stack1.printStack();
		
		char peek_temp = stack1.peek();
		System.out.println("peek_temp : "+peek_temp);
		stack1.printStack();
		
	}
}
