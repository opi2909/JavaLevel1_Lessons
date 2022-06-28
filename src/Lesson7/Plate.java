package Lesson7;

public class Plate {
    public int food;
    public boolean decrieseFood (int appetite) {
        food -= appetite;
        if (food > 0) {
            return true;
        }
        else {
            return false;
        }

    }


    public Plate(int food) {
        this.food = food;
    }
    public void info () {
        if (food > 0) {
            System.out.println("[" + food + "]");
        } else {
            System.out.println("Не достаточно еды");
        }
    }
    public void addFood (int newFood) {
        food += newFood;
    }
}
