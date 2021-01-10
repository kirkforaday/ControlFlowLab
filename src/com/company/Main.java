package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    //Set Up Scanner
        Scanner input = new Scanner(System.in);
    //Verify Environment
        System.out.println("Hello World");

    //Print Valid Characters For User
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

    //Ask User Their Name And Receive Answer
        System.out.println("Please Enter Your Name: ");
        String name = input.next();

    //Respond To The User
         System.out.println("Hello " + name);

    //Ask User If They Want To Continue With Interactive Portion
        System.out.println("Would You Like To Continue With The Interactive Portion?");
        System.out.println("Enter Yes(y) or No(n): ");
        String confirmation = input.next();

    //Verify User Selection And Proceed Accordingly
        if(confirmation.equals("Yes") || confirmation.equals("yes") || confirmation.equals ("Y") || confirmation.equals("y")) {
            String playAgain;
            do {
                //Ask For Name Of Favorite Pet
                System.out.println("What is the name of your favorite pet?");
                String petName = input.next();
                //Ask For Age of Favorite Pet
                System.out.println("How old is your favorite pet?");
                int petAge = input.nextInt();
                //Ask For Lucky Number
                System.out.println("What is your lucky number?");
                int luckyNumber = input.nextInt();
                //Ask If They Have A Favorite Quarterback
                System.out.println("Do you have a favorite quarterback?");
                String quarterbackDecision = input.next();
                int jerseyNumber = 0;
                if (quarterbackDecision.equals("Yes") || quarterbackDecision.equals("yes") || quarterbackDecision.equals("Y") || quarterbackDecision.equals("y")) {
                    System.out.print("What is their jersey number?");
                    jerseyNumber = input.nextInt();
                }
                //Ask For Two-Digit Model Year Of Car
                System.out.println("What is the two-digit model year of your car? (For example, if your car was made in 2009, input '09')");
                int carYear = input.nextInt();
                //Ask For The First Name Of Favorite Actor Or Actress
                System.out.println("What is the first name of your favorite actor or actress?");
                String actorName = input.next();
                //Ask For A Number Between 1 And 50
                System.out.println("Please Input A Number Between 1 And 50.");
                int selectedNumber = input.nextInt();
                if (selectedNumber < 1 || selectedNumber > 50) {
                    System.out.print("Your Number Was Not Between 1 And 50. Please Input A Number Between 1 And 50.");
                }
                Random rand = new Random();
                int magicballNumber;
                int rand1 = rand.nextInt(50);
                int rand2 = rand.nextInt(50);
                int rand3 = rand.nextInt(50);
                if((rand.nextInt(2) == 1) && (jerseyNumber != 0) ) {
                    magicballNumber = jerseyNumber * rand1;
                }
                else{
                    magicballNumber = luckyNumber * rand1;
                }
                if(magicballNumber > 75){
                    magicballNumber = magicballNumber - 75;
                }
                int number1 , number2, number3, number4, number5;
                number1 =  carYear + luckyNumber;
                if(number1>65)
                    number1 = number1 - 65;
                if(number1<1)
                    number1 = number1 + 65;
                number2 =  rand2 - rand.nextInt(50);
                if(number2>65)
                    number2 = number2 - 65;
                if(number2<1)
                    number2 = number2 + 65;
                number3 =  42;
                number4 =  petAge + carYear;
                if(number4>65)
                    number4 = number4 - 65;
                if(number4<1)
                    number4 = number4 + 65;
                number5 =  (int)actorName.charAt(0);
                if(number5>65)
                    number5 = number5 - 65;
                if(number5<1)
                    number5 = number5 + 65;
                System.out.print("\nLottery numbers : ");
                System.out.print(number1+", ");
                System.out.print(number2+", ");
                System.out.print(number3+", ");
                System.out.print(number4+", ");
                System.out.print(number5+", ");
                System.out.print(" Magic ball: "+magicballNumber);
                System.out.println("Would You Like To Generate New Numbers?");
                playAgain = input.next();

            } while (playAgain.equals("Yes") || playAgain.equals("yes") || playAgain.equals("Y") || playAgain.equals("y"));
        }
        else{
                System.out.println("Please Return Later To Complete The Survey.");
            }
        System.out.println();
        }
    }

