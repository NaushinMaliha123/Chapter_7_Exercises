import java.util.Scanner;
public class ExercisesThree {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        double largest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }

        }

        double smallest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }

        }
    }
}