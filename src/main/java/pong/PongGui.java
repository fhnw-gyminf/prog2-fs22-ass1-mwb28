package pong;

import gui.Window;

public class PongGui {

   
    


    private static final int WIDTH = 1600;
    private static final int HEIGHT = 1200;

    public static int getWidth() {
        return WIDTH;
    }




    public static int getHeight() {
        return HEIGHT;
    }


    public static void main(String[] args) {
        
        PongGame game = new PongGame(WIDTH, HEIGHT);

        Window window = new Window("Pong", WIDTH, HEIGHT);
        window.open();
        
        // Game loop
        while (window.isOpen()) {
            // Prozessiert Benutzereingaben
            game.handleEvents(window);

            // Prozessiert einen einzelnen Zeitschritt 
            game.step();

            // Zeichnet den Spielzustand
            game.drawGame(window);

            window.refreshAndClear(20);
        }
    }
}
