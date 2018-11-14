import java.util.*;

public class everywhere {
	public static void main(String args[]) {
		int cases, i;
		Scanner sc = new Scanner(System.in);
		cases = Integer.parseInt(sc.nextLine());
		
		for(i = 0; cases > i; i++ )	{
			int cities, j;
			HashSet<String> hs = new HashSet<String>();
			cities = Integer.parseInt(sc.nextLine());
			for( j = 0 ; cities > j ; j++) {
				hs.add(sc.nextLine());
			}
			System.out.println(hs.size());
		}
	sc.close();
	}
}
