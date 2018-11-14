import java.util.*;

public class detaileddifferences {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
		
			String s1 = sc.next();
			String s2 = sc.next();
			
			System.out.println(s1);
			System.out.println(s2);
       
			for(int j = 0; j < s1.length(); j++) {
				if(s1.charAt(j) == s2.charAt(j)) System.out.print(".");
				else System.out.print("*");
			}	
			System.out.println();
		}
		sc.close();
	}
}
