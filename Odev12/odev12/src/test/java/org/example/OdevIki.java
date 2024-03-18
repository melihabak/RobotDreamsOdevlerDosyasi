package org.example;

import java.sql.*;

public class OdevIki {

    /*
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11678198";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "sql11678198", "wVJ6TIBGWB");
        System.out.println("Database connection established");
        conn.close();
        System.out.println("Database connection terminated");
    }
     */


    public static void main(String[] args) {

        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11678198";
        String kullaniciAdi = "sql11678198";
        String sifre = "wVJ6TIBGWB";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url, kullaniciAdi, sifre);

            // Kullanıcıdan alınan girişler
            String kullaniciAdiGiris = "melih";
            String sifreGiris = "123456";


            String sqlSorgusu = "SELECT * FROM test_user WHERE username = ? AND password = ?";
            preparedStatement = connection.prepareStatement(sqlSorgusu);

            // Parametreler atanıyor
            preparedStatement.setString(1, kullaniciAdiGiris);
            preparedStatement.setString(2, sifreGiris);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                // Diğer sütunların alınması
                System.out.println("ID: " + id + ", Username: " + username + ", Password: " + password);
            }



            System.out.println("Baglanti kuruldu");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

