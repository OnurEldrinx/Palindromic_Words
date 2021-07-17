
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String input;
        char[] inputChars,reverseInputChars;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type a word to check whether it is palindromic or not: ");
        input = keyboard.nextLine();

        input = input.toLowerCase();

        inputChars = input.toCharArray();
        reverseInputChars = new char[inputChars.length];

        for (int i=0;i< inputChars.length;i++){

            reverseInputChars[i] = inputChars[inputChars.length-1-i];

        }

        System.out.println();

        if (Arrays.toString(inputChars).equals(Arrays.toString(reverseInputChars))){

            System.out.println("\""+input + "\" is a palindromic word.");

        }else{

            System.out.println("\""+input + "\" is not a palindromic word.");


        }

        System.out.println();

        System.out.println("Input          : "+Arrays.toString(inputChars));
        System.out.println("Reversed Input : "+Arrays.toString(reverseInputChars));


    }
}
