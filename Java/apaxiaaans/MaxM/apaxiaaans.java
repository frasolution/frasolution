import java.util.Scanner;
import java.lang.StringBuilder;

// do stringbilder re Factor
public class apaxiaaans {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String nameIn = sc.nextLine();
        sc.close();
        StringBuilder converted = new StringBuilder(nameIn);

        int i, counter = 0, insert = 0, comperer = 1, pointer = 0;
        converted.replace(0, 0, Character.toString( nameIn.charAt(pointer)));

        for(i = 0; nameIn.length() > i; i++){
            if(comperer == nameIn.length()) {
                converted.replace(++counter, counter, Character.toString(' ')); //inserts space at end of array
                nameIn = converted.toString(); //convert the stringbuilder to string we use the read in sting
                String[] nameOut = nameIn.split(" "); //split array on space
                System.out.println(nameOut[0]); //output fixed name
                return; //end programm
            }
            if(nameIn.charAt(pointer) == nameIn.charAt(comperer)){
                comperer++; //counts up the the string that needs to be compared
            } else {
                
                converted.replace(++insert, insert, Character.toString( nameIn.charAt(comperer) ) );
                pointer = comperer;
                counter++;
                comperer++;

                /**
                converted.replace(pointer, ++pointer, Character.toString( nameIn.charAt(comperer) ) );
                comperer = pointer; //set the comperer to pointer and add one to it to compare the next char that will be placed afterwards
                counter++; //counts amount of replacements -> therefore needed array length
                 */
            }
        }
    }
}