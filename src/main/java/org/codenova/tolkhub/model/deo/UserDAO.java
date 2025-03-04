package org.codenova.tolkhub.model.deo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {

    // 1. 데이터 등록
    // insert into users values(?, ?, ?, ?, ?, now())
    public boolean create(String id, String password, String nickname, String gender, int birth){
        boolean result = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://database-1.cdu6gmecszv2.ap-northeast-2.rds.amazonaws.com:3306/talnhub",
                    "admin",
                    "1q2w3e4r");

            PreparedStatement ps = conn.prepareStatement("insert into users values(?, ?, ?, ?, ?, now())");
            ps.setString(1, id);
            ps.setString(2, password);
            ps.setString(3, nickname);
            ps.setString(4, gender);
            ps.setInt(5, birth);

            int r = ps.executeUpdate();
            result = true;

            conn.close();
        } catch (Exception e) {
            System.out.println("userDAO.create : " + e.toString());
        }
        return result;
    }
}
