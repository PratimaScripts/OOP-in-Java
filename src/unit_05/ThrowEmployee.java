package unit_05;


class EmployeeException extends Exception {
    public EmployeeException(String s)
    {
        super(s);
    }
}

class Employee
{
    int idNum;
    double hourlyWage;
    final double MIN = 6.00;
    final double MAX = 50.00;

    public Employee(int id, double wage) throws EmployeeException
    {
        idNum = id;
        hourlyWage = wage;
        if((hourlyWage < MIN) || (hourlyWage > MAX))
            throw (new EmployeeException(idNum + " " + hourlyWage));
    }
}

public class ThrowEmployee
{
    public static void main(String[] args)
    {
        int num;
        double sal;
        try
        {
            num = 101;
            sal = 88.99;
            Employee first = new Employee(num, sal);
            System.out.println("Employee #" + num + " is ok");
        }
        catch(EmployeeException error)
        {
            System.out.println("Employee Error: " + error.getMessage());
        }
        try
        {
            num = 102;
            sal = 5.99;
            Employee second = new Employee(num, sal);
            System.out.println("Employee #" + num + " is ok");
        }
        catch(EmployeeException error)
        {
            System.out.println("Employee Error: " + error.getMessage());
        }

        try
        {
            num = 103;
            sal = 12.99;
            Employee third = new Employee(num, sal);
            System.out.println("Employee #" + num + " is ok");
        }
        catch(EmployeeException error)
        {
            System.out.println("Employee Error: " + error.getMessage());
        }
    }
}
