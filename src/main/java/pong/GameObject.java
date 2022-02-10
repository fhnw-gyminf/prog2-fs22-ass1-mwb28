package pong;
import gui.Window;

public class GameObject {
    private int x;
    private int y;
    private int width;
    private int height;


    public GameObject(int x, int y, int width, int height){
        this.x =x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void move (int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public void draw(Window window){

    }

    public boolean intersects (GameObject other){
        return x - width/2 < other.x + other.width/2
            && x + width/2 > other.x - other.width/2
            && y - height/2 < other.y + other.height/2
            && y + height/2 > other.y - other.height/2;
    }
    
}
