import java.util.Arrays;

public class ExerciseFourteen {
    private int[] values;

    public ExerciseFourteen(int size) {
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
    public boolean isPermutationOf(ExerciseFourteen other) {
        if (this.size() != other.size()) {
            return false;
        }

        int[] thisValues = new int[this.size()];
        int[] otherValues = new int[other.size()];

        for (int i = 0; i < this.size(); i++) {
            thisValues[i] = this.get(i);
            otherValues[i] = other.get(i);
        }

        Arrays.sort(thisValues);
        Arrays.sort(otherValues);

        for (int i = 0; i < this.size(); i++) {
            if (thisValues[i] != otherValues[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ExerciseFourteen seq1 = new ExerciseFourteen(9);
        ExerciseFourteen seq2 = new ExerciseFourteen(9);

        seq1.set(0, 1);
        seq1.set(1, 4);
        seq1.set(2, 9);
        seq1.set(3, 16);
        seq1.set(4, 9);
        seq1.set(5, 7);
        seq1.set(6, 4);
        seq1.set(7, 9);
        seq1.set(8, 11);

        seq2.set(0, 11);
        seq2.set(1, 1);
        seq2.set(2, 4);
        seq2.set(3, 9);
        seq2.set(4, 16);
        seq2.set(5, 9);
        seq2.set(6, 7);
        seq2.set(7, 4);
        seq2.set(8, 9);

        if (seq1.isPermutationOf(seq2)) {
            System.out.println("The sequences are permutations of each other.");
        } else {
            System.out.println("The sequences are not permutations of each other.");
        }
    }
    }

