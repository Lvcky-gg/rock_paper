import java.util.Scanner;
public class Game {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        boolean exit = false;
        do{
            int userMove = getUserChoice();
            int computerMove = computerChoice();
            String userChoice = generateMove(userMove);
            String computerChoice = generateMove(computerMove); //modify this to change to pvp
            determineWinner(userChoice, computerChoice);
            exit = playAgain();


        }while(!exit);

    }

    public static int getUserChoice(){

            boolean validChoice = false;
            int userChoice;

            do{
                System.out.print("Please select a move:[rock, paper or scissors]");
                System.out.println("0. Rock");
                System.out.println("1. Paper");
                System.out.println("2. Scissors");
                userChoice = Integer.parseInt(console.nextLine());
                if(userChoice==0||userChoice==1||userChoice==2){
                    validChoice = true;
                }else{
                    System.out.println("Error: Invalid Choice");
                }

            }while(!validChoice);
            return userChoice;

    }

    public static int computerChoice(){
        int random = (int)Math.floor(Math.random() * 3);
        return random;
    }
    public static String generateMove(int playerChoice){
        String move = null;
        switch(playerChoice){
            case 0:
                move = "rock";
                break;
            case 1:
                move = "paper";
                break;
            case 2:
                move= "scissors";
                break;
            default:
                move = null;

        }
        return move;

    }
    //determine a winner
    public static void determineWinner(String userOneChoice, String userTwoChoice){
        String graphic = "L O A D I N G";
        for ( int i = 0; i < graphic.length(); i++){
            System.out.println(graphic.charAt(i));
        }
        if(userTwoChoice.equalsIgnoreCase(userOneChoice)){
            System.out.printf("You both picked %s, its a tie!%n", userOneChoice);
        }else if(userTwoChoice.equalsIgnoreCase("rock") && userOneChoice.equalsIgnoreCase("paper")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", userTwoChoice, userOneChoice);

        }else if(userTwoChoice.equalsIgnoreCase("paper")&& userOneChoice.equalsIgnoreCase("scissors")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", userTwoChoice, userOneChoice);

        }else if(userTwoChoice.equalsIgnoreCase("scissors") && userOneChoice.equalsIgnoreCase("rock")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", userTwoChoice, userOneChoice);

        }else{
            System.out.printf("The computer picked %s and you picked %s, you lost!%n", userTwoChoice, userOneChoice);

        }
    }
    //play again
    public static boolean playAgain(){
        System.out.println("Would you like to keep playing? [y/n]");
        String exitCondition = console.nextLine();
        if(exitCondition.equalsIgnoreCase("n")){
           return true;
        }else{
            return false;
        }
    }
}
