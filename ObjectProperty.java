
/**
 * Write a description of class ObjectProperty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObjectProperty
{
    public static void main(String[] args){
        Rectangle rec = new Rectangle(3, 4); 
        Rectangle rec2 = new Rectangle(3, 4);
        
        System.out.println(rec.equals(rec2));
    }
}
