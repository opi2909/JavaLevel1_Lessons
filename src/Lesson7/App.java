package Lesson7;

import Lesson6.Cats;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cat Cat[] = new Cat[2];

        Cat[0] = new Cat("Барсик", 100, false);
        Cat[1] = new Cat("Марс", 51, false);

        Plate plate1 = new Plate(150);

       for (int i = 0; i < Cat.length; i++) {
           if (plate1.food >= Cat[i].appetite) {
               Cat[i].eat(plate1);
           }
           else {
               System.out.println(Cat[i].name + " не будет есть из этой тарелки") ;
           }
       }

        Cat[0].info();
        Cat[1].info();
        plate1.info();


    }
}
