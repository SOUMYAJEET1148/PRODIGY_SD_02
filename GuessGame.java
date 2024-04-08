import java.util.Random;
import java.util.Scanner;

public class GuessGame{
    
 static int lower = 1;
    static int upper = 10;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Random randomData = new Random();
      
    int target =  randomData.nextInt(lower , upper + 1);
          System.out.printf("Guess a Number Between %d and %d: ", lower, upper);

          Scanner userInput = new Scanner(System.in);
          int guess;
          int counter =0;
        do
          {
             guess = userInput.nextInt();
            counter++;
           if(guess > target)
          {
            System.out.println("Guess Lower");
          }
          else if( guess < target)
          {
            System.out.println("Guess Higher");
          }
          }
          while( guess != target);
         
            System.out.println("yah!! Its Correct took you" +counter + "tries");
    

    }
}