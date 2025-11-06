public class EvenGreater {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 25, 40, 19, 22, 33, 50, 18, 60}; // 10 numbers

        System.out.println("Even numbers greater than 20:");

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 20) {
                System.out.println(numbers[i]);
            }
        }
    }
}
  

