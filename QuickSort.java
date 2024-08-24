/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;
 import java.util.Arrays;
 public class QuickSort {
    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    private void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        var boundary = partition(array, start, end);
        quickSort(array, start, boundary - 1);
        quickSort(array, boundary + 1, end);
    }
    private int partition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundary = start - 1;
        for (var i = start; i <= end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, ++boundary);
            }
        }
        return boundary;
    }
    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int array[] = {15,6,3,1,22,10,13};
        System.out.println(Arrays.toString(array));
        qs.quickSort(array);
        System.out.println(Arrays.toString(array));
    }
 }