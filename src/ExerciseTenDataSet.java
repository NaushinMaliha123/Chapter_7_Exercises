public class ExerciseTenDataSet {
    private double[] values;
    private int count;

    public ExerciseTenDataSet(int maximumNumberOfValues) {
        values = new double[maximumNumberOfValues];
        count = 0;
    }

    public void add(double value) {
        if (count < values.length) {
            values[count] = value;
            count++;
        }
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return getSum() / count;
    }

    public double getMaximum() {
        if (count == 0) {
            return 0;
        }
        double max = values[0];
        for (int i = 1; i < count; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public double getMinimum() {
        if (count == 0) {
            return 0;
        }
        double min = values[0];
        for (int i = 1; i < count; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ExerciseTenDataSet dataSet = new ExerciseTenDataSet(5);
        dataSet.add(10.5);
        dataSet.add(20.3);
        dataSet.add(15.7);
        dataSet.add(8.2);
        dataSet.add(12.9);

        System.out.println("Sum: " + dataSet.getSum());
        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Maximum: " + dataSet.getMaximum());
        System.out.println("Minimum: " + dataSet.getMinimum());
    }
}
