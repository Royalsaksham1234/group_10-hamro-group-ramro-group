
   public class SumAndProduct {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;       // add even numbers
            } else {
                product = product * i; // multiply odd numbers
            }
        }

        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Product of odd numbers: " + product);
    }
}
 

