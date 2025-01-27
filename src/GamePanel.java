import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

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
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;


    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }

    public  void  startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void  paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public  void draw(Graphics g){

        for (int i = 0; i< SCREEN_HEIGHT/UNIT_SIZE;i++){
            g.drawLine(i*UNIT_SIZE,0,i*UNIT_SIZE,SCREEN_HEIGHT);
            g.drawLine(0,i*UNIT_SIZE,SCREEN_WIDTH,i*UNIT_SIZE);
        }
        g.setColor(Color.red);
        g.fillOval(appleX,appleY,UNIT_SIZE,UNIT_SIZE);

        for(int i = 0;i< bodyParts;i++){
            if(i ==0){
                g.setColor(Color.green);
                g.fillRect(x[i],y[i],UNIT_SIZE,UNIT_SIZE);

            }
        }
    }

    public void  newApple(){
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;


    }

    public void move(){
        for(int i = bodyParts;i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch (direction){
            case  'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case  'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case  'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case  'R':
                x[0] = x[0] + UNIT_SIZE;
                break;



        }
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
