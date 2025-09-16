/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 * Trevor McQueen 9/15/2025 2 people from different dimension talking under 
 * a purple moon.
 */
public class Picture
{
    private Person human1;
    private Person human2;
    private Triangle hat1;
    private Triangle hat2;
    private Square base;
    private Circle moon;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        human1 = new Person();
        human2 = new Person();
        hat1 = new Triangle();  
        hat2 = new Triangle();
        base= new Square();
        moon= new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            base.moveHorizontal(-140);
            base.moveVertical(20);
            base.changeSize(200);
            base.makeVisible();
            base.changeColor("green");
            
            human1.changeColor("black");
            human1.moveHorizontal(-90);
            human1.moveVertical(-90);
            human1.makeVisible();
    
            human2.changeColor("black");
            human2.moveHorizontal(75);
            human2.moveVertical(-90);
            human2.makeVisible();
    
            hat1.changeColor("red");
            hat1.moveHorizontal(140);
            hat1.moveVertical(-120);
            hat1.makeVisible();
            
            hat2.changeColor("blue");
            hat2.moveHorizontal(-20);
            hat2.moveVertical(-120);
            hat2.makeVisible();
            
            moon.changeColor("magenta");
            moon.moveHorizontal(10);
            moon.moveVertical(-90);
            moon.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        human1.changeColor("black");
        human2.changeColor("black");
        hat1.changeColor("black");
        hat2.changeColor("black");
        base.changeColor("black");
        moon.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        human1.changeColor("black");
        human2.changeColor("black");
        hat1.changeColor("red");
        hat2.changeColor("blue");
        base.changeColor("green");
        moon.changeColor("magenta");
    }
}
