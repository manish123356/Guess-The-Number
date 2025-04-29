//package OOPS;
import  java.util.Scanner;
import java.util.Random;

class Game{
    public int ComputerInput  , UserGuess  ,  no_of_guess =0;

    //constructor for Generating random number
    public Game(){
        Random random = new Random();
        ComputerInput = random.nextInt(100);
    }

    // method to take guess from user
    public void UserInput(int num){
        UserGuess = num;
    }



    public boolean IsCorrectNumber(){
        if(UserGuess > ComputerInput){
            System.out.println("You have chosen Bigger No");
            no_of_guess = no_of_guess + 1;
            return false;
        }
        else  if(UserGuess < ComputerInput){
            System.out.println("You have Chosen Smaller number");
            no_of_guess = no_of_guess + 1;
            return  false;
        }
        else {
            System.out.println("Your Guess is Correct");
            no_of_guess = no_of_guess + 1;
            System.out.println("Number of Guess required : "+no_of_guess);
            return true;
        }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GUESS THE NUMBER GAME ! ");


        Game player = new Game();

        /// this will take input from user as guess
        System.out.println("Guess the Number from 0 to 100: ");
        player.UserInput(sc.nextInt());


        while(!player.IsCorrectNumber()){
            System.out.println("Guess the Number Again");
            player.UserInput(sc.nextInt());
        }
    }
}