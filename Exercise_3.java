import java.util.Scanner;
import java.util.Random;

class GuessNumber{
    int number;
    int userInput;
    int count = 1;
    GuessNumber(){
        Random n = new Random();
        number = n.nextInt(1, 101);
//        System.out.println(number);
        System.out.println("Computer has chosen it's number, Now you may guess the Number! ");
    }

    void takeInput(){
        Scanner num = new Scanner(System.in);
        System.out.print("Your guess is: ");
        userInput = num.nextInt();
    }

    void isCorrectNumber(){
        for (int i = 1; i <= 100 ; i++){
            if (userInput != number) {
                System.out.println("Oops! your guess is incorrect");
                if (userInput > number){
                    System.out.println("[Hint: Try lesser value],");
                }
                else{
                    System.out.println("[Hint: Try greater value],");
                }
                takeInput();
                count++;
            }
            else{
                System.out.println("Correct! You made a right guess.");
                break;
            }
        }
        System.out.println("No. of Guesses is : "+count);
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println("Player 1: ");
        GuessNumber obj = new GuessNumber();
        obj.takeInput();
        obj.isCorrectNumber();
        System.out.println("\nPlayer 2: ");
        GuessNumber obj1 = new GuessNumber();
        obj1.takeInput();
        obj1.isCorrectNumber();
        if (obj.count < obj1.count){
            System.out.println("Congratulation! Player 1 Wins");
        }
        else if (obj.count == obj1.count){
            System.out.println("It's a draw");
        }
        else {
            System.out.println("Congratulation! Player 2 Wins");
        }
    }
}
