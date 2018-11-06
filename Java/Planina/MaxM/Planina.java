/**
* Program : Hello World
* Problem ID : Week 2 Problem D
* Description : Hello World
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.07s
* Submission ID : 3286396
*/

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int) Math.pow( (int) Math.pow(2, n) + 1 , 2)); //this was way to much effort to fix that floats arent accepted
    }
}