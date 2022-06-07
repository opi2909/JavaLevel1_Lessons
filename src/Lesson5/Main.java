package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employees[] Employees = new Employees[5];
        Employees[0] = new Employees("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "89151111111", 30000, 30);
        Employees[1] = new Employees("Petrov Petr", "Interpreter", "ppetrov@mail.ru", "89152222222", 35000, 35);
        Employees[2] = new Employees("Sidorov Oleg", "Tester", "osidiriv@mail.ru", "89153333333", 35000, 41);
        Employees[3] = new Employees("Vasilyev Vasiliy", "Developer", "vvasilyev@mail.ru", "89154444444", 40000, 42);
        Employees[4] = new Employees("Nikolaev Nokolay", "Cook", "nnikolaev@mail.ru", "89155555555", 50000, 21);

        for (int i = 0; i < 5; i++) {
            Employees[i].infoEm();
        }
        System.out.println("*******************************************************");
        for (int i = 0; i < 5; i++) {
            if (Employees[i].age > 40) {
                Employees[i].infoEm();
            }
        }
    }

}





