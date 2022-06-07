package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a = 20;
        int b = 15;
        if (a + b >= 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }
    }
    public static void printColor () {
            int value = 40;
            value = 101;
            if (value <= 0) {
                System.out.print("Красный");
            } else if (value > 100 ) {
                System.out.print ("Зеленый");
            }
            else {
                System.out.print("Желтый");
            }
    }
    public static void compareNumbers () {
        int a = 10;
        int b = 5;
        if (a >= b) {
            System.out.print("a>=b");
        }
        else {
            System.out.print("a<b");
        }
    }
}
