package lesson7.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reader extends JFrame {
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonP,
            buttonM, buttonD, buttonU, buttonR, buttonC; //создание кнопок для видимости в других классах
    JTextField t1; //создание поля
    int P = 0, M = 0, D = 0, U = 0; //счетчик при нажатии кнопки увеличивается на 1, а потом обнуляется.
    String j, h; //при нажатии кнопки, первое число записывается в j, второе в h (стринг).
    int a, b; //для перевода стрингового значения h j в инт.

    eHandler handler = new eHandler();

    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());

        t1 = new JTextField(13); //инициализация поля
        t1.setEditable(false); //не позволяет вписывать значения в поле.
        add(t1);

        button1 = new JButton("1");//здесь и дальше инициализация и добавление кнопок.
        add(button1);

        button2 = new JButton("2");
        add(button2);

        button3 = new JButton("3");
        add(button3);

        button4 = new JButton("4");
        add(button4);

        button5 = new JButton("5");
        add(button5);

        button6 = new JButton("6");
        add(button6);

        button7 = new JButton("7");
        add(button7);

        button8 = new JButton("8");
        add(button8);

        button9 = new JButton("9");
        add(button9);

        button0 = new JButton("0");
        add(button0);

        buttonP = new JButton("+");
        add(buttonP);

        buttonM = new JButton("- ");
        add(buttonM);

        buttonD = new JButton("    /    "); //через менеджер не получалось(
        add(buttonD);                           //пробелы для красоты

        buttonU = new JButton("     *    ");
        add(buttonU);

        buttonR = new JButton("        =       ");
        add(buttonR);

        buttonC = new JButton("       CE     ");
        add(buttonC);

        button0.addActionListener(handler); //добавление в программу
        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button3.addActionListener(handler);
        button4.addActionListener(handler);
        button5.addActionListener(handler);
        button6.addActionListener(handler);
        button7.addActionListener(handler);
        button8.addActionListener(handler);
        button9.addActionListener(handler);
        button0.addActionListener(handler);
        buttonP.addActionListener(handler);
        buttonM.addActionListener(handler);
        buttonD.addActionListener(handler);
        buttonU.addActionListener(handler);
        buttonR.addActionListener(handler);
        buttonC.addActionListener(handler);
    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) { //нажатие кнопки
                t1.setText(t1.getText() + "1");
            }
            if (e.getSource() == button2) {
                t1.setText(t1.getText() + "2");
            }
            if (e.getSource() == button3) {
                t1.setText(t1.getText() + "3");
            }
            if (e.getSource() == button4) {
                t1.setText(t1.getText() + "4");
            }
            if (e.getSource() == button5) {
                t1.setText(t1.getText() + "5");
            }
            if (e.getSource() == button6) {
                t1.setText(t1.getText() + "6");
            }
            if (e.getSource() == button7) {
                t1.setText(t1.getText() + "7");
            }
            if (e.getSource() == button8) {
                t1.setText(t1.getText() + "8");
            }
            if (e.getSource() == button9) {
                t1.setText(t1.getText() + "9");
            }
            if (e.getSource() == button0) {
                t1.setText(t1.getText() + "0");
            }
            if (e.getSource() == buttonP) { //сложение
                j = t1.getText();
                t1.setText(null); //очищение поля
                P++;
            }
            if (e.getSource() == buttonM) {//разность
                j = t1.getText();
                t1.setText(null);
                M++;
            }
            if (e.getSource() == buttonD) {//деление
                j = t1.getText();
                t1.setText(null);
                D++;
            }
            if (e.getSource() == buttonU) {//умножение
                j = t1.getText();
                t1.setText(null);
                U++;

            }
            if (e.getSource() == buttonR) { //результат в калькуляторе
                h = t1.getText();
                b = Integer.parseInt(h); //числа в стринге надо перевести в инт
                a = Integer.parseInt(j);
                if (P == 1) { //счетчик при нажатии кнопки увеличивается на 1, а потом обнуляется
                    t1.setText(a + b + "");
                    P = 0;//обнуление счетчика
                    a = 0; //очищение значений
                    b = 0;
                    h = ""; //переход в пустую строку для дальнейшей
                    j = ""; //работы калькулятора, а не однократно
                }
                if (M == 1) {
                    t1.setText(a - b + "");
                    M = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (D == 1) {
                    t1.setText((double) a / b + "");
                    D = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
                if (U == 1) {
                    t1.setText(a * b + "");
                    U = 0;
                    a = 0;
                    b = 0;
                    h = "";
                    j = "";
                }
            }
            if (e.getSource() == buttonC) {
                t1.setText(null); //очищает текстовое поле
            }
        }
    }
}
