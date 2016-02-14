import java.util.Scanner;

/**
 * Created by PiratePowWow on 2/13/16.
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("FYK EY R QYIX HFXX? QXH GX MYVBH HFX ESLU...");
        System.out.print("Enter your response:");


        boolean loggedin = false;

        while (!loggedin) {
            String answer = validAnswer();

            if (answer.equalsIgnoreCase("1036")) {
            loggedin = true;
            } else if ((Integer.valueOf(answer)) > 1031 && (Integer.valueOf(answer) < 1041)) {
                System.out.println("Very close! Is your memory off or is Google? Try again.");

            } else if ((Integer.valueOf(answer) > 708) && (Integer.valueOf(answer) < 714)) {
                System.out.println("Yes, that was the day we told each other 'I love you!', but it's not what I'm looking for here. Try again.");

            } else {
                System.out.println("Not even close. Try again.");

            }
         }
        asciiPorn();
        System.out.println("You did it! Go see Jathan and tell him the passcode: PUDDIN");
    }
    static String validAnswer() {
        boolean isValid = false;
        String response = "";
        while (!isValid) {

            response = scanner.nextLine();
            try {
                if (Integer.valueOf(response) > 0) {
                    isValid = true;

                } else {
                    System.out.println("Going to need a more POSITIVE response than that! Try again.");

                }
            } catch (Exception e){
                System.out.println("Not the right type of response I was looking for. Try again");
            }
        }
        return response;
    }

    static void asciiPorn(){
        System.out.println();

    }
}

