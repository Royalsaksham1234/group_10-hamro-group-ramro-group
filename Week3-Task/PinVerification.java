import java.util.Scanner;

public class PinVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CORRECT_PIN = 1234;
        int attempts = 0; 
        boolean accessGranted = false;

        for (attempts = 1; attempts <= 3; attempts++) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("Access Granted");
                accessGranted = true;
                break; 
            } else {
                System.out.println("Incorrect PIN, try again");
            }
        }

        if (!accessGranted && attempts > 3 - 1) {
            System.out.println("Account locked");
        }

        sc.close();
    }
}
