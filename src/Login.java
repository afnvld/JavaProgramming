
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("You have pressed the login button: ");
        System.out.println("Please enter username: ");
        String givenId = input.nextLine();
        System.out.println("Please enter password: ");
        String givenPass = input.nextLine();
        login(givenId, givenPass);
    }

        public static void login (String givenId, String givenPass){
           String expectedId = "johnJava";
           String expectedPass = "123456";
            if (expectedId.equals(givenId) && expectedPass.equals(givenPass)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Either password or loginId is incorrect.");
            }
        }

    }

