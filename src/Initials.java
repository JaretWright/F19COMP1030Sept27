import java.util.Scanner;

public class Initials {
    public static void main(String[] args)
    {
        //ask user for the first name and store it in a String
        System.out.printf("Enter your first name: ");
        Scanner keyboard = new Scanner(System.in);
        String firstName = keyboard.nextLine();

        System.out.printf("Enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.printf("Your initials are: %s %n",
                getInitials(firstName, lastName));
    }

    /**
     * This method will recieve a first and last name as arguments
     * and return a String with the initials
     */
    public static String getInitials(String first, String last)
    {
        first = first.trim();
        last = last.trim();
        return first.charAt(0) + "." + last.charAt(0) + ".";
    }
}

