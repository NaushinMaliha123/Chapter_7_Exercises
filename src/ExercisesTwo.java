import java.util.Random;

public class ExercisesTwo {

    public static void main(String[] args) {
        int[] numbers ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();

        System.out.println("Elements at even indices:");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Print even elements
        System.out.println("Even elements:");
        for (int i = 0;i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Elements in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        System.out.println("First and Last element:");
        System.out.println(numbers[0] + " " + numbers[9]);
    }
}
