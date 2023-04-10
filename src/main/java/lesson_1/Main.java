package lesson_1;

public class Main {
    public static void main(String[] args) {
        int [] array = new  int[]{8, 7, 6, 1, 2, 3, 9, 4, 5};

        for (int i : array) System.out.print(i + " ");
        System.out.println();

        // пузырьковая сортировка O(n^2)
        // BabbleSort.babbleSort(array);

        // сортировка выбором O(n^2)
        // DirectSort.directSort(array);

        // сортировка вставкой O(n^2)
        // InsertSort.insertSort(array);

        // быстрая сортировка O(n * log(n))
        QuickSort.quickSort(array, 0, array.length - 1);
        // Сортировка кучей (пирамидальная) O(n * log(n))
        //HeapSort.heapSort(array);

        for (int i : array) System.out.print(i + " ");
        System.out.println();

        // поиск номера элемента массива O(n)
        //System.out.println(FindValue.findValue(array,6));
        // бинарный поиск/разделяй и влавствуй (работает с отсортированным массивом) O(log(n))
        System.out.println(FindValueBinary.findValurBinary(array,9));
    }
}
