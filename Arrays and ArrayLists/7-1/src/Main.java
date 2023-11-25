/*******************
  Nathaniel Bucknor-Smartt
  11/3/2023
  Module 7.1
  This program goes off of a pre existing contacts list and shows you who is in your contacts and allows you to search. 
**********************/
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        ContactList list = new ContactList();
        Scanner scan = new Scanner(System.in);
        int temp;
        String Name;
        System.out.println("*******************************");
        System.out.println("******Your Contact List!*******");
        System.out.println("*******************************");
        System.out.println();
        System.out.println("1.Show all Contacts\r\n" + //
                "\r\n" + //
                "2.Search contacts based on the last name\r\n" + //
                "\r\n" + //
                "3.Search contacts based on the first name\r\n" + //
                "\r\n" + //
                "4.Quit program");
        temp = scan.nextInt();
        if(temp == 1){
            list.showAllContacts();
        }else if(temp == 2){
            System.out.println("Enter Last Name:");
            Name = scan.next();
            list.searchByLastName(Name);
        }else if(temp == 3){
            System.out.println("Enter First Name:");
            Name = scan.next();
            list.searchByFirstName(Name);
        }else{
            list.quit();
        }
}
}
