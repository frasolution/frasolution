/**
* Program : Ladder
* Problem ID : Week 1 Problem C
* Description : Calculating the possible length of the ladder
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.08s
* Submission ID : 3300872
 */
import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        double h, v;
        Scanner sc = new Scanner(System.in);
        h = sc.nextDouble();
        v = sc.nextDouble();
        System.out.println((int)(Math.ceil(h/(Math.sin(v*Math.PI/180))))); //output
    }
}