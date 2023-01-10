import java.util.Arrays;
public class quickSort {

    public static void sort(int[] array, int small, int big) {
        if (small < big) {
            int current = partition(array, small, big);
            sort(array, small, current);
            sort(array, current + 1, big);
        }
    }
    public static int partition(int[] array, int small, int big) {
        int pivot = array[small];
        int i = small;
        int j = big;
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
            }
            if (i < j) {
                array[i] = array[j];
                i++;
            }
            while (i < j && array[i] <= pivot) {
                i++;
            }
            if (i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] array = { 6, 9, 11, 10, 3, 0, 2 };
        sort(array, 0, array.length - 1);
        System.out.println("Sorted array:" + Arrays.toString(array));
    }
}
