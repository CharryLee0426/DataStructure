package Sorting;

public class QuickSort {
    public void quickSort(int[] origin, int low, int high) {
        int temp;
        int ptr;
        int i = low, j = high;
        if (low >= high) {
            return;
        }
        ptr = origin[low];
        while (i < j) {
            while (origin[j] >= ptr && i < j) {
                j--;
            }
            while (origin[i] <= ptr && i < j) {
                i++;
            }
            temp = origin[i];
            origin[i] = origin[j];
            origin[j] = temp;
        }
        // 此时的 origin[i] 一定会小于 ptr
        origin[low] = origin[i];
        origin[i] = ptr;

        quickSort(origin, low, j-1);
        quickSort(origin, j+1, high);
    }
}