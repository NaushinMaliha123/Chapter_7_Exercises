public class ExercisesSix {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 4, 9, 16, 9, 7, 4, 9, 11};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Array in reverse order: ");

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}