/**
 * @author Trevor Hartman
 * @author Bryan Maus
 * Date 02/01/2023
 *
 * @since version 1.0
 *
 * Description: This program converts Fahrenheit to Celsius while showing the steps
 */

import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int tempF = scanner.nextInt();              // accept input from user
        final int frzPointF = 32;                   // Defines freezing point in Fahrenheit
        final float fCRatio= 5f/9f;                 // This is the ratio between Fahrenheit and Celsius
        float tempC = (tempF-frzPointF)*fCRatio;    // Calculation for Celsius


        // Outputs result to screen                    \u00B0 is the code for the degree sign
        System.out.printf("You have entered: %s°F\nThe calculations have returned %f°C\n", tempF, tempC);
        System.out.printf("The results of the calculations are %.0f°C\n", tempC);
        System.out.printf("If it were 2°C warmer it would be %f°C and the adjusted temperature would be %.0f°C\n", tempC+2, tempC+2);
        // End of results to screen




    }
}
