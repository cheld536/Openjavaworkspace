/*error code 0: 찾고자 하는 정보가 존재
  error code 1: 빈칸이 존재함 - > 경고 출력
  error code 2: 찾고자 하는 회원 정보가 존재하지 않음 -> 개인정보 보호를 위해 이름, id, 힌트, 이메일주소가 다 맞아 비밀번호 출력
*/

import java.sql.*;
import java.io.*;
public class Findpw {
    int error = 2;              // 기본 에러값으로 2 설정
    String uesrpw ;                 // 비밀번호를 담을 string
    public Findpw(String name, String id, String Hint, String Email  ) throws IOException{
        if(id.equals("")||name.equals("")||Hint.equals("")||Email.equals("")) // 빈칸이 존재하면 에러값으로 1 설정
            error = 1;
        else
            try{
                Class.forName("com.mysql.jdbc.Driver");

                String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";
                String user = "kakao"; // 아이디 입력
                String pass = "dbsl1696!"; // 비밀번호 입력
                Connection con = DriverManager.getConnection(dburl,user,pass);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select name from user_info where name = '" + name + "';");

                if(rs.next()){      // 이름이 존재
                    rs = stm.executeQuery("select ID from user_info where ID = '" + id + "';");

                    if(rs.next()) {// 이름이 존재하고 아이디가 존재하면
                        rs = stm.executeQuery("select Hint from user_info where Hint = '" + Hint + "';");
                        if(rs.next()){  // 이름, 아이디, 힌트가 존재하면
                            rs = stm.executeQuery("select * from user_info where Email = '" + Email + "';");
                            if(rs.next()){ // 이름, 아이디, 힌트, 이메일이 존재하면
                                uesrpw = rs.getString("Password");
                                error = 0;
                            }
                        }
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
