package pong;

import gui.Window;

public class Ball extends GameObject {
    private int vy;
    private int vx;
     


    public Ball (int x, int y){
        super(x, y,0 , 0);
        int signX = Math.random() > 0.5 ? 1 : -1;
        int signY = Math.random() > 0.5 ? 1 : -1;
        this.vx = (int) (signX * (2 + (Math.random() * 4)));
        this.vy = (int) (signY * (2 + (Math.random() * 4)));   
    }

    @Override
    public void draw(Window window) {
        window.fillCircle(getX(), getY(), 20 );
        
    }

    
}
