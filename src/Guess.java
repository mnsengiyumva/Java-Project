import java.util.Scanner;



public class Guess{

    private String playerName;
    private int playerAge;
    private int computerGuess;
    public int attempts = 10;


    public Guess(String name, int age, int computer){

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

        while (this.attempts>0){
            Scanner userGuess = new Scanner(System.in);

            System.out.println("Guess the number between 1 and 100: ");
            int guessedNumber = userGuess.nextInt();
            if(guessedNumber < getComputerGuess() && attempts>0){
                System.out.println("Too low. Try again later");
                attempts --;
            }
            else if(guessedNumber > getComputerGuess() && attempts>0) {

                System.out.println("Too high. Try again later");
                attempts --;

            }

        }

    }

    public static void main(String[] args){


        Guess player1 = new Guess("Thomas", 28, 80);
        System.out.println("Welcome to the game "+player1.getPlayerName()+" Good luck!");
        player1.play();













    }




}