package ru.geekbrains.lesson1;

public class MainApp {

    public static void main(String[] args) {
        byte a = 10;                // от -128 до 127
        short b = 10000;            // от -32768 до 32767
        int c = 1000000000;         // от -2147483648 до 2147483647
        long d = 1000000000;        // от -9223372036854775808 до 9223372036854775807
        float e = 10.110f;          // 32-битное число с плавающей запятой
        double f = 111.111;         // 64-битное число с плавающей запятой
        char g = 'c';               // Символ
        boolean h = true;           // false, true

        System.out.println(calcOfExep(1,1,1,1));
        System.out.println(range(5,5));
        positiveNegativeMessage(0);
        name("Сергей");
        year(2020); // тут до конца задание не понял 100, 200, 300 - должны быть не високосные, а 1000, 2000 тоже?

    }

    public static float calcOfExep(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    public static boolean range(int a, int b) {

        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    public static void positiveNegativeMessage(int a) {

        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean positiveNegativeBoolean(int a) {

        if (a >= 0) {
            return false;
        }
        return true;
    }

    public static void name(String a) {

        System.out.println("Привет, " + a);
    }

    public static void year(int a) {

        if (a % 4 == 0) {
            System.out.println("Год високосный - " + a);
        }else System.out.println("Год не високосный - " + a);


    }


}
