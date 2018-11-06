/**
* Program : Sibice
* Problem ID : Week 2 Problem C
* Description : Hello World
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.08s
* Submission ID : 3358562
 */
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args){
        int n, i;//matches on flor
        int w;//width
        int h;//height
        int size; //entered value size
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        double var_sqrt = Math.sqrt(w*w+h*h);
        for(i = 0; i < n; i++ ){
            size = sc.nextInt();
            if(size > var_sqrt ) System.out.println("NE");
            else System.out.println("DA");
        }
    }
}