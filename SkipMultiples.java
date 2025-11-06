public class SkipMultiples {
    public static void main(String[] args) {
        int num = 20; // you can change this number

        System.out.println("Numbers from 1 to " + num + " (skipping multiples of 4):");

        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0) {
                continue;
            }
        }
    }
}