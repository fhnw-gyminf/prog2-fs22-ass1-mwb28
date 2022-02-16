package pong;
import gui.Window;

public class Player extends GameObject {

    private int score;
    private static final int BARWIDTH = PongGui.getWidth()/53 ;
    private static final int BARHEIGHT =PongGui.getHeight()/5;
    // private static int speedpanels= 3;

    public Player(int x, int y){
        super(x, y, BARWIDTH, BARHEIGHT);
                  
    }
    

    public int getScore() {
        return score;
    }


    @Override public void draw(Window window){
        window.setColor(0, 0, 0);
        window.fillRect(super.getX()-BARWIDTH/2, super.getY()-BARHEIGHT/2, BARWIDTH, BARHEIGHT);

        
    }
    public void incscore(){
        score = score + 1;

        }
    
    public void moveUp() {
        move(0, -5);

    }
    public void moveDown(){
        move(0, 5);
    }

    }
    

