import java.util.Arrays;


public class Tester {

	public static void main(String[] args) {
		String ss[]={"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		
		System.out.println("Ascend:");
		for(int n=0;n<ss.length;n++)
		{
		System.out.println(ss[n]);
		}	
		
	}

}
