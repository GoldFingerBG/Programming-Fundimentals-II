/*
 * @author Dr. Kevin Roark
 * Demo6
 * Code writes a file and reads the data into an ArrayList of the Person object
 * 10/07/2023
 * Modified by: Nathaniel Bucknor-Smartt
 * I added GPA and Phone Number to the fields and output statements 
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File; // Import for File Object
import java.io.IOException;  // Import for IO Exceptions
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class ChapterFiveLabDriver{
	public static void main(String[] args) {		
		//****************************************************************
		//Variables we will use in the program			
		//****************************************************************
		ArrayList<Person> Students = new ArrayList<Person>();
		String firstName;
		String lastName;
		String PhoneNumber;
		double GPA;

		int age;
		int index = 0; //index for the ArrayList 

		//****************************************************************
		//Lets create our Data File 
		//here we will use a try/catch in the event something goes wrong
		//****************************************************************
		try {
			  //Create an instance of the File Writer and give it the filename
		      FileWriter myWriter = new FileWriter("Person.txt");
		      //Write our data to the file 
		      myWriter.write("Kevin Roark 29 4.89 210-516-7688\n"		      		
		    		+ "Sam Read 21 3.85 512-685-7432\n"
		      		+ "Sally Smith 34 3.5 634-856-7892\n"
		      		+ "Bart Simpson 14 1.5 655-682-6857");
		      //close the file we opened - MUST BE DONE
		      myWriter.close();
		      //Message that all was done
		      System.out.println("Successfully wrote to the file.");
		    } 
		catch (IOException e) 
			{
				  //An issue happened - Message user  
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}

		//****************************************************************
		//Now lets read the file into our ArrayList of object Person
		//****************************************************************
		try {
			  //Create a file object
		      File myObj = new File("Person.txt");
		      Scanner myReader = new Scanner(myObj);
		      //While there is data to read
		      while (myReader.hasNextLine()) 
		      {
		    	  //Read in each variable from file   
		    	  firstName = myReader.next();
		    	  lastName = myReader.next();
		    	  age = myReader.nextInt();
				  GPA = myReader.nextDouble();
				  PhoneNumber = myReader.next();
		    	  
		    	  //Add as an instance of the person to the ArrayList using the Person Constructor 
		    	  Students.add(new Person(firstName, lastName, age, GPA, PhoneNumber));  
		      }
		      //close the file we opened - MUST BE DONE
		      myReader.close();		      
		    } 
			//If we could not find the file - catch the error
		catch (FileNotFoundException e) 
			{
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}	
		//****************************************************************
		//Now lets iterate through our ArryList and use the Person PrintData method
		//to show we have our ArrayList of Student Objects
		//****************************************************************
		while (index < Students.size())
		{
			//we iterate through each index and invoke the PrintData method of the Person object
			System.out.println(Students.get(index).PrintData());
			index++;
		} //end of while loop
	}
}