package Lesson3;

public class Main {
    public static void main(String[] args) {
        exercise1 ();
        exercise2 ();
        exercise3 ();
        exercise4 ();
        exercise5 (5, 0);
    }
    public static void exercise1 () {
        int[] nums = {  1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < 9; i++) {
            if (nums[i] == 0) {
                nums [i] = 1;
            }
            else {
                nums [i] = 0;
            }
            System.out.print(nums[i]);
        }
    }
    public static void exercise2 () {
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++) {
            numbers[i] = i;
            System.out.print(numbers[i]);
        }
    }
    public static void exercise3 () {
        int[] numb = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < 11; i++) {
            if (numb[i] < 6) {
                numb[i] = (numb[i]) *= 2;
            }
            System.out.print(numb[i]);
        }
    }
    public static void exercise4 () {
        int counter = 0;
        int[][] field = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    field[i][j] = 1;
                }
                else {
                    field [i][j] = 0;
                }

                System.out.print(field[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static int[] exercise5 (int len, int initialValue) {
        int[] massive = new int[len];
        for (int i = 0; i < len; i++) {
            massive[i] = initialValue;
            System.out.print(massive[i]);
        }
        return massive;
    }


}
