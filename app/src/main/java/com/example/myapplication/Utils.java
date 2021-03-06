package com.example.myapplication;

public class Utils {
    public static int max(int ... values) {
        int max = values[0];
        for (int i: values) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    /**
     * Находит минимальное значение среди переданных
     * @param values целочисленные значения, среди которых ищется минимальное
     * @return найденное минимальное значение
     */
    public static int min(int ... values) {
        int min = values[0];
        for (int i: values) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
