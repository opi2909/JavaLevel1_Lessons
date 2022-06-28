package Lesson7;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat (Plate plate) {
        plate.decrieseFood(appetite);
        satiety = true;
    }
    public void info () {
        if (satiety = true) {
            System.out.println("[" + name + ", " + appetite + ", " + "]");
            System.out.println(name + " сыт");
        }
        else {
            System.out.println("[" + name + ", " + appetite + ", " + "]");
            System.out.println(name + " все еще голоден");
        }
    }


}
