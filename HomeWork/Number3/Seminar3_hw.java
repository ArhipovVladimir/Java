Задание 1. Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 5, 1, 6, 2, 3, 4 };
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a,
            int[] l,
            int[] r,
            int left,
            int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }}

Задание 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

    ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));for(
    int i = 0;i<ints.size();i++)
    {
        if (ints.get(i) % 2 == 0) {
            ints.remove(i);
        }
    }System.out.println(ints);

Задание 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

Arrays.sort(new ArrayList[]{ints});
System.out.println(ints);
System.out.println("Minimum is "+ints.get(0));
System.out.println("Maximum is "+ints.get(ints.size()-1));
    int sum = 0;
    for(int i:ints)
    {
        sum += i;
    }
System.out.println("Average is = "+sum/ints.size());
