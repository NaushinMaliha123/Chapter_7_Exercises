import java.util.ArrayList;
import java.util.Collections;

public class ExerciseTwentyFive {
    private ArrayList<Integer> values;

    public ExerciseTwentyFive() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public ExerciseTwentyFive mergeSorted(ExerciseTwentyFive other) {
        ExerciseTwentyFive result = new ExerciseTwentyFive();
        int i = 0, j = 0;

        while (i < this.values.size() && j < other.values.size()) {
            if (this.values.get(i) < other.values.get(j)) {
                result.add(this.values.get(i));
                i++;
            } else {
                result.add(other.values.get(j));
                j++;
            }
        }

        while (i < this.values.size()) {
            result.add(this.values.get(i));
            i++;
        }

        while (j < other.values.size()) {
            result.add(other.values.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        ExerciseTwentyFive a = new ExerciseTwentyFive();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ExerciseTwentyFive b = new ExerciseTwentyFive();
        b.add(4);
        b.add(7);
        b.add(9);
        b.add(9);
        b.add(11);

        ExerciseTwentyFive merged = a.mergeSorted(b);
        System.out.println(merged.toString());
    }
}
