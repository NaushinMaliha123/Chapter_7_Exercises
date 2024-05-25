import java.util.Arrays;

public class ExerciseThirteen {
    private int[] values;

    public ExerciseThirteen(int size) {
        values = new int[size];
    }

    public void set(int i, int n) {
        values[i] = n;
    }

    public int get(int i) {
        return values[i];
    }

    public int size() {
        return values.length;
    }

    public boolean sameValues(ExerciseThirteen other) {
        if (this.size() != other.size()) {
            return false;
        }

        int[] thisSorted = this.getSortedValues();
        int[] otherSorted = other.getSortedValues();

        for (int i = 0; i < this.size(); i++) {
            if (thisSorted[i] != otherSorted[i]) {
                return false;
            }
        }

        return true;
    }

    private int[] getSortedValues() {
        int[] sortedValues = values.clone();
        Arrays.sort(sortedValues);
        return sortedValues;
    }

    public static void main(String[] args) {
        ExerciseThirteen seq1 = new ExerciseThirteen(7);
        ExerciseThirteen seq2 = new ExerciseThirteen(7);

        seq1.set(0, 1);
        seq1.set(1, 4);
        seq1.set(2, 7);
        seq1.set(3, 16);
        seq1.set(4, 9);
        seq1.set(5, 7);
        seq1.set(6, 4);

        seq2.set(0, 11);
        seq2.set(1, 11);
        seq2.set(2, 7);
        seq2.set(3, 9);
        seq2.set(4, 16);
        seq2.set(5, 4);
        seq2.set(6, 1);

        if (seq1.sameValues(seq2)) {
            System.out.println("Sequences have the same values in some order, ignoring duplicates.");
        }
        else {
            System.out.println("Sequences do not have the same values in some order, ignoring duplicates.");
        }
    }
}
