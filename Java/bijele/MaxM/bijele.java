/**
* Program : Quadrant Selection
* Problem ID : Week 1 Problem E
* Description : Select which Quadrant the point is in
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.07s
* Submission ID : 3308272
 */

import java.util.Scanner;

public class bijele {
    public static void main(String[] args) {
        int [][] chess_pieces = { 1, 1, 2, 2, 2, 8};
        int i, i_scanner_1;
        //int one_king = 1, one_queen = 1, two_rooks = 2, two_bishops = 2, two_kights = 2 , eight_pawns = 8, i_scanner;//var initilizations
        Scanner sc = new Scanner(System.in); //initilize scanner
        for(i = 0; i < chess_pieces.length; i++){
            i_scanner_1 = sc.nextInt(); // scann the amount
            chess_pieces[i] = chess_pieces[i] - i_scanner_1;
        }
        for(i = 0; i < chess_pieces.length; i++) System.out.println(chess_pieces[i]);
        sc.close(); //kill scanner object
    }
}