package lesson5;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary; //зарплата
    int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(fullName + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age + " ");
    }

    public int getAge() {
        return age;
    }

}

