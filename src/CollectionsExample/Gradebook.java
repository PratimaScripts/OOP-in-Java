package CollectionsExample;

import java.sql.Connection;
import java.sql.DriverManager;
 
public class Gradebook
{
    public static void main(String[] args) 
    {
        DB db = new DB();
    }
}
 
class DB
{
    public DB() 
    {
        dbConnect();
    }
// jar file is  msbase.jar,msuti.jar,mssqlserver.jar
    public void dbConnect()
    {
        try
        {
           Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver"); 
           String url =  "jdbc:microsoft:sqlserver://kmg-103:1433;DatabaseName=Hibernate";
           Connection conn = DriverManager.getConnection(  url, "sa", "kmg125");
           System.out.println("connected");
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
