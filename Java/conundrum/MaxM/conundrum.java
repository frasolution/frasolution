import java.util.Scanner;
import java.lang.StringBuilder;

public class conundrum{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine().toUpperCase();
        int i, c = input.length();

        sc.close();
        StringBuilder creator = new StringBuilder();

        for(i = 0; input.length()/3 > i ; i++ ) {
            creator.append("PER");
        }

        String cmp = creator.toString();

        for(i = 0; input.length() > i ; i++ ) {
            if(input.charAt(i) == cmp.charAt(i)) c--;
        }

        System.out.println(c);
    }
}
