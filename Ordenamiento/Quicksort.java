package Ordenamiento;

public class Quicksort {
    public static void quicksort(int[] item, int left, int right) {
        int i, j, temp;
        i = left;
        j = right;
        do {
            while (item[j] > item[i] && j > i) j--;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                i++;
            }
            while (item[i] < item[j] && i < j) i++;
            if (i < j) {
                temp = item[i];
                item[i] = item[j];
                item[j] = temp;
                j--;
            }
        } while (i < j);
        if (left < j) quicksort(item, left, j - 1);
        if (i < right) quicksort(item, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Array antes de ordenar:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quicksort(arr, 0, arr.length - 1);

        System.out.println("\nArray después de ordenar:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}