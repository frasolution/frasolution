
/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: queens Verify This, Your Majesty
* Link: https://open.kattis.com/problems/queens
* @author Dominic Nowak
* @author Maximilian Medlin
* @version 1.3, 11/22/2018
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.17 
*/

import java.util.*;
import java.lang.*;

public class queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> varxh = new HashSet<Integer>();  // checks if [-]
        HashSet<Integer> varyh = new HashSet<Integer>();  // checks if [|]
        HashSet<Integer> vary = new HashSet<Integer>();   // checks if [/] is above midline
        HashSet<Integer> varx = new HashSet<Integer>();   // checks if [/] is below midline
        HashSet<Integer> varc = new HashSet<Integer>();   // checks if [\] 
        
        int counter = 0;
        int size = sc.nextInt();
        for(int for_i = 0 ; for_i < size ; for_i++ ) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            // j is x axis && i is y axis
            //checks for [|]
            if(!varyh.contains(i)) varyh.add(i); //checking if this value has been there in the y axis
            else{
                System.out.println("INCORRECT"); //if the value is allready in the hashset that means there is allready another value on the | so we have an impossible value
                return;
            }

            //checks for [-]
            if(!varxh.contains(j)) varxh.add(j); //checking if this value has been there in the x axis
            else{
                System.out.println("INCORRECT"); //if the value is allready in the hashset that means there is allready another value on the - so we have an impossible value
                return;
            }

            //checks for [/]                    
            if(j>=i){
                int local = j - i ;
                if(!varx.contains(local)) varx.add(local); //checking if this value has been there in the x axis
                else{
                    System.out.println("INCORRECT"); //if the value is allready in the hashset that means there is allready another value on the - so we have an impossible value
                    return;
                }
            }
            if(i>j){
                int local = i - j ;
                if(!vary.contains(local)) vary.add(local); //checking if this value has been there in the x axis
                else{
                    System.out.println("INCORRECT"); //if the value is allready in the hashset that means there is allready another value on the - so we have an impossible value
                    return;
                }
            }
            
            // checks for [\]                    
            int local = j + i;
            if(!varc.contains(local)) varc.add(local); //checking if this value has been there in the x axis
            else{
                System.out.println("INCORRECT"); //if the value is allready in the hashset that means there is allready another value on the - so we have an impossible value
                return;
            }

            //counter for excatly 8 queens
            counter ++;
                    
        }
        //checks for exactly 8 queens with the value from counter
        if(counter == size) System.out.println("CORRECT");
        else System.out.println("INCORRECT");
        return;
        
    }
    
}