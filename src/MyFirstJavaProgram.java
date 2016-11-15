import java.util.Scanner;

/**
 * @author flo
 * @since 15/11/2016.
 */
public class MyFirstJavaProgram {

    public static void main(String[] args) {
        System.out.println("Username: ");
        String username = readValueFromConsole();
        System.out.println("Welcome " + username + "!!");

        String password = "12345";

        boolean isValid;
        do {
            String userPassword = readValueFromConsole();

            isValid = password.equals(userPassword);
            if(isValid) {
                System.out.println("You have access!");
                System.exit(0);
            } else {
                System.out.println("ACCESS DENIED!");
            }
        } while(!isValid);
        System.out.println("Ai gasit comoara!");
    }
















    private static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }
}
