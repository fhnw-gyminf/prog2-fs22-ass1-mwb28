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
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void move (int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public void draw(Window window){
     
      if (getX()==0 && getY()==0){
        window.setColor(255, 0, 0);
          window.drawLine(0, 0,800, 0);
      }
      
     
    }

    public boolean intersects (GameObject other){
        return x - width/2 < other.x + other.width/2 
            && x + width/2 > other.x - other.width/2
            && y - height/2 < other.y + other.height/2
            && y + height/2 > other.y - other.height/2;
    }
    
}
