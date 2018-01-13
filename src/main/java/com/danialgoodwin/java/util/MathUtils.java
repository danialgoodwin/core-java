/** Helper methods related to math. */
public final class MathUtils {

    /** Suppress default constructor for non-instantiability. */
    private MathUtils() { }

    public static final double sum(Collection<Double> collection) {
        double sum = 0;
        for (Double d : collection) { sum += d; }
        return sum;
    }

    public static final int sum(Collection<Integer> collection) {
        int sum = 0;
        for (Integer i : collection) { sum += i; }
        return sum;
    }

}
