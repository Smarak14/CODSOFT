import java.util.Scanner;
import java.util.Random;

 class Guessthenumber {
    public int randomno;
    public int inputno;
    public int noofguesses=0;

    public int getnoofguesses(){
        return noofguesses;
    }
    public void setnoofgusses(){
        this.noofguesses= noofguesses;
    }

    Guessthenumber(){
        Random random = new Random();
        this.randomno = random.nextInt(100);
    }

    void typeinput(){
        System.out.print("Enter a number");
        Scanner sc = new Scanner(System.in);
        inputno = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noofguesses++;
    if (inputno==randomno){
        System.out.println("You Guesse the correct no");
        return true;
        } else if(inputno<randomno){
        System.out.println("Your guesse is Low");
    }else if(inputno>randomno){
        System.out.println("Your gusses is high");
    }
    return false;
    }
    }
    public class Task_2 {
        public static void main(String[] args) {
            Guessthenumber game = new Guessthenumber();
            boolean b = false;
            while (!b) {
                game.typeinput();
                b= game.isCorrectNumber();
                
            }
        }
    
        
    }  