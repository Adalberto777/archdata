package lesson_1;

import Lesson_4.RedBlackTree;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.*;

public class Main {
    public static void main(String[] args) {
//        int [] array = new  int[]{8, 7, 6, 1, 2, 3, 9, 4, 5};
//
//        for (int i : array) System.out.print(i + " ");
//        System.out.println();

        // пузырьковая сортировка O(n^2)
        // BabbleSort.babbleSort(array);

        // сортировка выбором O(n^2)
        // DirectSort.directSort(array);

        // сортировка вставкой O(n^2)
        // InsertSort.insertSort(array);

        // быстрая сортировка O(n * log(n))
        // QuickSort.quickSort(array, 0, array.length - 1);
        // Сортировка кучей (пирамидальная) O(n * log(n))
        // HeapSort.heapSort(array);

//        Tree<Integer> tree = new Tree<>();
//        tree.add(1);
//        tree.add(2);
//        tree.add(3);
//        tree.add(4);
////        tree.add(5);
////        tree.add(6);
////        tree.add(7);
////        tree.add(8);
////        tree.add(9);
////        tree.add(10);
////        tree.add(11);
//        tree.printTree();

//        for (int i : array) System.out.print(i + " ");
//        System.out.println();

//        поиск номера элемента массива O(n)
//        System.out.println(FindValue.findValue(array,6));
//        бинарный поиск/разделяй и влавствуй (работает с отсортированным массивом) O(log(n))
//        System.out.println(FindValueBinary.findValurBinary(array,9));

        RedBlackTree redBlackTree = new RedBlackTree();
        redBlackTree.add(1);
        redBlackTree.add(2);
        redBlackTree.add(3);
        redBlackTree.add(4);
        redBlackTree.add(5);
        redBlackTree.add(6);
        redBlackTree.add(7);


        redBlackTree.printRedBlackTreeWidth();
        System.out.println();
        redBlackTree.printRedBlackTreeInOrder();


    }
}
