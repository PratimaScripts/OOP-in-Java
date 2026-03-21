package unit_05;

class TestScores
{
    // Variable to reference an array holding test scores
    private double[] scores;
    /**
     The constructor initializes an object with an array of scores. If the array contains
     an invalid value (less than 0 or greater than 100) an exception is thrown.
     @param s The array of test scores.
     @exception IllegalArgumentException When the argument array contains an invalid
     value.
     */
    public TestScores(double[] s) throws IllegalArgumentException
    {
        // Create an array to hold the scores passed
        // as an argument.
        scores = new double[s.length];

        // Copy the scores passed as an argument into the new array.
        // Check for illegal values as they are copied.
        for (int i = 0; i < s.length; i++)
        {
            if (s[i] < 0 || s[i] > 100)
                throw new IllegalArgumentException("Element: " + i + " Score: " +
                        s[i]);
            else
                scores[i] = s[i];
        }
    }
    /**
     The getAverage method returns the average
     of the object's test scores.
     @return The average of the object's test scores.
     */
    public double getAverage()
    {
        double total = 0.0; // Accumulator
        // Accumulate the sum of the scores.

        for (int i = 0; i < scores.length; i++)
            total += scores[i];
        // return the average.
        return (total / scores.length);
    }
}

public class TestScoresDemo
{
    public static void main(String[] args)
    {
        // An array with test scores.
        // Notice that element 3 contains an invalid score.
        double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0 };

        // Another array with test scores.
        // All of these scores are good.
        double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0 };

        // Create a TestScores object initialized with badScores.
        try
        {
            TestScores tBad = new TestScores(badScores);

            // The following statement should not execute.
            System.out.println("The average of the bad scores is " + tBad.getAverage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid score found.\n" + e.getMessage());
        }

        // Create a TestScores object initialized with goodScores.
        try
        {
            TestScores tGood = new TestScores(goodScores);
            System.out.println("The average of the good scores is " +
                    tGood.getAverage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid score found.\n" + e.getMessage());
        }
    }
}
