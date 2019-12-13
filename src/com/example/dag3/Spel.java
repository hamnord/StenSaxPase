package com.example.dag3;

import java.util.Scanner;

public class Spel {
    public static void main(String[] args) {

        int numGames = 0;
        int arrNum = 3;

        int randomsign = (int) (Math.random() * arrNum);

        String[] sign = new String[3];
        sign[0] = "rock";
        sign[1] = "scissors";
        sign[2] = "paper";

        Scanner scan = new Scanner(System.in);

        System.out.println("::.................................:: \n" +
                "::           Welcome               ::"+
                "\n::              to                 ::\n" +
                "::       rock,paper,scissors!      ::\n" +
                "::.................................::" + "\n" );

        for (int numOfRounds = 0; numOfRounds <= sign.length; numOfRounds++) {

            System.out.print(" pick between rock, paper, scissors: ");
            String inputsign = scan.nextLine();

            if (inputsign.equals(sign[0])) {
                System.out.println("::::::::::::::::::::::::::::::::::::::: \n::         " +
                    "you picked: " + inputsign + "            ::");
            } else if (inputsign.equals(sign[1])) {
                System.out.println("::::::::::::::::::::::::::::::::::::::: \n::        " +
                    " you picked: " + inputsign + "             ::");
            }
            if (inputsign.equals(sign[2])) {
                System.out.println("::::::::::::::::::::::::::::::::::::::: \n::         " +
                    "you picked: " + inputsign + "            ::");
            }

            do {


                if (randomsign == 0 && inputsign.equals(sign[1])) {
                    System.out.println(":: CPU picked rock, you lost!  ::\n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                else if (randomsign == 0 && inputsign.equals(sign[2])) {
                    System.out.println("::   CPU picked rock, you won!     ::\n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                if (randomsign == 1 && inputsign.equals(sign[2])) {
                    System.out.println(":: CPU picked scissors, you lost!   ::\n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                else if (randomsign == 1 && inputsign.equals(sign[0])) {
                    System.out.println("::   CPU picked scissors, you won!      ::\n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                if (randomsign == 2 && inputsign.equals(sign[0])) {
                    System.out.println(":: CPU picked paper, you lost!  ::\n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                else if (randomsign == 2 && inputsign.equals(sign[1])) {
                    System.out.println("::   CPU picked paper, you won!     ::\n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                if (randomsign == 0 && inputsign.equals(sign[0])) {
                    System.out.println("you both picked rock!? its a draw! \n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                else if (randomsign == 1 && inputsign.equals(sign[1])) {
                    System.out.println(" you both picked scissors!? its a draw! \n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }
                if (randomsign == 2 && inputsign.equals(sign[2])) {
                    System.out.println("you both picked scissors!? its a draw! \n:::::::::::::::::::::::::::::::::::::::");
                    numGames++;
                }

            }

            while (numOfRounds == numGames);
            System.out.println("      you have played: " + numGames + " game." + "\n ... ... ... ... ... ... ... ...");

            if(numOfRounds == 2) {
                System.out.print("do you want to continue the game? Y/N: ");
                String avslutagame = scan.nextLine();

            if(avslutagame.equals("Y")){
                System.out.println("\n you have chosen to quit the game, about time! \n                 bye!!");
                break;
            }
            else if(avslutagame.equals("N")) {
                System.out.println("\n    yeye, lets play again...");
                }
            }


        }
    }

}