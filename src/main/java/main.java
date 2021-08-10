import aaa.IgnoreString;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    static Coin coin;
    static ArrayList<Double> results = new ArrayList<>();
    private static java.lang.String String;

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to currency convertor, please choose an option 1/2/3");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if (choice > 3) {
            System.out.println("Invalid choice, please try again");
        }
        if (choice == 1) {
            coin = new USD();
        } else if (choice == 2) {
            coin = new ILS();
        } else if (choice == 3) {
            coin = new EUR();
        }


        System.out.println("please choose an amount to convent");
        double amount = s.nextDouble();
        System.out.println(coin.calculate(amount));
        results.add(coin.calculate(amount));
        System.out.println("Do you want to start over again?");
        String answer = s.next();
        if (answer.equalsIgnoreCase("Y")) {
            main(null);
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Thanks for using our currency convertor");
        }
        FileWriter writer = new FileWriter("output.txt");
        for (double d : results) {
            writer.write(d + System.lineSeparator());

            writer.close();
        }
    }

}









// Explanations Methods://

// choice(); - return the user's choice.

// amount();- return the user's amount.

// s.nextDouble(); - return a double numbers to amount.

//results.add(coin.calculate(amount)); - added the types of currencies for calculating the conversion(to do the conversion).

//(answer.equalsIgnoreCase()); - if users enter non Case sensitive ("n")||("y") the system will ignored it.

//writer.write(d + System.lineSeparator()); - all the conversions that the user entered will be listed.

//writer.close(); - will write and close the window with a list of conversion results. and they will be saved in the list.
