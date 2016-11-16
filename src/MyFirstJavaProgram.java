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
        int counter = 0;
        boolean isValid;
        do {
            String userPassword = readValueFromConsole();
            isValid = password.equals(userPassword);
            if (!isValid) {
                counter ++;
                System.out.println("ACCESS DENIED! Attempts " + counter + ".");
            }
        } while(!isValid && counter < 3);
        if(isValid) {
            System.out.println("Access granted! Din " + counter + " incercari!");
        } else {
            if(counter > 3) {
                System.out.println(" Counter exceeded");
            }
        }


    }
















    private static String readValueFromConsole() {
        return new Scanner(System.in).nextLine();
    }
}
