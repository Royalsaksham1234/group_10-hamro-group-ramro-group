import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "Password"; 
        int attempt= 0;
   

        while (attempt < 5) {
            System.out.print("Enter your password: ");
            String input = scanner.nextLine();
            attempt++;

            if (input.equals(correctPassword)) {
                System.out.println("Access granted!");
             
                break; 
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }

       
        scanner.close();
    }
}