package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] persArr = {
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                        "892312312", 30000, 30),
                new Employee("Sokolov Alexsandr", "Engineer", "sokol@list.ru",
                        "89142234965", 30000, 43),
                new Employee("Rimuru Andrew", "Programmer", "rimuru@mail.ru",
                        "89244456025", 60000, 24),
                new Employee("Morozov Vladimir", "accountant", "moroz@mail.ru",
                        "89146992356", 25500, 42),
                new Employee("Ermolova Lyudmila", "Secretary", "ermolova@mail.ru",
                        "89244456023", 20000, 21),

        };

        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].getAge() > 40){
                persArr[i].info();
                System.out.println();
        }

    }


}

}

