
import java.sql.*;

public class OdevBir {

    public static void main(String[] args) throws SQLException {

        //String sql = "select ad from ogrencitablosu where id=1";
        String query = "select * from ogrencitablosu where id = ? and ad = ?";
        String url = "jdbc:postgresql://localhost:5432/Ogrenci";
        String username = "postgres";
        String password = "password";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url,username,password);

        /*
        //statement ile sorgu
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        */

            //preparedstatement ile sorgu
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 1);
            ps.setString(2,"melih");

            ResultSet rs = ps.executeQuery();
            System.out.println("id      ad");

            while (rs.next()) {
                String ad = rs.getString("ad");
                int id = rs.getInt("id");
                System.out.println(ad + "     " + id);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        con.close();


    }

}
