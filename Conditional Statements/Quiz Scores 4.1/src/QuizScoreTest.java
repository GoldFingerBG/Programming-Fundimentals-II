import java.util.*;

public class QuizScoreTest {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        double q1,q2,q3;
        String name;

        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("What was your first quiz score?: ");
        q1 = scan.nextDouble();
        System.out.println("What was your second quiz score?: ");
        q2 = scan.nextDouble();
        System.out.println("What was your third quiz score?: ");
        q3 = scan.nextDouble();
        scan.close();

        CourseQuizScore score = new CourseQuizScore(q1,q2,q3);

        System.out.println("Name: " + name);
        System.out.println("Quiz 1: " + score.getQuiz1() + " - " + score.GetLetterGrade(q1));
        System.out.println("Quiz 2: " + score.getQuiz2() + " - " + score.GetLetterGrade(q2));
        System.out.println("Quiz 3: " + score.getQuiz3() + " - " + score.GetLetterGrade(q3));
        System.out.println("Grade Average: " + score.GetGradeAverage() + " - " + score.GetLetterGrade(score.GetGradeAverage()));






    }
    
}
