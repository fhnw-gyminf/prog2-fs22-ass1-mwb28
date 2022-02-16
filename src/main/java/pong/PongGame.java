package pong;

import gui.Window;

public class PongGame {

    private GameObject north;
    private GameObject east;
    private GameObject south;
    private GameObject west;
    private Ball ball;
    private Player playerLeft;
    private Player playerRight;

    private int width;
    private int height;

    public PongGame(int width, int height) {
        this.width = width;
        this.height = height;
        this.ball = new Ball(width/2, height/2);
        this.playerLeft = new Player((int)width/25, (int)height/2);
        this.playerRight = new Player((int)(width/1.05),(int)(height/2));
        this.east= new GameObject(width, height/2, 0,height);
        this.north= new GameObject(width/2,0, width,0);
        this.south= new GameObject(width/2, height, width,0);
        this.west= new GameObject(0, height/2, 0,height);
        


    }

    public void handleEvents(Window window) {
        // controlling PlayerRight:
        if (window.isKeyPressed("up"))
            if (!playerRight.intersects(north)){playerRight.moveUp();}
        if (window.isKeyPressed("down"))
            if(!playerRight.intersects(south)){playerRight.moveDown();}

        // controlling PlayerLeft:
        if (window.isKeyPressed("w"))
            if(!playerLeft.intersects(north)){playerLeft.moveUp();}
        if (window.isKeyPressed("s"))
            if (!playerLeft.intersects(south)){playerLeft.moveDown();}
    }

    public void step() {
        ball.step();
        if (ball.intersects(north) || ball.intersects(south)){ball.bounceOfVertical();}
        if (ball.intersects(playerLeft)){ ball.bounceOfHorizontal();} 
        if (ball.intersects(playerRight)){ ball.bounceOfHorizontal(); }
        if (ball.intersects(west)){
            playerRight.incscore();
            this.ball = new Ball(width/2, height/2);
        
        }
        
        if (ball.intersects(east)){
           
            this.ball = new Ball(width/2, height/2);
            playerLeft.incscore();}
    

        // TODO Einen Zeitschritt prozessieren, also den Ball bewegen und Kollisionen behandeln.
    }

	public void drawGame(Window window) {

        ball.draw(window);
        playerLeft.draw(window);
        playerRight.draw(window);
        east.draw(window);
        north.draw(window);
         south.draw(window);
        west.draw(window);
        String getPointsleft= Integer.toString(playerLeft.getScore());
        String getPointsright = Integer.toString(playerRight.getScore());
        window.setFontSize(25);
        window.drawString(getPointsleft + ":"+ getPointsright, width/2, height/40);


        // TODO Zeichnet die drei Game Objekte.
        // TODO Zeichnet den Punktestand.
	}
}
