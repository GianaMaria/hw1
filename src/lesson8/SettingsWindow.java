package lesson8;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_POS_X = GameWindow.WINDOW_POS_X + 50;
    private static final int WINDOW_POS_Y = GameWindow.WINDOW_POS_Y + 50;
    private static final int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH - 100;
    private static final int WINDOW_HEIGHT = 400;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    static final int MODE_H_VS_A = 0;
    static final int MODE_H_VS_H = 1;


    private GameWindow gameWindow;

    JRadioButton radioButtonHvsAi = new JRadioButton("Человек VS Искуственный Интеллект", true);
    JRadioButton radioButtonHvsH = new JRadioButton("Человек VS Человек");
    ButtonGroup gameMode = new ButtonGroup();

    JSlider sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
    JSlider sliderDotsToWin = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);


    public SettingsWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Setting game");

        setLayout(new GridLayout(8, 1));

        JLabel label = new JLabel(" Выберите режим игры:");
        label.setOpaque(true);
        Color bgColor = new Color(118, 206, 192);
        label.setBackground(bgColor);
        add(label);

        radioButtonHvsAi.setOpaque(true);
        radioButtonHvsAi.setBackground(bgColor);

        radioButtonHvsH.setOpaque(true);
        radioButtonHvsH.setBackground(bgColor);

        add(radioButtonHvsAi);
        add(radioButtonHvsH);
        gameMode.add(radioButtonHvsAi);
        gameMode.add(radioButtonHvsH);

        JLabel label1 = new JLabel(" Выберите размер поля:");
        label1.setOpaque(true);
        label1.setBackground(bgColor);
        add(label1);

        sliderFieldSize.setMajorTickSpacing(1);
        sliderFieldSize.setPaintLabels(true);
        sliderFieldSize.setPaintTicks(true);
        sliderFieldSize.setOpaque(true);
        sliderFieldSize.setBackground(bgColor);

        add(sliderFieldSize);

        JLabel label2 = new JLabel(" Выберите размер победной линии:");
        label2.setOpaque(true);
        label2.setBackground(bgColor);
        add(label2);

        sliderDotsToWin.setMajorTickSpacing(1);
        sliderDotsToWin.setPaintLabels(true);
        sliderDotsToWin.setPaintTicks(true);
        sliderDotsToWin.setOpaque(true);
        sliderDotsToWin.setBackground(bgColor);

        add(sliderDotsToWin);

        sliderFieldSize.addChangeListener(e -> {
            sliderDotsToWin.setMaximum(sliderFieldSize.getValue());
        });

        JButton buttonStartNewGame = new JButton("Начать игру");
        Color rbgColor = new Color(239, 235, 211);
        buttonStartNewGame.setBackground(rbgColor);
        add(buttonStartNewGame);

        buttonStartNewGame.addActionListener(e -> {
            setVisible(false);

            int mode;
            if (radioButtonHvsAi.isSelected()) {
                mode = MODE_H_VS_A;
            } else {
                mode = MODE_H_VS_H;
            }

            int fieldSize = sliderFieldSize.getValue();
            int dotsToWin = sliderDotsToWin.getValue();

            Logic.SIZE = fieldSize;
            Logic.DOTS_TO_WIN = dotsToWin;
            Logic.initMap();
            Logic.gameFinished = false;

            gameWindow.startNewGame(mode, fieldSize, fieldSize, dotsToWin);
        });

        setVisible(false);

    }

}
