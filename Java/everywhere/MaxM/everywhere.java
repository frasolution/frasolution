
/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: everywhere I've Been Everywhere, Man
* Link: https://open.kattis.com/problems/everywhere
* @author Dominic Nowak
* @author Maximilian Medlin
* @version 1.3, 11/14/2018
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12
*/

import java.util.*;

public class everywhere {
	public static void main(String args[]) {
		int cases, i;
		Scanner sc = new Scanner(System.in);
		cases = Integer.parseInt(sc.nextLine()); //idk but I parsed through the entire thing, I mean it doesn't make a diffrence because of wrapper classes but might aswell nextInt() here 
		
		for(i = 0; cases > i; i++ )	{
			int cities, j;
			HashSet<String> hs = new HashSet<String>();
			cities = Integer.parseInt(sc.nextLine());
			for( j = 0 ; cities > j ; j++) { //read for the amount of cities we have
				hs.add(sc.nextLine()); //no need to check in the object is in the set due to hashset
			}
			System.out.println(hs.size()); //print the size of the set because that does not include any double mentions
		}
	sc.close();
	}
}
