/*******************
  Nathaniel Bucknor-Smartt
  11/10/2023
  Module 8.1
  This program takes a file and counts the words, the amount of "We"s in the file and capitalizes the word "People"
**********************/
import java.util.Scanner;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import java.io.FileNotFoundException;
import java.io.File;
public class TextFileProcessorTest {
    public static void main(String[] args) throws FileNotFoundException  {
        File f = new File("myFile.txt");
        Scanner scan = new Scanner(f);
        String file = scan.nextLine();
        //System.out.println(file);

        System.out.println("There are " + TextFileProcessor.wordCount(file) + " words in this file");
        System.out.println("There are " + TextFileProcessor.countWe(file) + " we's in this file");
        System.out.println(TextFileProcessor.capitalizePeople(file));
    }
}
