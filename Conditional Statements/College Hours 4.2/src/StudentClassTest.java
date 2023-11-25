import java.util.Scanner;
public class StudentClassTest {
    public static void main(String[] args) throws Exception {
        String name;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your name?: ");
        name =  scan.nextLine();

        System.out.println("How many college hours do you have?");
        StudentClassification classification = new StudentClassification(scan.nextInt());
        System.out.println();
        System.out.println();


        scan.nextLine();
   
        System.out.println("Hi " + name + ", You are a " + classification.getClass(classification.getHours()));
        scan.close();
    }
}
