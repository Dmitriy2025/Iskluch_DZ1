package DZ1;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[] arr1 = {8, 16, 24, 32, 40};
        int[] arr2 = {2, 4, 0, 8, 5};


        System.out.println("Данная программа считает частное элементов первого и второго массива.\nИсходные массивы: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Результирующий массив: ");

        try {
            System.out.println(Arrays.toString(divideArray(arr1, arr2)));
        }
        catch (RuntimeException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }


    }

    public static int[] divideArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длина массивов не равна.");
        }
        int[] resArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль в ячейке " + (i + 1));
            }

            resArr[i] = arr1[i] / arr2[i];
        }
        return resArr;
    }
}
