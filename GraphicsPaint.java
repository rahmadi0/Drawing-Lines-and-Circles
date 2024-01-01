import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GraphicsPaint extends JFrame implements ActionListener{

   public static JButton lineButton, circlButton, bothButton, exitButton;
   public static void main(String[] args){new GraphicsPaint();}
   
   public GraphicsPaint(){
        setButtons();
        setAction();
        setLocation(500, 0);
        setSize(460, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void setButtons(){

        JPanel panel = new JPanel();
        
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        
        lineButton = new JButton("Create Line");
        lineButton.setForeground(Color.black);
        
        circlButton = new JButton("Create Circle");
        circlButton.setForeground(Color.black);
        
        bothButton = new JButton("Create Circle & Line");
        bothButton.setForeground(Color.blue);
        
        exitButton = new JButton("Exit");
        exitButton.setForeground(Color.red);
        
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBorder(BorderFactory.createMatteBorder(10,10,10,10,Color.BLACK));
        
        add(panel, BorderLayout.NORTH);
        panel.add(lineButton);
        panel.add(circlButton);
        panel.add(bothButton);
        panel.add(exitButton);
   }
   
   public void setAction(){
        lineButton.addActionListener(this);
        circlButton.addActionListener(this);
        bothButton.addActionListener(this);
        exitButton.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e){

        if(e.getSource() == circlButton){
           FrameB obj1 = new FrameB("Circle");
           obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        if(e.getSource() == lineButton){
           FrameA obj = new FrameA("Line");
           obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        if(e.getSource() == bothButton){
           FrameB obj1 = new FrameB("Circle");
           obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           FrameA obj = new FrameA("Line");
           obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        if(e.getSource() == exitButton){
           System.exit(0);
        }
   }
   
}

class FrameA extends JFrame{
    String title;
    Container con;
    
    FrameA(String title){
        super(title);
        setSize(450, 600);
        setLocation(200, 100);
        setVisible(true);
        
        con = getContentPane();
        con.setBackground(Color.black);
    }
    
    public void paint(Graphics g){
         super.paint(g);
         
         int lineWidth;
         lineWidth = 350;
         g.setColor(Color.black);
         
         //draw line
         int xLineWidth [] = {100, lineWidth};
         int yLineHeight[] = {150, 150};
         
         //draw RightArc
         int xArcRight [] = {350, 300, 350, 300};
         int yArcRight  [] = {150, 100, 150, 210};
         
         //draw LeftArc
         int xArcLeft [] = {100, 150, 100, 150};
         int yArcLeft  [] = {150, 100, 150, 210};
         
         //draw second line
         int x1LineWidth [] = {100, lineWidth};
         int y1LineHeight[] = {400, 400};
         
         //draw RightArc
         int x1ArcRight [] = {350, 400, 350, 400};
         int y1ArcRight  [] = {400, 350, 400, 460};
         
         //draw LeftArc
         int x1ArcLeft [] = {100, 50, 100, 50}; 
         int y1ArcLeft  [] = {400, 350, 400, 460};
         
         g.setColor(Color.white);
         g.fillRect (50, 60, 350, 200);

         g.fillRect (50, 300, 350, 200);
         g.setColor(Color.black);
         
         int lineNum = 0;
         int numOfPoints = 0;
         
         while(lineNum != 3){
         
             g.drawPolyline(xLineWidth, yLineHeight, lineNum);

             g.drawPolyline(x1LineWidth, y1LineHeight, lineNum);
             
            try{
         
                  Thread.sleep(500);
            }catch(InterruptedException v){}
            
            lineNum += 1;
        }
        
        
        while(numOfPoints != 5){
             
            
            g.drawPolyline(xArcRight, yArcRight, numOfPoints);
            g.drawPolyline(xArcLeft, yArcLeft, numOfPoints);
                  
            g.drawPolyline(x1ArcRight, y1ArcRight, numOfPoints);
            g.drawPolyline(x1ArcLeft, y1ArcLeft, numOfPoints);

             
            try{
         
                  Thread.sleep(500);
            }catch(InterruptedException v){}
            
            numOfPoints += 1;
        } 
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
        g.fillRect (350, 130, 250, 300);
        

        int arc = 0;
        int angle = 0;
        
        while(arc != 8){

            g.setColor(Color.gray);
            g.fillArc(125, 180, 200, 200, angle, 45);

            
            try{
         
                  Thread.sleep(600);
            }catch(InterruptedException e){}

            angle = angle + 45;
            arc++;
 
        }
        
        int arc1 = 0;
        int angle1 = 360;
        
        while(arc1 != 8){

            g.setColor(Color.black);
            g.fillArc(375, 180, 200, 200, angle1, 45);

            
            try{
         
                  Thread.sleep(600);
            }catch(InterruptedException e){}

            angle1 = angle1 - 45;
            arc1++;
 
        }
        
        displayInfo();
    }
    public void displayInfo(){

        int x = 250;
        int y = 500;
        
        String [] name = {"E", "N", "D", " O ", " F", " - ", "P", "R", "O", "G", "R", "A", "M"};
        
        Graphics g = getGraphics();
        Font font = new Font("dialog", Font.ITALIC|Font.BOLD, 20);
        g.setFont(font); 
        g.setColor(Color.black);
            
        for(int i=0; i<name.length; i++){
            
            g.drawString(name[i], x, y);
            
            
            try{
         
                  Thread.sleep(450);
            }catch(InterruptedException v){}

            x = x + 15;
        } 
     }
     
 }
