public class Countdown {
    private int count = 10;


    public void doWhileCountdown(){
        do{
            System.out.println(count);
            count--;
        }while (count > 0);
        System.out.println("BlastOff!");
        count = 10;
    }

    public void whileCountdown(){
        while(count > 0){
            System.out.println(count);
            count--;
        }
        System.out.println("Blastoff!");
        count = 10;
    }

    public void forCountdown(){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Blastoff!");
    }
}
