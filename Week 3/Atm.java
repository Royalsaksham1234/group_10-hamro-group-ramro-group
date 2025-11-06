import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("Access Granted");
                break;
            } else {
                attempts++;
                if (attempts == 3) {
                    System.out.println("Account locked");
                } else {
                    System.out.println("Incorrect PIN, try again");
                }
            }
        }

        sc.close();
    }
}
