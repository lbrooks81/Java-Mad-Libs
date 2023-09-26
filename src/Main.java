/*
 * Name: Logan Brooks
 * South Hills Username: lbrooks81
 */
//Remember to put your name and SH username above

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 4;
        int intRandom = rand.nextInt(upperbound);
        if(intRandom < 2)
        {
            //Word 1
            System.out.print("Please enter a noun: ");
            String noun1 = input.next();
            System.out.println("You entered " + noun1 + ". Please type 'yes' if this is correct: ");
            String confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your noun: ");
                noun1 = input.next();
                System.out.println("You entered " + noun1 + ". Please type 'yes' if this is correct: ");
            }
            //Word 2
            System.out.print("Please enter a verb: ");
            String verb1 = input.next();
            System.out.println("You entered " + verb1 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your verb: ");
                verb1 = input.next();
                System.out.println("You entered " + verb1 + ". Please type 'yes' if this is correct: ");
            }
            //Word 3
            System.out.print("Please enter a verb: ");
            String verb2 = input.next();
            System.out.println("You entered " + verb2 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your verb: ");
                verb2 = input.next();
                System.out.println("You entered " + verb2 + ". Please type 'yes' if this is correct: ");
            }
            //Word 4
            System.out.print("Please enter a noun: ");
            String noun2 = input.next();
            System.out.println("You entered " + noun2 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your noun: ");
                noun2 = input.next();
                System.out.println("You entered " + noun2 + ". Please type 'yes' if this is correct: ");
            }
            //Word 5
            System.out.print("Please enter a verb: ");
            String verb3 = input.next();
            System.out.println("You entered " + verb3 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your verb: ");
                verb3 = input.next();
                System.out.println("You entered " + verb3 + ". Please type 'yes' if this is correct: ");
            }
            input.close();
            System.out.println("Jack and Jill went up the " + noun1);
            System.out.println("To " + verb1 + " a pail of water");
            System.out.println("Jack " + verb2 + " down and broke his " + noun2);
            System.out.println("And Jill " + verb3 + " tumbling after");
        }




        else
        {
            //Word 1
            System.out.print("Please enter a noun: ");
            String noun1 = input.next();
            System.out.println("You entered " + noun1 + ". Please type 'yes' if this is correct: ");
            String confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your noun: ");
                noun1 = input.next();
                System.out.println("You entered " + noun1 + ". Please type 'yes' if this is correct: ");
            }
            //Word 2
            System.out.print("Please enter another noun: ");
            String noun2 = input.next();
            System.out.println("You entered " + noun2 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your noun: ");
                noun2 = input.next();
                System.out.println("You entered " + noun2 + ". Please type 'yes' if this is correct: ");
            }
            //Word 3
            System.out.print("Please enter an adjective: ");
            String adjective1 = input.next();
            System.out.println("You entered " + adjective1 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your adjective: ");
                adjective1 = input.next();
                System.out.println("You entered " + adjective1 + ". Please type 'yes' if this is correct: ");
            }
            //Word 4
            System.out.print("Please enter a past-tense verb: ");
            String verb1 = input.next();
            System.out.println("You entered " + verb1 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your noun: ");
                verb1 = input.next();
                System.out.println("You entered " + verb1 + ". Please type 'yes' if this is correct: ");
            }
            //Word 5
            System.out.print("Please enter a verb: ");
            String verb2 = input.next();
            System.out.println("You entered " + verb2 + ". Please type 'yes' if this is correct: ");
            confirmation = input.next();
            if(!confirmation.equalsIgnoreCase("yes"))
            {
                System.out.print("Please re-enter your verb: ");
                verb2 = input.next();
                System.out.println("You entered " + verb2 + ". Please type 'yes' if this is correct: ");
            }
            input.close();
            System.out.println("Mary had a little " + noun1);
            System.out.println("Whose " + noun2 + " was " + adjective1 + " as snow");
            System.out.println("And everywhere that Mary " + verb1);
            System.out.println("The " + noun1 + " was sure to " + verb2);
        }
    }
}
