import java.util.Scanner;

public class EvenGreaterThan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter 10 integers:");
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
            
           
            if (num % 2 == 0 && num > 20) {
                System.out.println(num + " is even and greater than 20");
            }
        }
        
        sc.close(); 
    }
}
