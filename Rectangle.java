
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    int width;
    int height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height; 
    }
    
    public boolean equals(Object obj)
    {
        Rectangle rec = (Rectangle)obj;
        if(this.width * this.height == rec.width * rec.height)
            return true;
        else 
            return false; 
    }

}
