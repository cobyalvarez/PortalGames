/* Coby Alvarez
* Course Number: CS2011
* Section Number: 07
* Description: In my code bellow I created a little horror game utilizing things
* I learned throughout the year I used a lot of if statements as it was best
* fit for this type of gaim and also used probability and odds to make the
* result random and special each try. It follows the goal to try to reach the
* car to not die.
*/



import java.util.Scanner;
import java.util.Random;

public class AdventureGame{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the my Horror Adventure Game");
    System.out.println("___________________________________________________");
    System.out.println("Do your best to try to survive the evil spirits after"
    + " you");
    System.out.println("You must leave the house and get to the car to "
    + "survive");
    System.out.println("The ghost of the Flying Dutchman is after you what"
    + " do you do?");
    System.out.println("___________________________________________________");
    System.out.println("Option 1 is to run as fast as you can to the exit");
    System.out.println("___________________________________________________");
    System.out.println("Option 2 is to sneak through the house to the living "
    + "room");
    System.out.println("___________________________________________________");

    System.out.println("");
    //I wrote a Description above about the story of the game and give 2 options
    // to the user

    System.out.println("Enter choices: 1 or 2:");
    System.out.print(">>>");
    //I used input to ask the user to chose either 1 or 2.
    double answer = input.nextDouble();
    //Through this if statement I was able to see if they choose the 1st choice
    //or the 2nd one which give different outcomes
    if (answer==1){
      System.out.println("Odds you will escape successfully are 3 to 8 ");
      System.out.println("");
      int oddsOfSuccess = 3;
      int oddsOfFailing = 8;
      //I used probability here to give the user a 3:8 chance of successfully
      // escaping

      Random generator = new Random();
      int num = generator.nextInt(oddsOfSuccess + oddsOfFailing);

      //I then used the probability and placed it in a if statement to give the
      //code a random feel where anything can happen each turn

      if (num < oddsOfSuccess){
        System.out.println("You successfully get out and run to your car");
      }
      else{
        System.out.println("Flying Dutchman is too fast and catches you. "
        + "You die:( PLEASE TRY AGAIN");
        System.exit(0);
        //If you get the bad ending it exits and you can restart.
      }
    }
    //This is the second choice from up above
    else if (answer==2){
      System.out.println("You hear him near you as your in the kitchen near"
      + " the exit.");
      System.out.println("Enter 1 if you wish to jump out of the window");
      System.out.println("___________________________________________________");
      System.out.println("Enter 2 if you wish to hide in the freezer");
      System.out.println("___________________________________________________");
      System.out.println("");

      System.out.print(">>>");
      double choice = input.nextDouble();
      //It asked you again to choose which action you want to do

      int percentage = 50;
      //However this time I used percentage probability to give you a 50% chance
      // that the monster will find you or not or if you die from fall or not

      if (choice == 1){
        //Choice 1 is you jump the window and you have 50% chance of surviving
        System.out.println("_________________________________________________");
        System.out.println("Jump out of the window");
        if (Math.random() < percentage/100.0){
          System.out.println("Your alive and keep going towards the car");
        }
        else {
          System.out.println("You died because of the fall");
          System.out.println("PLEASE TRY AGAIN");
          System.exit(0);
        }
      }
      else if (choice == 2){
        //This choice is you hide in the freezer with 50% chance of living
        //through it
        System.out.println("");
        System.out.println("You quickly rush to the freezer");
        if (Math.random() < percentage/100.0){
          System.out.println("You died he found you");
          System.out.println("PLEASE TRY AGAIN");
          System.exit(0);
        }
        else{
          System.out.println("");
          System.out.println("He didnt notice you and left. "
          + "You keep moving and go to the exit.");
        }
      }
      else {
        System.out.println("You waited too long to move and been found. "
        +"You die");
        System.out.println("PLEASE TRY AGAIN");
        System.exit(0);
        //If you type something that is not a option you will die as you werent
        //fast enough
      }
    }
    else{
      System.out.println("That is not an option you took to long to choose and"
      + " The Flying Dutchman has you now");
      System.out.println("HAHAHAHAHAHA :(");
      System.out.println("PLEASE TRY AGAIN");
      System.exit(0);
      //Again I used this to make sure the user doesnt type a wrong answer
    }
    System.out.println("You made it out of the house and get into the Tesla");
    System.out.println("Enter the password by answering the question");
    System.out.println("When is Valentines day?");
    System.out.println("___________________________________________________");

    double password=input.nextDouble();
    //I asked the user for them to answer a simple question as the password for
    //the car and based on their answer they will either die or start the car
    //Allowing them to leave

    if (password==14){
      System.out.println("You got away yayyyy go get some In N Out Now :)");
    }
    else{
      System.out.println("No you set the car alarm on he found you and you die"
      + " :(");
      System.out.println("PLEASE TRY AGAIN");
      //I wish I could get it to work where once it ends it ask if you want
      //to play again press Y and if you do it will restart using a
      //Do-While Loop however I did not get to make this happen as I encountered
      //trouble sorry 
    }
  }
}
