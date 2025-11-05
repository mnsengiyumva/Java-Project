import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class NumberGuessingGame {

    private String playerName;
    private int playerAge;
    private int computerGuess;
    public int attempts = 3;

    private static HashMap<String, Integer> playersScores = new HashMap<>();

    private int scores = 10;

    /** Initialize a class constructor
     * @param name refers ti the name of the player
     * @param age refers to the age of the player
     * @param computer refers to the guess from computer
     */
    public NumberGuessingGame(String name, int age, int computer){

        this.playerName = name;
        this.playerAge = age;
        this.computerGuess = computer;
    }

    public int getPlayerAge(){
        return this.playerAge;
    }
    public String getPlayerName(){
        return this.playerName;
    }
    public void setComputerGuess(int newComputerGuess) {
        this.computerGuess = newComputerGuess;
    }
    public int getComputerGuess() {
        return computerGuess;
    }

    public void play(){

        System.out.print("Who is playing: ");
        Scanner currentPlayer = new Scanner(System.in);

        String player = currentPlayer.nextLine();
        while (attempts>0) {

            Scanner userGuess = new Scanner(System.in);
            System.out.print(player+" Guess the number between 1 and 100: ");

            int guessedNumber = userGuess.nextInt();

            attempts --;
            if (guessedNumber < getComputerGuess() && attempts > 0) {
                System.out.println("Too low. Try again later");
                scores --;

            } else if (guessedNumber > getComputerGuess() && attempts > 0) {

                System.out.println("Too high. Try again later");
                scores --;

            } else if (guessedNumber == getComputerGuess() && attempts > 0) {

                System.out.println("Congratulations You won your guess is: " + guessedNumber + " and computer guess is: " + computerGuess);
                System.out.println(player+ "scored: "+scores);
                playersScores.put(player, scores);

                break;

            }
            else{

                System.out.println("You lost, the number is " + computerGuess + ". You run out of attempts. See you again");
                break;

            }

        }

    }

    public static HashMap<String, Integer> getScores() {
        return NumberGuessingGame.playersScores;
    }

    public void winner(){

        ArrayList<Integer> winnersScores = new ArrayList<>(NumberGuessingGame.playersScores.values());

    }



}