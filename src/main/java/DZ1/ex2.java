package DZ1;

public class ex2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    // В этом коде можно получить следущее виды исключений:
    // 1. ArrayIndexOutOfBoundsException (Возникнет, если рограмма пытается
    // получить доступ к элементу за пределами границ массива)
    //
    // 2. NullPointerException (Возникнет, если arr равен null,
    // или один из его подмассивов равен null)
    //
    // 3. NumberFormatException (Возникает, если метод Integer.parseInt пытается
    // преобразовать строку в число, но строка не является корректным
    // числовым значением.



}
