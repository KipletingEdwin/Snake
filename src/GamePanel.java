import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {
    static  final  int SCREEN_WIDTH = 600;
    static  final  int SCREEN_HEIGHT = 600;
    static  final  int UNIT_SIZE = 25;
    static  final  int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int [GAME_UNITS];
    final int y[] = new int [GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    char direction = 'R';
    boolean running = false;
    Timer timer;


    GamePanel(){

    }

    public  void  startGame(){

    }

    public void  paintComponent(Graphics g){

    }

    public  void draw(Graphics g){

    }

    public void move(){

    }

    public  void  checkApple(){

    }

    public  void  checkCollisions(){

    }

    public  void  gameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public  class MyKeyAdapter extends KeyAdapter {
        @Override

        public  void keyPressed(KeyEvent e){

        }

    }


}
