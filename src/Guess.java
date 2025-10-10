import java.util.Scanner;
import java.util.HashMap;



public class Guess{

    private String playerName;
    private int playerAge;
    private int computerGuess;
    public int attempts = 10;
    private int numberOfPlayers;

    private static HashMap<String, Integer> playersScores = new HashMap<>();

    private int scores = 10;


    public Guess(String name, int age, int computer, int players){

        this.playerName = name;
        this.playerAge = age;
        this.computerGuess = computer;
        this.numberOfPlayers = players;

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

        while (this.attempts>0 &&numberOfPlayers>0){
            Scanner currentPlayer = new Scanner(System.in);

            System.out.println("Welcome to the game");
            System.out.print("Who is playing: ");
            String player = currentPlayer.nextLine();
            System.out.println("Welcome to the game "+player+" Good luck!");

            Scanner userGuess = new Scanner(System.in);

            System.out.print(player+" Guess the number between 1 and 100: ");

            int guessedNumber = userGuess.nextInt();

            for (int i = 0; i<=numberOfPlayers; i++) {

                numberOfPlayers --;


//                Scanner userGuess = new Scanner(System.in);
//
//                System.out.print(player+" Guess the number between 1 and 100: ");
//
//                int guessedNumber = userGuess.nextInt();

                if (guessedNumber < getComputerGuess() && attempts > 0) {
                    System.out.println("Too low. Try again later");
                    attempts--;
                    scores --;

                } else if (guessedNumber > getComputerGuess() && attempts > 0) {

                    System.out.println("Too high. Try again later");
                    attempts--;
                    scores --;

                } else if (guessedNumber == getComputerGuess() && attempts > 0) {

                    System.out.println("Congratulations You won your guess is: " + guessedNumber + " and computer guess is: " + computerGuess);
                    System.out.println(player+ "scored: "+scores);
                    playersScores.put(player, scores);

                    break;

                }
                if (attempts < 0) {

                    System.out.println("You lost, the number is " + computerGuess + ". You run out of attempts. See you again");
                    break;

                }



            }


        }

    }

    public static HashMap<String, Integer> getScores() {
        return playersScores;
    }

    public static void main(String[] args){


        Guess player1 = new Guess("Thomas", 28, 80, 2);
        player1.play();
        System.out.println(getScores());

    }



}