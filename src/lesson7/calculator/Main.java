package lesson7.calculator;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        Reader r = new Reader("Калькулятор");
        r.setBounds(300, 300, 190, 290);
        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
        r.setResizable(false); //не позволяет менять размер
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }
}
