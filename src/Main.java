import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double meter = 0;

        System.out.print("Enter the amount of meters you want to convert: ");

        if (in.hasNextDouble())
        {
            meter = in.nextDouble();
            in.nextLine();
        }
        else
        {
            System.out.println("You entered an invalid number");
            System.exit(0);
        }

        System.out.println( meter + " meters in miles is " + (meter / 1609.344));
        System.out.println(meter + " meters in inches is " + (meter * 39.3701));
        System.out.println(meter + " meters in feet is " + (meter * 3.28084));
    }
}