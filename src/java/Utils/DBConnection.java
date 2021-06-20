package Utils;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edsonpaulo
 */
public class DBConnection
{

    public static Connection openConnection() throws ClassNotFoundException
    {
        String url = "jdbc:postgresql://localhost:5432/ucandb";
        String user = "postgres";
        String password = "postgress";
        Connection connection = null;
        Class.forName( "org.postgresql.Driver" );

        try
        {
            connection = DriverManager.getConnection( url, user,
                                                      password );
            System.out.println( "DB Successfully  connected!" );
        }
        catch( SQLException e )
        {
            Logger.getLogger( DBConnection.class.getName() ).log(
                    Level.SEVERE,
                    null, e );
            System.out.println( "Error connecting to DB!" );
        }
        return connection;
    }

    public static void closeConnection( Connection connection )
    {
        try
        {
            if( connection != null )
            {
                connection.close();
                System.out.println( "Connection Closed!" );
            }
        }
        catch( SQLException e )
        {
            Logger.getLogger( DBConnection.class.getName() ).
                    log( Level.SEVERE, null, e );
            System.out.println( "Error Closing DB connection!" );
        }
    }

    public static void closeConnection( Connection connection, Statement statement )
    {
        try
        {
            if( connection != null ) connection.close();
            if( statement != null ) statement.close();
        }
        catch( SQLException e )
        {
            Logger.getLogger( DBConnection.class.getName() ).log(
                    Level.SEVERE,
                    null, e );
        }
    }

}
