package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginModel {
    private Connection conn;

    public LoginModel(){
        conn = SqliteConnection.getConnection();
        System.out.println("here");
        if(conn == null ) System.exit(1);
        System.out.println("after");
    }

    public boolean isDbConnected(){
        try{
            return !conn.isClosed();
        }catch (SQLException e){
            return false;
        }
    }

    public boolean authorized(String userName, String Password) throws  SQLException{
        PreparedStatement pr= null;
        ResultSet st = null;
        String query = "SELECT * from ADMIN WHERE username = ? AND password = ?";
        try{
            pr = this.conn.prepareStatement(query);
            pr.setString(1,userName);
            pr.setString(2,Password);

            st = pr.executeQuery();

            if(st.next()){
                System.out.println("Logged IN :) ");
                return true;
            }else {
                System.out.println("!! Not Logged IN :( ");
                return false;
            }
        }  catch (Exception e){
            return false;
        }finally {
            pr.close();
            st.close();
        }
    }


}
