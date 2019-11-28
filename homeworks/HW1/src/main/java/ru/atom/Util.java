package ru.atom;

/**
 * In this assignment you need to implement the following util methods.
 * Note:
 *  throw new UnsupportedOperationException(); - is just a stub
 */
public class Util {



    /**
     * Returns the greatest of {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the largest of values.
     */
    public static int max(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("values = nul or values.length = 0");
        }
        int result = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > result) {
                result = values[i];
            }
        }
        return result;
    }

    /**
     * Returns the sum of all {@code int} values.
     *
     * @param values an argument. Assume values.length > 0.
     * @return the sum of all values.
     */
    public static long sum(int[] values) {
        long result = 0;
        for (int value: values) {
            result += value;
        }
        return result;
    }


}