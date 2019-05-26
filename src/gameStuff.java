import java.awt.Color;
import java.awt.Graphics;

public class gameStuff {
	   int x;
       int y;
       int width;
       int height;
       
       gameStuff(int x, int y, int width, int height){
    	this.height=height;
    	this.x=x;
    	this.y=y;
    	this.width=width;
       }
       
       void draw(Graphics g){
    	   g.setColor(Color.black);
    	g.fillRect(x,y,width,height);
    	   
       }
       void update() {
    	   
       }
}
