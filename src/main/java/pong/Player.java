package pong;
import gui.Window;

public class Player extends GameObject {

    private int score;
    private static int barwidth = 15;
    private static  int barheight =100;
    // private static int speedpanels= 3;

    public Player(int x, int y){
        super(x, y, barwidth, barheight);
                  
    }
    

    public int getScore() {
        return score;
    }


    @Override public void draw(Window window){
        window.setColor(0, 0, 0);
        window.fillRect(super.getX()-barwidth/2, super.getY()-barheight/2, barwidth, barheight);

        
    }
    public void incscore(){
        score = score + 10;

        }
    
    public void moveUp() {
        move(0, -5);

    }
    public void moveDown(){
        move(0, 5);
    }

    }
    

