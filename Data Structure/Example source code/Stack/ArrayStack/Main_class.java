package ArrayStack;

public class Main_class
{

	public static void main(String[] args)
	{
		ArrayStack stack1 = new ArrayStack(10);

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
		
		char delete_temp = stack1.peek();
		System.out.println("temp : " + delete_temp);		
		stack1.printStack();
		
		char pop_temp = stack1.pop();
		System.out.println("temp : " + pop_temp);
		stack1.printStack();
	
		stack1.delete();	
		stack1.printStack();
		
		
	}

}
