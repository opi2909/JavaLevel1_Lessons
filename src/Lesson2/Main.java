package Lesson2;

public class Main {
    public static void main(String[] args) {
        summ (1,10);
        positiveNumber (-11);
        negativeNumber(11);
        stringAndNumber("*",10);
        LeapYear(2020);
    }
    public static boolean summ (int a, int b) {
        boolean result;
        if (a+b <=10 && a+b >=20) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
        return result;
    }

    public static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }

    }
    public static boolean negativeNumber(int a) {
        boolean result;
        if (a<0) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
    public static void stringAndNumber (String a, int b) {
        for (int j = 0; j < b; j++) {
            System.out.print(a);
        }
    }
    public static boolean LeapYear(int a) {
        boolean result;
        if (a % 100 != 0 && a % 4 == 0) {
            result = true;
        }
        else if (a % 400 == 0) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
        return result;
    }
}