public class ExerciseTwelve {
    private int[] values;

    public ExerciseTwelve(int size) {
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

    public boolean equals(ExerciseTwelve other) {
        if (this.size() != other.size()) {
            return false;
        }

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) != other.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ExerciseTwelve seq1 = new ExerciseTwelve(3);
        seq1.set(0, 1);
        seq1.set(1, 2);
        seq1.set(2, 3);

        ExerciseTwelve seq2 = new ExerciseTwelve(3);
        seq2.set(0, 1);
        seq2.set(1, 2);
        seq2.set(2, 3);

        System.out.println("Are sequences equal? " + seq1.equals(seq2));
    }
}
