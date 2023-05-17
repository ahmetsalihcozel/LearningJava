package JDBC_Intro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws SQLException {

        }

        public static void deleteData() throws SQLException{
            java.sql.Connection connection = null;
            DbHelper helper = new DbHelper();
            java.sql.PreparedStatement statement = null;
    
            try {
                connection = helper.getConnection();
                String sql = "delete from world.city where id = ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, 4081);
                int result = statement.executeUpdate();
    
                    System.out.println("Kayit silindi.");
    
    
    
            } catch (SQLException expection) {
                helper.showErrorMessage(expection);
            } finally {
                statement.close();
                connection.close();
            }
        }

        public static void updateData() throws SQLException {
            java.sql.Connection connection = null;
            DbHelper helper = new DbHelper();
            java.sql.PreparedStatement statement = null;
    
            try {
                connection = helper.getConnection();
                String sql = "update world.city set population = 100000, district = 'Turkiye' where id = ?";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, 4082);
                int result = statement.executeUpdate();
    
                    System.out.println("Kayit güncellendi.");
    
    
    
            } catch (SQLException expection) {
                helper.showErrorMessage(expection);
            } finally {
                statement.close();
                connection.close();
            }
        }

        public static void selectData() throws SQLException {
            java.sql.Connection connection = null;
            DbHelper helper = new DbHelper();
            java.sql.Statement statement = null;
            ResultSet resultSet;
    
                try {
                    connection = helper.getConnection();
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery("select Code, Name, Continent, Region from world.country");
                    ArrayList<Country> countries = new ArrayList<Country>();
    
                    while(resultSet.next()) {
                        System.out.println(resultSet.getString("Name"));
                        countries.add(new Country(
                            resultSet.getString("Code"),
                            resultSet.getString("Name"),
                            resultSet.getString("Continent"),
                            resultSet.getString("Region")
                            ));
                    }
                    System.out.println(countries.size());
    
                } catch (SQLException expection) {
                    helper.showErrorMessage(expection);
                }
        }

        public static void insertData() throws SQLException {

            java.sql.Connection connection = null;
        DbHelper helper = new DbHelper();
        java.sql.PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "insert into world.city (Name, CountryCode, District, Population) values (?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Duzce2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 70000);

            int result = statement.executeUpdate();

                System.out.println("Kayit eklendi.");



        } catch (SQLException expection) {
            helper.showErrorMessage(expection);
        } finally {
            statement.close();
            connection.close();
        }
            
        }
    
}
