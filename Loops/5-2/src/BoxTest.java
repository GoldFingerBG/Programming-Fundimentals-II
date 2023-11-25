/*******************
  Nathaniel Bucknor-Smartt
  10/07/2023
  Module 5.2
  This program makes a box using the users specifications 
**********************/
import java.util.*;

public class BoxTest {
    public static void main(String[] args) throws Exception {

        int length;
        int width;
        

        Scanner scan = new Scanner(System.in);
        System.out.println("What is box length?: ");
        length = scan.nextInt();
        System.out.println("What is box width?: ");
        width = scan.nextInt();
        System.out.println("what is the Letter you want on this box?");
        char boxCharacter = scan.next().charAt(0);
        Box box = new Box(length, width, boxCharacter);
        System.out.println("Box length: " + box.getLength());
        System.out.println("Box Width: " + box.getWidth());
        System.out.println("This is a " + box.getShapeType(box));
        scan.close();
        System.out.println(box.drawBox(box));
    }
}
