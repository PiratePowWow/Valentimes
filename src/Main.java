import java.util.Scanner;

/**
 * Created by PiratePowWow on 2/13/16.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome");


        boolean loggedin = false;

        while (!loggedin) {
            String answer = validAnswer();

            if (answer.equalsIgnoreCase("string")) {
            loggedin = true;
            } else if () {

            } else if () {

            } else if () {

            } else {

            }
         }
    }
    static String validAnswer() {
        boolean isValid = false;

        while (!isValid) {

            String response = scanner.nextLine();
            if () {
                isValid = true;
                return response;

            } else {

            }
        }
    }
}
