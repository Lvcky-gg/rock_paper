import java.util.Scanner;
public class Game {
    //Rules
    //Rock beat scissors
    //paper beats rock
    //scissors beats paper
    public static void main(String[] args){

        // take an input from user = User Choice
        Scanner console = new Scanner(System.in);
        String userChoice;
        boolean exit = false;


        do{
        String computerChoice = null;
        boolean validChoice = false;
        int compScore = 0;
        int usrScore = 0;
        do{
            System.out.print("Please select a move:[rock, paper or scissors]");
            userChoice = console.nextLine();
            if(userChoice.equalsIgnoreCase("rock")||userChoice.equalsIgnoreCase("paper")||userChoice.equalsIgnoreCase("scissors")){
                validChoice = true;
            }else{
                System.out.println("Error: Invalid Choice");
            }

        }while(!validChoice);


        // randomly generate a choice = computer choice

        int random = (int)Math.floor(Math.random() * 3);
        switch(random){
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
            default:
                computerChoice = null;

        }


        // compare choices and determine winner
        String graphic = "L O A D I N G";
        for ( int i = 0; i < graphic.length(); i++){
            System.out.println(graphic.charAt(i));
        }
        if(computerChoice.equalsIgnoreCase(userChoice)){
            System.out.printf("You both picked %s, its a tie!%n", userChoice);
        }else if(computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("paper")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", computerChoice, userChoice);
            usrScore+=1;
        }else if(computerChoice.equalsIgnoreCase("paper")&& userChoice.equalsIgnoreCase("scissors")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", computerChoice, userChoice);
            usrScore+=1;
        }else if(computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("rock")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", computerChoice, userChoice);
            usrScore+=1;
        }else{
            System.out.printf("The computer picked %s and you picked %s, you lost!%n", computerChoice, userChoice);
            compScore+=1;
        }
        System.out.printf("Computer Score: %s, Your Score: %s   ", compScore, usrScore);
        System.out.println("Would you like to keep playing? [y/n]");
        String exitCondition = console.nextLine();
        if(exitCondition.equalsIgnoreCase("n")){
            exit = true;
        }
        }while(!exit);
    }
}
