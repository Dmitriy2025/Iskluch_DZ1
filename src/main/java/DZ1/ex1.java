package DZ1;

public class ex1 {
    public static void main(String[] args) {

        try {
            firstMethod();
        } catch (NullPointerException e) {
            System.out.println("Обработка исключения 1.\nОшибка вызова элемента равного null:\n" + e.getMessage() + "\n");
        }

        try {
            secondMethod();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка исключения 2.\nОшибка вызова индекса массива, превышающего диапазон:\n" + e.getMessage() + "\n");
        }

        try {
            thirdMethod();
        } catch (ArithmeticException e) {
            System.out.println("Обработка исключения 3.\nОшибка деления на 0:\n" + e.getMessage() + "\n");
        }



    }

    public static void firstMethod() {
        String str = null;
        System.out.println(str.length());
    }

    public static void secondMethod() {
        int[] arr = new int [5];
        System.out.println(arr[6]);
    }

    public static void thirdMethod() {
        int a = 10;
        int b = 0;
        int divide = a / b;
    }
}
