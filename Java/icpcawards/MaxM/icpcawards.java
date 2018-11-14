import java.util.*;

public class icpcawards{
    public static void main(String args[]) {
    
        HashSet<String> uni = new HashSet<String>(); 
        
        Scanner sc = new Scanner(System.in);

        int imAllreadyTracer = 0, contestents = Integer.parseInt(sc.nextLine());

        String[] unis = new String[contestents];
        String[] teams = new String[contestents];

        for(int i = 0; i < contestents; i++) {
            String[] input = sc.nextLine().split(" ");
            if(!uni.contains(input[0])){
                uni.add(input[0]);
                unis[imAllreadyTracer] = input[0];
                teams[imAllreadyTracer] = input[1];
                imAllreadyTracer++;
            }
        }
        for(int i = 0; i < 12; i++) System.out.println(unis[i] + " " + teams[i]); //output solutions
    }
}
