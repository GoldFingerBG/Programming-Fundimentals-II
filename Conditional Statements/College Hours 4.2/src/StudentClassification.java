/*******************
  Nathaniel Bucknor-Smartt
  10/01/2023
  Module 4.2
  This program takes in College Student hours and tells you what grade your in.
**********************/
public class StudentClassification {

    private int hours = 0;

    public StudentClassification(int hours){
        this.hours = hours;
    }

    public String getClass(int hours){
        if(hours <= 29){
            return "Freshman";
        }else if(hours >= 30 && hours <= 59){
            return "Sophomore";
        }else if(hours >= 60 && hours <= 89){
            return "Junior";
        }else {
            return "Senior";
        }
    }


    public int getHours() {
        return this.hours;
    }

}
