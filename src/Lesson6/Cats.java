package Lesson6;
public class Cats extends Animals {
    static int count;
        public Cats (String name, int age, String color) {
            super(name, age, color);
            count++;

        }
        public void run (int distance) {
            if (distance <= 200) {
                System.out.println(name + " бежит " + distance + " метров");
            }
            else {
                System.out.println(name + " не может пробежать столько");
            }
    }
    public void swim (int distance) {
        System.out.println(name + " не умеет плавать");
    }
}