import java.util.ArrayList;

public class ExerciseTwentyThree{
    private ArrayList<Integer> values;

    public  ExerciseTwentyThree() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public ExerciseTwentyThree append(ExerciseTwentyThree other) {
        ExerciseTwentyThree result = new ExerciseTwentyThree();
        for (Integer val : this.values) {
            result.add(val);
        }
        for (Integer val : other.values) {
            result.add(val);
        }
        return result;
    }

    public static void main(String[] args) {
        ExerciseTwentyThree a = new ExerciseTwentyThree();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ExerciseTwentyThree b = new ExerciseTwentyThree();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ExerciseTwentyThree appendedSequence = a.append(b);
        System.out.println(appendedSequence.toString());
    }
}
