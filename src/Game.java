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
        String computerChoice = null;

        System.out.print("Please select a move:[rock, paper or scissors]");
        userChoice = console.nextLine();
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

        if(computerChoice.equalsIgnoreCase(userChoice)){
            System.out.printf("You both picked %s, its a tie!%n", userChoice);
        }else if(computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("paper")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", computerChoice, userChoice);
        }else if(computerChoice.equalsIgnoreCase("paper")&& userChoice.equalsIgnoreCase("scissors")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", computerChoice, userChoice);
        }else if(computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("rock")){
            System.out.printf("The computer picked %s and you picked %s, you win!%n", computerChoice, userChoice);
        }else{
            System.out.printf("The computer picked %s and you picked %s, you lost!%n", computerChoice, userChoice);
        }
    }
}
