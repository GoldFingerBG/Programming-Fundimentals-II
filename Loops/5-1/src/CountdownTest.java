/*******************
  Nathaniel Bucknor-Smartt
  10/07/2023
  Module 5.1
  This program counts down to blastoff in three different methods
**********************/
public class CountdownTest {
    public static void main(String[] args) throws Exception {
        Countdown count = new Countdown();
        count.doWhileCountdown();
        System.out.println();
        count.whileCountdown();
        System.out.println();
        count.forCountdown();
    }
}
