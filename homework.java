
public class homework {
    // Question no 1
    // public static void main(String[] args) {
    //     for (int i = 0; i < 50; i++) {
    //         if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) { 
    //             System.out.println(i);
    //         }
    //     }
    // }
   
    // Qno2
    // import java.util.Scanner;
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();

    //     for (int i = 1; i <= num; i++) {
    //         if (i % 4 == 0) {
    //             continue; // skip multiples of 4
    //         }
    //         System.out.println(i);
    //     }
        
    //Qno3
    // public static void main(String [] args ){
    //     for(int i=1;i<=30;i++){
    //         if(i%3==0 && i%5==0){
    //             System.out.println("FIzzBuzz");
    //         }
    //     }else if(i%3==0){
    //         System.out.println("Fizz");
    //     }
    //     else if(i%5==0){
    //         System.out.println("Buzz");
    //     }
    // }

    //Qno4
    // import java.util.Scanner;
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int[] numbers = new int[10];

    //     System.out.println("Enter 10 integers:");
    //     for (int i = 0; i < 10; i++) {
    //         numbers[i] = scanner.nextInt();
    //     }

    //     System.out.println("Even numbers greater than 20:");
    //     for (int i = 0; i < 10; i++) {
    //         if (numbers[i] > 20 && numbers[i] % 2 == 0) {
    //             System.out.println(numbers[i]);
    //         }
    //     }
        
    // }

    //Qno5
    // public static void main(String[] args) {
    //     int sumEven = 0;
    //     int productOdd = 1;

    //     for (int i = 1; i <= 10; i++) {
    //         if (i % 2 == 0) {
    //             sumEven += i;
    //         } else {
    //             productOdd *= i;
    //         }
    //     }

    //     System.out.println("Sum of even numbers: " + sumEven);
    //     System.out.println("Product of odd numbers: " + productOdd);
    // }

    //Qno6
    //  public static void main(String[] args) {
    //     for (int i = 1; i <= 30; i++) {
    //         if (i == 15) {
    //             System.out.println("skip");
    //         } else if (i % 4 == 0) {
    //             System.out.println(i * 2);
    //         } else {
    //             System.out.println(i);
    //         }
    //     }
    //     System.out.println("done");
    // }



//     //Qno7
//     import java.util.Scanner;

//     public static void main(String[] args) {
//          int CORRECT_PIN = 1234;
//         Scanner scanner = new Scanner(System.in);
//         int attempts = 0;

//         while (attempts < 3) {
//             System.out.print("Enter your PIN: ");
//             int enteredPin = scanner.nextInt();

//             if (enteredPin == CORRECT_PIN) {
//                 System.out.println("Access Granted");
//                 return; 
//             } else {
//                 attempts++;
//                 if (attempts < 3) {
//                     System.out.println("Incorrect PIN, try again.");
//                 }
//             }
//         }

//         System.out.println("Account locked.");
        
//     }
// }




        // }    
 
}
