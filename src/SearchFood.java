import java.sql.*;
import java.util.*;

// 입력한 단어가 포함된 상품명을 데이터 베이스에서 찾는 기능.
public class SearchFood {

    public ArrayList<String> array = new ArrayList<>();

    public SearchFood(String foodname) {

        String driver = "com.mysql.jdbc.Driver";                                                    // 각자 환경에 맞는 드라이버 주소로 설정하세요
        String url = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";  // 디비에 저장된 스케마 이름으로 변경해주세요
        String sql = "SELECT Food_name " + "FROM food_info WHERE Food_name LIKE ";                  //food_info테이블에서 Food_name을 이용하여 Food_name 얻고자함.

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "kakao", "dbsl1696!");             // url, 아이디 입력, 비밀번호 입력

            pstmt = conn.prepareStatement(sql + "'%" + foodname + "%'");
            rs = pstmt.executeQuery();

            while (rs.next()) { // 단어가 포함되어 있는 상품명 모두 출력
                array.add(rs.getString("Food_name"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

