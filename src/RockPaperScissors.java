import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //variable declarations
        String playerA = "";
        String playerB = "";
        boolean range = false; // var to check if value is valid
        boolean range2 = false; // var to check if value is valid
        boolean range3 = true; // var to check if value is valid
        String yesOrNo = ""; //restart program
        boolean done = false;

        Scanner in = new Scanner(System.in); // sets up scanner class
        do {
            do {
                System.out.print("Player A, enter a Rock Paper Scissor move (R,P, or S): "); // prompts user
                playerA = in.nextLine(); // stores input
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) // tests valid input
                {
                    range = true;
                }
                else // not valid value
                {
                    System.out.println("You must enter a valid letter (R,P, or S): " + playerA); // gives user message
                    range = false;
                }

            } while (range != true); // prompts user again if invalid input

            do {
                System.out.print("Player B, enter a Rock Paper Scissor move (R,P, or S): "); // prompts user
                playerB = in.nextLine(); // stores input

                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) // tests if valid input
                {
                    range2 = true;
                }
                else // not valid input
                {
                    System.out.println("You must enter a valid letter (R,P, or S): " + playerB); // tells user what was wrong in input
                    range2 = false;
                }
            }while (range2 != true); // prompts user again if invalid input was entered

            if(playerA.equalsIgnoreCase("R")) // when player A chooses rock
            {
                if(playerB.equalsIgnoreCase("P")) // if player B chooses paper in response
                {
                    System.out.println("Player B wins, Paper covers Rock"); // outputs result
                } else if (playerB.equalsIgnoreCase("S")) // if player B chooses scissors in response
                {
                    System.out.println("Player A wins, Rock breaks Scissors"); // outputs result
                }
                else // player B chooses rock
                {
                    System.out.println("It is a tie, Rock vs Rock"); // outputs result
                }
            } else if (playerA.equalsIgnoreCase("P")) // player A chooses paper
            {
                if(playerB.equalsIgnoreCase("P")) // if player B chooses paper in response
                {
                    System.out.println("It is a tie, Paper vs Paper"); // outputs result
                } else if (playerB.equalsIgnoreCase("S")) // if player B chooses scissors in response
                {
                    System.out.println("Player B wins, Scissors cut Paper"); // outputs result
                }
                else //  player B chooses rock in response
                {
                    System.out.println("Player A wins, Paper covers Rock");
                }
            }
            else // player A chooses scissors
            {
                if(playerB.equalsIgnoreCase("P")) // if player B chooses paper in response
                {
                    System.out.println("Player A wins, Scissors cut paper"); // outputs result
                } else if (playerB.equalsIgnoreCase("S")) //if player B chooses scissors in response
                {
                    System.out.println("It is a tie, Scissors vs Scissors"); // outputs result
                }
                else //  player B chooses rock in response
                {
                    System.out.println("Player B wins Rock breaks Scissors"); // outputs result
                }
            }
            do {

                System.out.print("Would you like to play again? Respond with Y for yes and N for no: "); // prompts user to play again
                yesOrNo = in.nextLine(); // stores input

                if (yesOrNo.equalsIgnoreCase("y")) // user chooses yes
                {
                    done = true;
                    range3 = true;
                } else if (yesOrNo.equalsIgnoreCase("N")) // user chooses no
                {
                    done = false;
                    range3 = true;
                }
                else // user makes a mistake
                {
                    System.out.println("You must enter a valid option (Y or N): " + yesOrNo); // tells user their mistake
                    done = false;
                    range3 = false;
                }
            }while (range3 != true); // prompts user again if they made a mistake

        } while (done != false); // if user chooses yes the whole program repeats
    }

}