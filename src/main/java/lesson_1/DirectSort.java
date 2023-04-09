package lesson_1;

import org.jetbrains.annotations.NotNull;

public class DirectSort {
    public DirectSort(int[] array) {

    }
    public static void directSort(int @NotNull [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }if (i != minPosition) {
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
    }
}
