import java.util.Scanner;

public class NameModification {
    public static void main(String[] args)
    {
        //ask user for the first name and store it in a String
        System.out.printf("Enter your first name: ");
        Scanner keyboard = new Scanner(System.in);
        String firstName = keyboard.nextLine();

        System.out.printf("Enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.printf("Your full name is '%s'%n",
                            consolidateName(firstName,lastName));
    }

    public static String consolidateName(String first, String last)
    {
        return last + ", " + first;
    }
}
