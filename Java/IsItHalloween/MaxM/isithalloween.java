
/**
* Advanced Object Oriented Programming with Java, WS 2018
* Problem: isithalloween IsItHalloween.com
* Link: https://open.kattis.com/problems/isithalloween
* @author Dominic Nowak
* @author Maximilian Medlin
* @version 1.0, 11/14/2018
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.07
*/

import java.util.Scanner;

public class isithalloween{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" "); 
        
        String month = input[0]; // I know it's unnecesary but it's easier to read and will compile to the same size of code in binaries
        month = month.toUpperCase(); //compensate that user enterst lowercase, you never know
        int day = Integer.parseInt(input[1]); // because we have a single input line we need to parse the int from 2nd elem in the string

        //Condition HELLOWEEN
        if(month.equals("OCT") && day == 31 ){ //I did not know that .equals was required comming from NodeJS and C please
            System.out.println("yup");
            return;
        }
        
        // CONDITION DEC 25
        if(day == 25 && month.equals("DEC") ){
            System.out.println("yup");
            return;
        }

        // ANY OTHER DAY
        System.out.println("nope");

    }
}
