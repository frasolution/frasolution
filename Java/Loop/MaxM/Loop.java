/**
* Program : Stuck In A Time Loop
* Problem ID : Week 1 Problem D
* Description : Looping starting with 1
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.08s
* Submission ID : 3301770
 */
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        int i_scanner_1, i_loop;
        Scanner sc = new Scanner(System.in); //initilize scanner
        i_scanner_1 = sc.nextInt(); // scann how many days should be entered
        for(i_loop = 1; i_scanner_1 >= i_loop; i_loop++){
            System.out.println(i_loop + " Abracadabra"); //output
        }
    }
}