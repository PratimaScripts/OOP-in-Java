# File Handling

1. Write a program that reads a series of numbers from a text file, calculates and displays the sum of all the numbers. 
Assume the file contains one number of type double in each line. Hint you need to create the file before you run the code.
2. Write a program that inputs words from the user and saves the entered words, one word per line, in a text file. 
The program terminates when the user enters the word STOP (case-insensitive).
3. The file SalesData.txt in the same folder as this lab contains the amount of sales that a retail store made each day for a number of weeks. Each line in the file contains seven numbers, which are the sales numbers for one week. The numbers are separated by a comma. Write a program that opens the file and processes its contents. The program should display the following:
   - The total sales for each week
   - The average daily sales for each week
   - The total sales for all of the weeks
   - The average weekly sales
   - The week number that had the highest amount of sales
   - The week number that had the lowest amount of sales
4. Write a class named TestScores that is serializable. The class constructor should accept an array of test scores as 
its argument. The class should have a method that returns the average of the test scores. If any tests score in the array 
is negative or greater than 100, the class should throw an IllegalArgumentException. 
Write a program that creates an array of at least five TestScore objects and serializes them. 
Write another program that deserializes the objects from the file.