package unit_08;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.text.DecimalFormat;
/**
 SalesAnalysis program
 */
public class SalesAnalysis
{
    public static void main(String[] args) throws IOException
    {
        String input; // To hold a line from the file
        double total = 0.0; // Accumulator for all weeks
        double average; // Average weekly sales
        double weekSales; // Total sales for a week
        double highestSales = 0.0; // Highest sales
        double lowestSales = 0.0; // Lowest sales
        int highest = 0; // Week # with highest sales
        int lowest = 0; // Week # with lowest sales
        int weekNum = 0; // The week number;

        // Create a DecimalFormat object to format dollar amounts.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // Open the SalesData.txt file.
        File file = new File("SalesData.txt");
        Scanner inputFile = new Scanner(file);

        // Process the file contents.
        while (inputFile.hasNext())
        {
            // Read a line from the file.
            input = inputFile.nextLine();
            // Increment the week counter.
            weekNum++;
            // Get the total sales for this week.
            weekSales = getWeeklySales(input);
            // Display the total and average for the week.
            System.out.print("Week #" + weekNum + " sales: $" + dollar.format(weekSales));
            System.out.println("\tAverage daily sales for week #" + weekNum + ": $" +
                    dollar.format(weekSales / 7.0));
            // Accumulate the weekly sales.
            total += weekSales;
            // Find the highest and lowest so far.
            if (weekNum == 1)
            {
                highest = 1;
                highestSales = weekSales;
                lowest = 1;
                lowestSales = weekSales;
            }
            else
            {
                if (weekSales > highestSales)
                    highest = weekNum;
                if (weekSales < lowestSales)
                    lowest = weekNum;
            }
        }
        // Close the file.
        inputFile.close();

        // Calculate the avereage weekly sales.
        average = total / weekNum;

        // Display the remaining results.
        System.out.println("Total sales for all weeks: $" + dollar.format(total));
        System.out.println("Average weekly sales: $" + dollar.format(average));
        System.out.println("The highest sales were made during " + " week #" + highest + ".");
        System.out.println("The lowest sales were made during " + " week #" + lowest + ".");
    }
    /**
     The getWeeklySales method accepts a string containing a
     list of sales for the week, with each day's sales
     separated by commas. It tokenizes the string, totals
     the numbers, and returns the total sales for the week.
     @param str The string containing the list of sales.
     @return The total of the sales.
     */
    public static double getWeeklySales(String str)
    {
        double weekTotal = 0.0;
        // Create the tokenizer.
        StringTokenizer strtok = new StringTokenizer(str, ",");
        // Accumulate the value of the tokens.
        while (strtok.hasMoreTokens())
        {
            weekTotal += Double.parseDouble(strtok.nextToken());
        }
        return weekTotal;
    }
}
