package lesson_1;

import org.jetbrains.annotations.NotNull;

public class BabbleSort {
    public BabbleSort(int[] array) {

    }

    public static void babbleSort(int @NotNull [] array){
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        }while (!finish);


    }
}
