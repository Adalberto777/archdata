package lesson_1;

import org.jetbrains.annotations.NotNull;

public class FindValurBinary {
    public FindValurBinary(int[] array, int value) {

    }
    public static int findValurBinary(int @NotNull [] array, int value, int min, int max) {
        int midpoint;
        if (max < min){
            return -1;
        }else{
            midpoint = (max - min)/2 + min;
        }

        if (array[midpoint] < value){
            return findValurBinary(array, value, midpoint + 1, max);
        }else {
            if (array[midpoint] > value){
                return findValurBinary(array, value, min, midpoint - 1);
            }else {
                return midpoint;
            }
        }

    }

    // перегрузка метода findValurBinary (min и max задаются сразу по умолчанию как начало и конец массива)
    public static int findValurBinary(int @NotNull [] array, int value){
        return  findValurBinary(array, value, 0, array.length -1);
    }
}
