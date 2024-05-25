import java.util.ArrayList;

public class ExerciseTwentyFour {
    private ArrayList<Integer> values;

    public ExerciseTwentyFour() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public ExerciseTwentyFour merge(ExerciseTwentyFour other) {
        ExerciseTwentyFour merged = new ExerciseTwentyFour();
        int i = 0;
        int j = 0;

        while (i < values.size() || j < other.values.size()) {
            if (i < values.size()) {
                merged.add(values.get(i));
                i++;
            }
            if (j < other.values.size()) {
                merged.add(other.values.get(j));
                j++;
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        ExerciseTwentyFour a = new ExerciseTwentyFour();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ExerciseTwentyFour b = new ExerciseTwentyFour();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ExerciseTwentyFour mergedSequence = a.merge(b);
        System.out.println(mergedSequence.toString());
    }
}
