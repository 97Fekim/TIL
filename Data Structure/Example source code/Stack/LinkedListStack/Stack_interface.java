package LinkedListStack;

public interface Stack_interface 
{
	/* 스택이 공백인지 아닌지를 확인 */
	boolean isEmpty();
		
	/* 스택의 top에 item을 삽입하는 연산 */
	void push(char item);
	
	/* 스택의 top에 있는 원소를 스택에서 삭제하고 반환하는 연산 */
	char pop();
	
	/* 스택의 top에 있는 원소를 삭제하는 연산 */
	void delete();
	
	/* 스택의 top에 있는 원소를 삭제하지 않고 반환하는 연산 */
	char peek();
}
