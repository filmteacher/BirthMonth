import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int month = 0; // num month = 0
        String trash = ""; // use for bad input which will read as a String

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month as an integer between 1 and 12: "); // output "Enter your birth month as an integer between 1 and 12: "

        if(in.hasNextInt()) // OK safe to read in an integer
        {
            month = in.nextInt();  // input month
            in.nextLine(); // clears the newline from the buffer

            if (month >=1 && month <=12) // if month >= 1 AND month <= 12 then
            {
                System.out.println("Your birth month is: " + month); // output "Your birth month is “ + month
            }
            else // else
            {
                System.out.println("You entered an incorrect month value: " + month); // output "You entered an incorrect month value: “ + month
            } // end if
        }
        else // Not an int can't use nextInt() read as String with nextLine() instead
        {
            trash = in.nextLine(); // Ok have to read the input as a String
            System.out.println("You said your birth month was: " + trash);
            System.out.println("Run the program again and enter a valid birth month from 1-12.");
        }
    }
}