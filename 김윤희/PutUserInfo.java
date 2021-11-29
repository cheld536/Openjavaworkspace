/*error code 0: 에러없음
  error code 1: 빈칸이 존재함
  error code 2: 중복된 아이디 입력*/

import java.sql.*;
import java.io.*;

public class PutUserInfo {
    int error = 0;
    public PutUserInfo(String name, String email, String id, String password, String hint, String allergy_code) throws IOException{
        if(name.equals("")||email.equals("")||id.equals("")||password.equals("")||hint.equals(""))
            error = 1;
        else
            try{
                Class.forName("org.gjt.mm.mysql.Driver");

                String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";
                String user = "newuser"; // 아이디 입력
                String pass = "dkffjwl12?"; // 비밀번호 입력
                Connection con = DriverManager.getConnection(dburl,user,pass);
                Statement stm = con.createStatement();

                String update = "insert into user_info values('" + name + "','"  + id + "','" + password + "','" + hint + "','" + allergy_code + "','" + email + "');";
                System.out.println(update);
                stm.executeUpdate(update);
                stm.close();
                con.close();

            }catch (ClassNotFoundException e){
                System.out.println("드라이브를 찾지 못했습니다.");
            }catch (SQLException e){
                System.out.println("커넥션 오류");
                System.out.println("이미 존재하는 아이디입니다.");
                System.out.println(e.getMessage());
                error = 2;
                //'caching_sha2_password' 에러 발생시 참고: https://seoulbliss.tistory.com/88
            }
    }
}
