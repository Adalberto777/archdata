package lesson_1;

import org.jetbrains.annotations.NotNull;

public class FindValue {
    public FindValue( int[] array, int value) {

    }
    public static int findValue(int @NotNull [] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }return -1;
    }
}
