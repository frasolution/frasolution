/**
* Program : Quadrant Selection
* Problem ID : Week 1 Problem E
* Description : Select which Quadrant the point is in
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.07s
* Submission ID : 3308241
 */

import java.util.Scanner;

public class quadrantselct {
    public static void main(String[] args) {
        int i_scanner_1, i_scanner_2;//var initilizations
        Scanner sc = new Scanner(System.in); //initilize scanner
        i_scanner_1 = sc.nextInt(); // scann the x cordinate
        i_scanner_2 = sc.nextInt(); //
        sc.close(); //kill scanner object
        if(i_scanner_1  > 0 && i_scanner_2 > 0) System.out.println(1);
        if(i_scanner_1  < 0 && i_scanner_2 > 0) System.out.println(2);
        if(i_scanner_1  < 0 && i_scanner_2 < 0) System.out.println(3);
        if(i_scanner_1  > 0 && i_scanner_2 < 0) System.out.println(4);
    }
}
