package Jungsuck;

public class Variables2 {
	public static void main(String[] args) {
		
		/* ���ڿ� �迭 �� ���� ���� ���� */
		String[] str = {"a","b","c","d","e","f","g"};
		System.out.println(str.length);
		System.out.println(str[(int)(Math.random()*6)]);
				
		int len = str.length;
		for(int i = 0; i < len; ++i)
		{	
			str[i] = "" + (int)(Math.random()*6);
			System.out.println(str[i]);
		}
		
	}
}