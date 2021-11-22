import com.mysql.cj.jdbc.Driver;
import dao.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    //private instance variable, connection to the program and the client
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            //register a driver with an instance of a driver class
            DriverManager.registerDriver(new Driver());

            //establish a connection that allows you to pull out values of the connection, all values match the values in the table
            this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    @Override
    public List<Ad> all() {
        //returns a list of ads, create an array list
        List<Ad> ads = new ArrayList<>();

        // (Select) execute the query with statement
        String query = "SELECT * FROM ads";

        try {
            //create a statement using the 'connection' to create the 'statement'
            Statement statement = connection.createStatement();
            //execute a query that will return a result set
            ResultSet resultSet = statement.executeQuery(query);

            //for every record you can pull out the value and store it in an ad instance , in the instance you pass in the values  from the result set
            while (resultSet.next()) {
                Ad ad = new Ad(
                    resultSet.getLong("id"),
                    resultSet.getLong("user_id"),
                    resultSet.getString("title"),
                    resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ads;
    }

    @Override
    public long insert(Ad ad) {
        Long lastInsertedId = 0L;
        try{
            Statement statement = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return lastInsertedId;

    }

    public static void main(String[] args) {
        MySQLAdsDao mySQLAdsDao = new MySQLAdsDao(new Config());

        Ad adToInsert = new Ad(
                1,
                "Test Insert Ad",
                "Test Insert Ad Description"
        );

        System.out.println(mySQLAdsDao.insert(adToInsert));
    }



}

