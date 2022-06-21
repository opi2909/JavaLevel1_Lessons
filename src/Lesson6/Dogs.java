package Lesson6;

public class Dogs extends Animals {
    static int count;
    public Dogs (String name, int age, String color) {
        super(name, age, color);
        count++;
    }
    public void run (int distance) {
        if (distance <= 500) {
            System.out.println(name + " бежит " + distance + " метров");
        } else {
            System.out.println(name + " не может пробежать столько");
        }
    }
    public void swim (int distance) {
        if (distance <= 10) {
            System.out.println(name + " плывет " + distance + " метров");
        }
        else {
            System.out.println(name + " не может столько проплыть");
        }

    }
}
