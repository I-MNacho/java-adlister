import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    //private instance variable
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());

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
        List<Ad> ads = new ArrayList<>();
        try {
            //create statement
            Statement statement = connection.createStatement();

            // (Select) execute the query with statement
            String query = "SELECT * FROM ads";
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()) {
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }
            return ads;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public long insert(Ad ad) {
        
        String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );
        
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;
    }
}

