/*error code 0: 에러없음
  error code 1: 빈칸이 존재함
  error code 2: 아이디를 찾을 수 없음
  error code 3: 비밀번호를 찾을 수 없음*/

import java.sql.*;
import java.io.*;
public class Login {
    int error = 2; // 기본 에러값으로 2 설정
    String name; // 로그인 후 페이지에서 출력될 회원 이름
    public Login(String id, String password) throws IOException{
        if(id.equals("")||password.equals("")) // 빈칸이 존재하면 에러값으로 1 설정
            error = 1;
        else
            try{
                Class.forName("com.mysql.jdbc.Driver");

                String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";
                String user = "kakao"; // 아이디 입력
                String pass = "dbsl1696!"; // 비밀번호 입력
                Connection con = DriverManager.getConnection(dburl,user,pass);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select ID from user_info where ID = '" + id + "';");

                if(rs.next()){ // 아이디가 존재하면 에러값 3으로 설정
                    error = 3;
                    rs = stm.executeQuery("select Password from user_info where Password = '" + password + "';");

                    if(rs.next()) {// 아이디가 존재하고 비밀번호가 존재하면 에러값 0으로 설정, 회원 이름 가져옴
                        rs = stm.executeQuery("select name from user_info where ID = '" + id + "';");
                        rs.next();
                        name = rs.getString(1);
                        error = 0;
                    }
                }
                rs.close();

                stm.close();
                con.close();

            }catch (ClassNotFoundException e){
                System.out.println("드라이브를 찾지 못했습니다.");
            }catch (SQLException e){
                System.out.println("커넥션 오류");
                System.out.println(e.getMessage());
                //'caching_sha2_password' 에러 발생시 참고: https://seoulbliss.tistory.com/88
            }
    }
}
