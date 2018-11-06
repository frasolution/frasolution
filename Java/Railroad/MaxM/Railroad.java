/**
* Program : Hello World
* Problem ID : Week 2 Problem A
* Description : Hello World
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.07s
* Submission ID : 3358904
*/
import java.util.Scanner;

public class Railroad {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        x = y % 2;
        if( x == 0) System.out.println("possible");
        else System.out.println("impossible");
        sc.close();
    }
}