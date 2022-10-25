import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner string = new Scanner(System.in);
        System.out.println("Please enter your string");
        String userString = string.nextLine();

        int stringLength = userString.length();
        int lengthDecresing = stringLength;
        String reverceString = "";

        for (int i = 0; i < stringLength; i++){
            char userStringChar = userString.charAt(lengthDecresing-1);
            reverceString += userStringChar;
            lengthDecresing--;
        }
        System.out.println(reverceString);
    }
}