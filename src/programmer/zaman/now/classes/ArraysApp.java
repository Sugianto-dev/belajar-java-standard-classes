package programmer.zaman.now.classes;

import java.util.Arrays;

// MATERI ARRAYS CLASS
public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
                1, 4, 234, 5, 6, 19, 5, 67, 4, 5, 67, 4, 6, 7
        };

        // sort()
        Arrays.sort(numbers); // untuk mengurutkan array numbers

        // toString()
        System.out.println(Arrays.toString(numbers)); // Melihat hasil sort

        // binarySearch()
        System.out.println(Arrays.binarySearch(numbers, 7)); // mencari index dari value array 7
        System.out.println(Arrays.binarySearch(numbers, 234)); // mencari index dari value array 234
        System.out.println(Arrays.binarySearch(numbers, 100)); // jika value tidak ada dalam array maka hasilnya negatif

        // copyOf()
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        // copyOfRange()
        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));

        // ...Dan masih banyak method lainnya

    }
}
