import database.DatabaseUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

    public static void main(String[] args) {
        testaConexaoBanco();
    }

    public static void testaConexaoBanco() {
        try {
            DatabaseUtils.loadDriver();
            Connection c = DatabaseUtils.getConnection();

            String sql = "select * from person";
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println(id + ", " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
