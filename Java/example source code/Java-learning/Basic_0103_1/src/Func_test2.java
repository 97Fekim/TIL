
public class Func_test2 {
	
	public static String calcGrade(int math, int eng, int korea)
	{
		int total = math + eng + korea;
	    String grade = new String();
	    int avg = total / 3;
	    
	    if (avg > 90)
	        grade = "수";
	    else if(avg >= 80)
	        grade = "우";
	    else if(avg >= 70)
	        grade = "미";
	    else if(avg >= 60)
	        grade = "양";
	    else
	        grade = "가";
	    
	    return grade;
	}
	
	public static void main(String[] args) {
		
	String Fekim = calcGrade(1000,55,30);
	System.out.println(Fekim);
		
	}
}
