/*******************
  Nathaniel Bucknor-Smartt
  10/01/2023
  Module 4.1
  This program takes in 3 quiz scores, gets the letter grade and averages your grades.
**********************/
public class CourseQuizScore {

    private double quiz1,quiz2,quiz3 = 50;



    public CourseQuizScore(double quiz1, double quiz2, double quiz3){
        setQuiz1(quiz1);
        setQuiz2(quiz2);
        setQuiz3(quiz3);
    }

    

    public CourseQuizScore(){
        quiz1 = 50;
        quiz2 = 50;
        quiz3 = 50;
    }


    public double getQuiz1() {
        return this.quiz1;
    }

    public void setQuiz1(double quiz1) {
        if(quiz1 < 50){
            this.quiz1 = 50;
        }else if (quiz1 > 100){
            this.quiz1 = 100;
        }else{
            this.quiz1 = quiz1;
        }

    }

    public double getQuiz2() {
        return this.quiz2;
    }

    public void setQuiz2(double quiz2) {
        if(quiz2 < 50){
            this.quiz2 = 50;
        }else if (quiz2 > 100){
            this.quiz2 = 100;
        }else{
            this.quiz2 = quiz2;
        }
    }

    public double getQuiz3() {
        return this.quiz3;
    }

    public void setQuiz3(double quiz3) {
        if(quiz3 < 50){
            this.quiz3 = 50;
        }else if (quiz3 > 100){
            this.quiz3 = 100;
        }else{
            this.quiz3 = quiz3;
        }
    }



    public char GetLetterGrade(double quiz){
        if((quiz <= 100 && quiz >= 90) || quiz > 100){
            return 'A';
        }else if(quiz <= 89 && quiz >= 80){
            return 'B';
        }else if(quiz <= 79 && quiz >= 70){
            return 'C';
        }else if(quiz <= 69 && quiz >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }

    public double GetGradeAverage(){
        return Math.round((quiz1 + quiz2 + quiz3)/3);
    }
}