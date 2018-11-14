import java.util.Scanner;

public class isithalloween{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] input = sc.nextLine().split(" ");
        
        String month = input[0];
        month = month.toUpperCase();
        int day = Integer.parseInt(input[1]);

        //Condition HELLOWEEN
        if(month.equals("OCT") && day == 31 ){
            System.out.println("yup");
            return;
        }
        
        // CONDITION DEC 25
        if(day == 25 && month.equals("DEC") ){
            System.out.println("yup");
            return;
        }

        // ANY OTHER DAY
        System.out.println("nope");

    }
}
