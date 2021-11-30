import java.sql.*;
import java.util.*;

// 입력한 단어가 포함된 상품명을 데이터 베이스에서 찾는 기능.
public class SearchFood{
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul&useSSL=false";
        String sql = "SELECT ID, Food_name " + "FROM food_info WHERE Food_name LIKE "; //food_info테이블에서 Food_name을 이용하여 ID, Food_name 얻고자함.

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "hanji", "dhodlfo!"); // url, 아이디 입력, 비밀번호 입력

            System.out.print("검색할 상품 : ");
            String goodsName = scan.nextLine(); //검색할 단어 입력
            pstmt = conn.prepareStatement(sql + "'%" + goodsName + "%'");
            rs = pstmt.executeQuery();

            while (rs.next()) { // 단어가 포함되어 있는 상품명 모두 출력
                int ID = rs.getInt("ID");
                String Food_name = rs.getString("Food_name");

                System.out.printf("%s %s ", ID, Food_name );
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

