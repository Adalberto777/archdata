package lesson_1;

import org.jetbrains.annotations.NotNull;

public class QuickSort {
    public QuickSort(int[] array, int startPosition, int endPosition) {

    }
    public static void quickSort(int @NotNull [] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        // точкой пивот выбирается число в середине массива, но может быть любой,
        // например array[startPosition] - начало массива
        int pivot = array[(startPosition + endPosition) / 2];
        do{
            while(array[leftPosition] < pivot){
                leftPosition++;
            }
            while(array[rightPosition] > pivot){
                rightPosition--;
            }
            if (leftPosition <= rightPosition){
                if (leftPosition < rightPosition){
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        }while (leftPosition <= rightPosition);
        if(leftPosition < endPosition){
            quickSort(array, leftPosition, endPosition);
        }
        if(startPosition < rightPosition){
            quickSort(array, startPosition, rightPosition);
        }
    }


}
