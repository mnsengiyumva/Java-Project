import java.util.Scanner;



public class Guess{

    String playerName;
    int playerAge;

    public Guess(String name, int age){

        this.playerName = name;
        this.playerAge = age;

    }

    public int getPlayerAge(){
        return this.playerAge;
    }

    public String getPlayerName(){
        return this.playerName;
    }



    public static void main(String[] args){


        Guess player1 = new Guess("Thomas", 28);
        System.out.println("Welcome to the game"+player1.getPlayerName()+" Good luck!");

        Scanner userGuess = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 100: ");
        int guessedNumber = userGuess.nextInt();








    }




}