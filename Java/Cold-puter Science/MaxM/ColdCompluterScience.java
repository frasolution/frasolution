/**
* Program : Cold Computer Science
* Problem ID : Week 1 Problem B
* Description : Check for how many Days (Values) are sub zero
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.08s
* Submission ID : 3300762
 */
import java.util.Scanner; //required import to run scanner

public class ColdCompluterScience {
    public static void main(String[] args) {
        int i_scanner_1, i_scanner_2 , i_for_counter, i_day_counter = 0; //var initilizations
        Scanner sc = new Scanner(System.in); //initilize scanner
        i_scanner_1 = sc.nextInt(); // scann how many days should be entered
        for(i_for_counter = 0; i_for_counter < i_scanner_1 ; i_for_counter++){
            i_scanner_2 = sc.nextInt(); //scann next day in line
            if(i_scanner_2 < 0) i_day_counter++; // day sub zero counter
        }
        System.out.println(i_day_counter); //output
        sc.close(); //kill scanner object
        return;
    }
}