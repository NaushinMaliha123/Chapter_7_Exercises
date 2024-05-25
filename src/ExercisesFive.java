public class ExercisesFive {
    public static void main(String[] args) {
        int[] array = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
            else {
                sum = sum - array[i];
            }
        }

        System.out.println("Alternating Sum: " + sum);
    }
}
