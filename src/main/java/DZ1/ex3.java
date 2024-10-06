package DZ1;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 8, 9};
        int[] arr2 = {2, 2, 7, 3, 6};


        System.out.println("Данная программа считает разность элементов первого и второго массива.\nИсходные массивы: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Результирующий массив: ");

        try {
            System.out.println(Arrays.toString(subtractArray(arr1, arr2)));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }


    }

    public static int[] subtractArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длина массивов не равна.");
        }
        int[] resArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resArr[i] = arr1[i] - arr2[i];
        }
        return resArr;
    }
}
