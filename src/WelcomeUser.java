import java.util.Scanner;

/**
 * @author flo
 * @since 22/11/2016.
 */
public class WelcomeUser {

    public static void loginUser() {
        System.out.println("Username: ");
        String username = readValueFromConsole();
        System.out.println("Welcome " + username + "!!");

        String password = "12345";
        int counter = 0;
        boolean isValid;
        do {
            String userPassword = readValueFromConsole();
            counter++;
            isValid = password.equals(userPassword);
            if(isValid) {
                System.out.println("You have access!");
                System.out.println("Ai gasit comoara! Din " + counter + " incercari!");
            } else {
                System.out.println("ACCESS DENIED! Attempts " + counter + ".");
            }
        } while(!isValid && counter < 4);
    }


    private static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }
}
