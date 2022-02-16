package pong;

import gui.Window;

public class Ball extends GameObject {
    private int vy;
    private int vx;
    private static int bounceCounter;
    private static boolean noIntersect= true;
    private final static int DIAMETER = PongGui.getWidth()/20;
    
     


    public Ball (int x, int y){
        super(x, y,DIAMETER, DIAMETER);
        int signX = Math.random() > 0.5 ? 1 : -1;
        int signY = Math.random() > 0.5 ? 1 : -1;
        this.vx = (int) (signX * (2 + (Math.random() * 4)));
        this.vy = (int) (signY * (2 + (Math.random() * 4)));   
    }

   
    @Override
    public void draw(Window window) {
        window.setColor(0, 255 , 0);
        window.fillCircle(getX(), getY(),DIAMETER/2 );
        
    }
    public void step(){
        move(vx, vy);
        if(getX()>=PongGui.getWidth()*0.3 && getX()<=PongGui.getWidth()*0.6){
            noIntersect=true;
        }

    }
    public void bounceOfVertical(){
      

        vy*=-1;
       
         
        
    }
    public void bounceOfHorizontal(){
        if (noIntersect){
            vx*=-1;
            noIntersect = false;
        }
        
        // if(vx > 0){vx= - Math.abs(vx);
        //     move(vx, vy);
        // }
        // else {vx= Math.abs(vx);
        //     move(vx, vy);
        // }
        //vx*=-1;
    
        bounceCounter++;
       encreaseVelocity();

       
       
    }

    public void reset(){
        super.setX(PongGui.getWidth()/2);
        super.setY(PongGui.getHeight()/2);


    }
    private  void encreaseVelocity(){
        int randomChange = Math.random() > 0.5 ? 2 :3;
        if (bounceCounter%randomChange==0){
           
            vx+=5;
            vy+=5;
            bounceCounter=0;
            
        }
    }
    
        

    }

    

