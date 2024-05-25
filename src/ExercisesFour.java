import java.util.Scanner;
public class ExercisesFour {
    public static int sumWithoutSmallest(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int sum = 0;
        int smallest = values[0];

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }

        return sum - smallest;
    }

    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] values = new int[LENGTH];
        int currentSize = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = (int) in.nextDouble();
            currentSize++;
        }
        System.out.println("Sum without the smallest value: " + sumWithoutSmallest(values));
    }
}
