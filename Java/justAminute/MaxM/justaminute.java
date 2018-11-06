/**
* Program : Just a Minute
* Problem ID : Week 1 Problem H
* Description : CALCULATE THE SL MINUTE
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.19s
* Submission ID : 3316308
 */

import java.util.Scanner;

public class justaminute {
    public static void main(String[] args) {
        double i, i_scanner_1, i_scanner_2 = 0, i_scanner_3 = 0;
        Scanner sc = new Scanner(System.in); //initilize scanner
        i_scanner_1 = sc.nextDouble();
        for(i = 0; i < i_scanner_1; i++){
            i_scanner_2 = sc.nextDouble() + i_scanner_2; // scann and add new amount
//             System.out.println(i_scanner_2);
            i_scanner_3 = sc.nextDouble() + i_scanner_3; // scann and add new amount
//             System.out.println(i_scanner_3);
        }
        sc.close(); //kill scanner object
        double out = (i_scanner_3/60.0)/i_scanner_2;
        if(out <= 1) System.out.println("measurement error");
        else System.out.println(out);
    }
}