/*error code 0: 에러없음
  error code 1: 빈칸이 존재함
  error code 2: 아이디가 중복됨*/

import java.sql.*;
import java.io.*;
public class CheckID {
    int error = 0; // 기본 에러값으로 0 설정
    public CheckID(String id) throws IOException{
        if(id.equals("")) // 빈칸이 존재하면 에러값으로 1 설정
            error = 1;
        else
            try{
                Class.forName("org.gjt.mm.mysql.Driver");

                String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";
                String user = "newuser"; // 아이디 입력
                String pass = "dkffjwl12?"; // 비밀번호 입력
                Connection con = DriverManager.getConnection(dburl,user,pass);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select ID from user_info where ID = '" + id + "';");

                if(rs.next()){ // 아이디가 존재하면 에러값 2로 변경
                    error = 2;
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
