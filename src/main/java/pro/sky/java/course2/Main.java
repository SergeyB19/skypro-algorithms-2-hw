package pro.sky.java.course2;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{4,5,6,7,9,10,15,21,57,89,56,12,14,15,16,178,45,56,89};
        long start = System.currentTimeMillis();
        sort(ints);
        System.out.println(System.currentTimeMillis() - start);
    }
}