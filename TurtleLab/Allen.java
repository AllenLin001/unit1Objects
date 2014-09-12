import javax.swing.JFrame;
import java.awt.Color;

public class Allen
{
    public static void main(String[] args)
    {
       World turtleWorld = new World();
       Turtle fatty = new Turtle(turtleWorld);
       fatty.setPenColor(Color.RED);
       fatty.penDown();
       fatty.forward(50);
       fatty.backward(100);
       fatty.turnRight();
       fatty.forward(33);
       fatty.penUp();
       fatty.setVisible(false); 
       fatty.forward(30);
       fatty.turnLeft();
       fatty.forward(100);
       fatty.setVisible(true);
       fatty.penDown();
       fatty.setPenColor(Color.BLUE);
       fatty.backward(100);
       fatty.turnRight();
       fatty.forward(33);
       fatty.penUp();
       fatty.setVisible(false);
       fatty.setPenColor(Color.YELLOW);
       fatty.forward(30);
       fatty.penDown();
       fatty.forward(33);
       fatty.penUp();
       fatty.setVisible(false);
       fatty.turnLeft();
       fatty.forward(100);
       fatty.turnLeft();
       fatty.penDown();
       fatty.setVisible(true);
       fatty.forward(33);
       fatty.turnLeft();
       fatty.forward(50);
       fatty.turnLeft();
       fatty.forward(33);
       fatty.penUp();
       fatty.backward(33);
       fatty.penDown();
       fatty.turnRight();
       fatty.forward(50);
       fatty.turnRight();
       fatty.penUp();
       fatty.setVisible(true);
       fatty.backward(63);
       fatty.penDown();
       fatty.turnRight();
       fatty.setPenColor(Color.GREEN);
       fatty.forward(100);
       fatty.turn(135.0);
       fatty.forward(144);
       fatty.turn(-135.0);
       fatty.forward(100);
       fatty.penUp();
       fatty.setPenColor(Color.BLUE);
       fatty.turnLeft();
       fatty.forward(350);
       fatty.turn(-70.0);
       fatty.penDown();
       fatty.forward(110);
       fatty.backward(110);
       fatty.turn(-40.0);
       fatty.forward(110);
       fatty.backward(55);
       fatty.turn(110.0);
       fatty.forward(40);
       Turtle skinny = new Turtle(fatty.getXPos()-40,fatty.getYPos()+75,turtleWorld);
       skinny.penDown();
       skinny.forward(150);
       skinny.turnRight();
       skinny.forward(430);
       skinny.turnRight();
       skinny.forward(150);
       skinny.turnRight();
       skinny.forward(430);
       
       
       
       
     
       
    
       
       
    }
}


   