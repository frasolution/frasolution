/**
* Program : Nasty Hacks
* Problem ID : Week 2 Problem B
* Description : Nasty Hacks
* Author : Dominik Nowak
* Author : Maximilian Medlin
* Run : 0.09s
* Submission ID : 3358188
 */import java.util.Scanner;

public class NastyHacks{
    public static void main(String[] args){
      Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      
      for(int i = 0; i < n; i++){
        int r = sc.nextInt();
        int e = sc.nextInt();
        int c = sc.nextInt();
        
        int diff = e - c;
        
        if(diff > r) System.out.println("advertise");
        if(diff < r) System.out.println("do not advertise");
        if(diff == r) System.out.println("does not matter");
        
      }
    }
  }