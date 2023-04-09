package lesson_1;

import org.jetbrains.annotations.NotNull;

public class InsertSort {
    public InsertSort(int[] array) {

    }
    public static void insertSort(int @NotNull [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
}
