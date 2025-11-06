public class PasswordCheck {
    public static void main(String[] args) {
        String correctPassword = "password123";
        int attempts = 0;
        
        while (attempts < 5) {
            System.out.print("Enter password: ");
            attempts++;
            
            String input = System.console().readLine();
            
            if (input.equals(correctPassword)) {
                System.out.println("Correct! Access granted.");
                break;
            } else {
                System.out.println("Wrong password. Try again.");
            }
        }
        
        if (attempts >= 5) {
            System.out.println("Too many attempts. Access denied.");
        }
    }
}