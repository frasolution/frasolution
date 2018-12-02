
/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: icpcawards ICPC Awards
* Link: https://open.kattis.com/problems/icpcawards
* @author Dominic Nowak
* @author Maximilian Medlin
* @version 1.1, 11/15/2018
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.09
*/

import java.util.*;

public class icpcawards{
    public static void main(String args[]) {
    
        HashSet<String> uni = new HashSet<String>(); //use hashset to only save uni name and see if allready in set
        
        Scanner sc = new Scanner(System.in);

        int imAllreadyTracer = 0, contestents = Integer.parseInt(sc.nextLine()); //number of entry possition in array, number of contestents

        String[] unis = new String[contestents]; // make string array for uni
        String[] teams = new String[contestents]; //make string array for team names

        for(int i = 0; i < contestents; i++) {
            String[] input = sc.nextLine().split(" "); //split uni and team in input array
            if(!uni.contains(input[0])){ //use hashset to only save uni name and see if allready in set
                uni.add(input[0]); //if not allready in there include uni in set
                unis[imAllreadyTracer] = input[0]; //save the uni
                teams[imAllreadyTracer] = input[1]; // and team combo to be printed later, you could use one array for sure with konkatonation 
                imAllreadyTracer++; //up the entry point
            }
        }
        for(int i = 0; i < 12; i++) System.out.println(unis[i] + " " + teams[i]); //output solutions
    }
}
