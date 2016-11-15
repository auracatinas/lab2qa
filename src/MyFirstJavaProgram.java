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

        String userPassword = readValueFromConsole();

        if(password.equals(userPassword)) {
            System.out.println("You have access!");
        } else {
            System.out.println("ACCESS DENIED!");
        }
    }
















    private static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }
}
