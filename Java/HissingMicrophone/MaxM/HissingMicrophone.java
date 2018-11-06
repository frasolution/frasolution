/**
* Program : Hello World
* Problem ID : Week 2 Problem E
* Description : Hello World
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.07s
* Submission ID : 3358727
*/
import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for(int i=0; i<line.length()-1; i++) {
            if(line.charAt(i)== 's' && line.charAt(i+1)=='s'){
                System.out.println("hiss");
                return;
            }
        }
        System.out.println("no hiss");
        return;
    }
}