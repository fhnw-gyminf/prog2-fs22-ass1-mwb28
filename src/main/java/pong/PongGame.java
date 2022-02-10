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
        this.playerLeft = new Player(30, 200);
        this.playerRight = new Player(760, 100);
        this.east= new GameObject(width, 0, 0,0);
        this.north= new GameObject(0,0, 0,0);
        this.south= new GameObject(width, height, 0,0);
        this.west= new GameObject(0, height, 0,0);


    }

    public void handleEvents(Window window) {
        if (window.isKeyPressed("up")) {playerRight.moveUp();}
        if (window.isKeyPressed("down")) {playerRight.moveDown();}
        if (window.isKeyPressed("w")) {playerLeft.moveUp();}
        if (window.isKeyPressed("s")) {playerLeft.moveDown();}
    }

    public void step() {
        // TODO Einen Zeitschritt prozessieren, also den Ball bewegen und Kollisionen behandeln.
    }

	public void drawGame(Window window) {

        ball.draw(window);
        playerLeft.draw(window);
        playerRight.draw(window);
        //east.draw(window);
        north.draw(window);
        // south.draw(window);
        // west.draw(window);


        // TODO Zeichnet die drei Game Objekte.
        // TODO Zeichnet den Punktestand.
	}
}
