/**
* Program : GrassSeedInc
* Problem ID : Week 2 Problem H
* Description : Hello World
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.11s
* Submission ID : 3358813
*/
import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); //price
        int l = sc.nextInt(); //lawns
        int i;
        double h, w, p = 0; //height, width, final price
        for(i = 0; i < l; i++){
            h = sc.nextDouble();
            w = sc.nextDouble();
            p = p + ( h * w );
        }
        System.out.println(p * c); //output apperantly no set precision needed
    }
}