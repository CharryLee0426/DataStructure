package Sorting;

public class DirectInsertSort {
    public void directInsertSort(int[] origin) {
        int temp;
        int j;
        int len = origin.length;
        for (int i = 0; i < len; i++) {
            temp = origin[i];
            j = i - 1;
            while (j >= 0 && temp < origin[j]) {
                origin[j + 1] = origin[j];
                j--;
            }
            origin[j + 1] = temp;
        }
    }
}
