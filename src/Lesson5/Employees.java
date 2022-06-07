package Lesson5;

public class Employees {
    String name;
    String jobTitle;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employees(String nameForEm, String jobTitleForEmp, String emailForEm, String phoneNumberForEm, int salaryForEm, int ageForEm) {
        name = nameForEm;
        jobTitle = jobTitleForEmp;
        email = emailForEm;
        phoneNumber = phoneNumberForEm;
        salary = salaryForEm;
        age = ageForEm;
    }
    public void infoEm () {
        System.out.println(name + " " + jobTitle + " " + email + " " + phoneNumber + " " + salary + " " + age);
    }
}
