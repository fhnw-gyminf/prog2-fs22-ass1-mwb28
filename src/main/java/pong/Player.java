package pong;
import gui.Window;

public class Player extends GameObject {

    private int score;
    private static int barwidth = 15;
    private static  int barheight =100;

    public Player(int x, int y){
        super(x, y, barwidth, barheight);
                  
    }

    @Override public void draw(Window window){
        window.fillRect(super.getX()-barwidth/2, super.getY()-barheight/2, barwidth, barheight);

        
    }

    }
    

