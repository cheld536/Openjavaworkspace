import java.sql.*;
import java.io.*;

public class PutUserInfo {
    int error = 0;
    public PutUserInfo(String name, String email, String id, String password, String hint, String allergy_code) throws IOException{
        try{
            Class.forName("com.mysql.jdbc.Driver");

            String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false"; // 데이터베이스 이름 입력
            String user = "kakao"; // 아이디 입력
            String pass = "dbsl1696!"; // 비밀번호 입력
            Connection con = DriverManager.getConnection(dburl,user,pass);
            Statement stm = con.createStatement();

            String update = "insert into user_info values('" + name + "','"  + id + "','" + password + "','" + hint + "','" + allergy_code + "','" + email + "');"; // 각자 맞게 수정
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
            error = 1;
            //'caching_sha2_password' 에러 발생시 참고: https://seoulbliss.tistory.com/88
        }
    }
}
