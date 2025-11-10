import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0 && num > 20) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
