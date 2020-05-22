package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();

        System.out.println("Это игра угадайка. Вам необходимо угадать число от 0 до 9.");
        System.out.println("У вас есть 3 попытки");

        do {
            int number = random.nextInt(10);
            int userNumber;
            System.out.println("Введите число");
            for (int i = 3; i > 0; i--) {
                userNumber = sc.nextInt();
                if (userNumber == number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (userNumber > number) {
                    System.out.println("Ваше число больше загаданного");
                    System.out.println("У вас осталось " + (i - 1) + " попытки");
                } else {
                    System.out.println("Ваше число меньше загаднного");
                    System.out.println("У вас осталось " + (i - 1) + " попытки");
                }
            }
            System.out.println("Загаданное число " + number);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
        } while (sc.nextInt() == 1);
    }
}
