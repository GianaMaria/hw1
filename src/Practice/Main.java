package Practice;

public class Main {

    public static void main(String[] args) {
        //задание 2
        byte a = 123;
        short b = 4562;
        int c = 147866;
        long d = 785167845L;
        float e = 75.14f;
        double f = 123.45;
        char g = '*';
        boolean h1 = true;
        boolean h2 = false;
        System.out.println("Значение типа byte " + a);
        System.out.println("Значение типа short " + b);
        System.out.println("Значение типа int " + c);
        System.out.println("Значение типа long " + d);
        System.out.println("Значение типа float " + e);
        System.out.println("Значение типа double " + f);
        System.out.println("Значение типа char " + g);
        System.out.println("Значение типа boolean " + h1);
        System.out.println("Значение типа boolean2 " + h2);

        //задание 3
        System.out.println(value(12, 41, 23, 4));

        //задание 4
        System.out.println(sum(4, 12));

        //задание 5
        int v = -1;
        if (plusMinus(v)) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        //задание 6
        System.out.println(val(4));

        //задание 7
        System.out.println(name("Marie"));
    }
    //задание 3

    public static double value(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    //задание 4

    public static boolean sum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }
    }

    //задание 5

    public static boolean plusMinus(int a) {
        return a >= 0;
    }

    //задание 6

    public static boolean val(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //задание 7

    public static String name(String name){
        return "Привет, " + name;
    }
}
