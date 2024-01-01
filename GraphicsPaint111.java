import java.awt.*;
import javax.swing.*;

class GraphicsPaint111 {
	public static void main(String[] args){
   
		FrameA obj = new FrameA("FrameA");
      FrameB obj1 = new FrameB("FrameB");
      
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class FrameA extends JFrame{
    String title;
    
    FrameA(String title){
        super(title);
        setSize(450, 600);
        setLocation(200, 100);
        setVisible(true);
    }
    
    public void paint(Graphics g){
         super.paint(g);
         
         int lineWidth;
         
         lineWidth = 350;
        
         g.setColor(Color.black);
         
         //draw line
         int xWidth [] = {100, lineWidth};
         int yHeight[] = {150, 150};
         
         g.drawPolyline(xWidth, yHeight, 2);
         
         //draw RightArc
         int xArcRight [] = {350, 300, 350, 300};
         int yArcRight  [] = {150, 100, 150, 210};
         
         g.drawPolyline(xArcRight, yArcRight, 4);
         
         //draw LeftArc
         int xArcLeft [] = {100, 150, 100, 150};
         int yArcLeft  [] = {150, 100, 150, 210};
         
         g.drawPolyline(xArcLeft, yArcLeft, 4);
         
         
         //draw second line
         int x1Width [] = {100, lineWidth};
         int y1Height[] = {400, 400};
         
         g.drawPolyline(x1Width, y1Height, 2);
         
         //draw RightArc
         int x1ArcRight [] = {350, 400, 350, 400};
         int y1ArcRight  [] = {400, 350, 400, 460};
         
         g.drawPolyline(x1ArcRight, y1ArcRight, 4);
         
         //draw LeftArc
         int x1ArcLeft [] = {100, 50, 100, 50}; 
         int y1ArcLeft  [] = {400, 350, 400, 460};
         
         g.drawPolyline(x1ArcLeft, y1ArcLeft, 4);
    }    
 
}

class FrameB extends JFrame{
    String title;
    
    public FrameB(String title){
        super(title);
        setSize(700, 600);
        setLocation(650, 100);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);
        g.fillRect (100, 130, 250, 300);
        
        g.setColor(Color.gray);
        g.fillArc(125, 180, 200, 200, 360, 360);
        
        
        g.setColor(Color.gray);
        g.fillRect (350, 130, 250, 300);
        
        g.setColor(Color.black);
        g.fillArc(375, 180, 200, 200, 360, 360);
    } 
}
