package pong;
import gui.Window;

public class PongSketch {
    
    private static int WIDTH = 800;
    private static  int HEIGHT = 600;


    public static void main(String[] args) {

        Window window = new Window("PongSketch", WIDTH, HEIGHT);
       
        window.setColor(0, 0, 0);
        window.fillRect(30, 200, 15, 100);
        window.fillRect(760, 100, 15, 100);
       window.fillCircle(200, 400, 20);
        window.open();
        window.waitUntilClosed();

        
    }

}
