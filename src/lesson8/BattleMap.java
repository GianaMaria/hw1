package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    private int gameMode;
    private int fieldSizeX;
    private int fieldSizeY;
    private int dotsToWin;

    private int cellHeight;
    private int cellWidth;

    private boolean isInit = false;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        Color bgColor = new Color(24, 188, 172);
        setBackground(bgColor);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (isInit) {
                    mouseReleasedUpdate(e);
                }
            }
        });
    }

    private void mouseReleasedUpdate(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        if (!Logic.gameFinished) {
            Logic.setHumanCoords(cellX, cellY);
        }

        System.out.printf("cellX: %d  cellY: %d \n", cellX, cellY);

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            Color bgColor = new Color(12, 161, 145);
            g.setColor(bgColor);
            ((Graphics2D) g).setStroke(new BasicStroke(4f));//ширина линии
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//сглаживание
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            Color bgColor = new Color(12, 161, 145);
            g.setColor(bgColor);
            ((Graphics2D) g).setStroke(new BasicStroke(4f));
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.drawLine(x, 0, x, panelHeight);
        }


        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i);
                    drawWinLineX(g, j, i);//Красит победный символ
                }
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, j, i);
                    drawWinLineO(g, j, i);//Красит победный символ
                }
            }
        }
    }

    private void drawX(Graphics g, int cellX, int cellY) {
//        g = (Graphics2D)g;
        Color bgColor = new Color(70, 84, 91);
        g.setColor(bgColor);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(cellX * cellWidth, cellY * cellHeight,
                (cellX + 1) * cellWidth, (cellY + 1) * cellHeight);
        g.drawLine(cellX * cellWidth, (cellY + 1) * cellHeight,
                (cellX + 1) * cellWidth, cellY * cellHeight);
    }

    private void drawO(Graphics g, int cellX, int cellY) {
        Color bgColor = new Color(239, 235, 211);
        g.setColor(bgColor);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawOval(cellX * cellWidth + 4, cellY * cellHeight + 4, cellWidth - 7, cellHeight - 6);
    }

    private void drawWinLineX(Graphics g, int cellX, int cellY) {
        if (Logic.checkWinLines(Logic.DOT_X)) {
            Color bgColor = new Color(186, 29, 88);
            g.setColor(bgColor);
            ((Graphics2D) g).setStroke(new BasicStroke(3f));
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.drawLine(cellX * cellWidth, cellY * cellHeight,
                    (cellX + 1) * cellWidth, (cellY + 1) * cellHeight);
            g.drawLine(cellX * cellWidth, (cellY + 1) * cellHeight,
                    (cellX + 1) * cellWidth, cellY * cellHeight);
        }
    }

    private void drawWinLineO(Graphics g, int cellX, int cellY) {

        if (Logic.checkWinLines(Logic.DOT_O)) {
            Color bgColor = new Color(186, 29, 88);
            g.setColor(bgColor);
            ((Graphics2D) g).setStroke(new BasicStroke(3f));
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.drawOval(cellX * cellWidth + 4, cellY * cellHeight + 4, cellWidth - 7, cellHeight - 6);
        }

    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin) {
        this.gameMode = gameMode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.dotsToWin = dotsToWin;

        isInit = true;
        repaint();
    }

}

