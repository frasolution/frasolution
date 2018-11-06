/**
* Program : Take Two Stones
* Problem ID : Week 2 Problem A
* Description : Take Two Stones
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.07s
* Submission ID : 3346785
 */
import java.util.Scanner;
public class takeTwoStones {
    public static void main(String[] args) {
        int a;
        boolean isEven;
        Scanner sc = new Scanner(System.in); //initilize scanner
        a = sc.nextInt();
        sc.close(); //kill scanner object
        isEven = (a % 2) == 0;
        if(isEven == true) System.out.println("Bob");
        else System.out.println("Alice");
    }
}