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

    
    public int getY() {
        return y;
    }

    
    public int getWidth() {
        return width;
    }

   

    public int getHeight() {
        return height;
    }

   
    public void move (int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public void draw(Window window){

        
        
        //draw north border:
    //   if (getX()==width/2 && getY()==0){window.drawLine(0, 0,width, 0);}
    //     // draw west border
    //   if (getX()== 0 && getY()==height/2){ window.drawLine(0, 0, 0, height);}
    //   // draw east border
    //   if (getX()== width && getY()==height/2){ window.drawLine(width, 0, width, height);}
      
     
    }

    public boolean intersects (GameObject other){
        return x - width/2 < other.x + other.width/2 
            && x + width/2 > other.x - other.width/2
            && y - height/2 < other.y + other.height/2
            && y + height/2 > other.y - other.height/2;
    }
    
}
