package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Баксик", 14, "black");
        Cats cat2 = new Cats("Бегемот", 6, "orange");
        Cats cat3 = new Cats("Ора", 8, "white");
        Dogs dog1 = new Dogs("Рекс", 11, "black");
        Dogs dog2 = new Dogs("Честер", 3, "white");


        System.out.println(Cats.count + " кота");
        System.out.println(Dogs.count + " собаки");
        System.out.println(Cats.count + Dogs.count + " животных");

        cat1.run(201);
        dog2.run(502);
        cat2.swim(12);
        dog1.swim(10);
    }
}
