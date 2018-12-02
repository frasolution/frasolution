
/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: detaileddifferences Detailed Differences
* Link: https://open.kattis.com/problems/detaileddifferences
* @author Dominic Nowak
* @author Maximilian Medlin
* @version 1.0, 11/14/2018
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.19
*/

/**
 * 2018-11-14 20:09:04
 * 
 * v1
 * 
 */

import java.util.*;

public class detaileddifferences {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); //get number of cases
		
		for(int i = 0; i < count; i++) {
		
			String s1 = sc.next(); //scan string 1
			String s2 = sc.next(); //scan string 2
			
			System.out.println(s1); //print string 1
			System.out.println(s2); //print string 2
       
			for(int j = 0; j < s1.length(); j++) {
				if(s1.charAt(j) == s2.charAt(j)) Systemout.print("."); //if chars are the same print
				else System.out.print("*"); //else print
			}	
			System.out.println(); //newline
		}
		sc.close();
	}
}
