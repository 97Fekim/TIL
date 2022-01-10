package LinkedListStack;

public interface Stack_interface 
{
	/* ������ �������� �ƴ����� Ȯ�� */
	boolean isEmpty();
		
	/* ������ top�� item�� �����ϴ� ���� */
	void push(char item);
	
	/* ������ top�� �ִ� ���Ҹ� ���ÿ��� �����ϰ� ��ȯ�ϴ� ���� */
	char pop();
	
	/* ������ top�� �ִ� ���Ҹ� �����ϴ� ���� */
	void delete();
	
	/* ������ top�� �ִ� ���Ҹ� �������� �ʰ� ��ȯ�ϴ� ���� */
	char peek();
}
