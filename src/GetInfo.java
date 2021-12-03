import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;
import java.sql.*;
public class GetInfo {

    public String Allergy_code = "";
    public String Food_ingredient = "";
    public String Image_url = "";
    Image image = null;
    Image resizeImage; //사이즈 조정된 이미지

    public GetInfo(String foodname) {

        String driver = "com.mysql.cj.jdbc.Driver"; // 각자 환경에 맞는 드라이버 주소로 설정하세요
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul&useSSL=false";  // 디비에 저장된 스케마 이름으로 변경해주세요
        String sql = "SELECT Allergy_code, Food_ingredient, Image_url " + "FROM food_info WHERE Food_name = ";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "hanji", "dhodlfo!"); // url, 아이디 입력, 비밀번호 입력

            pstmt = conn.prepareStatement(sql + "'" + foodname + "'");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Allergy_code = rs.getString("Allergy_code");
                Food_ingredient = rs.getString("Food_ingredient");
                Image_url = rs.getString("Image_url");
                Image_url = Image_url.substring(0, 4) + "s" + Image_url.substring(4, Image_url.length());
                // 데이터 베이스에 http://로 저장되있는 이미지 url을 호출을 위해 https://로 만듦.
                URL imageurl = new URL(Image_url);
                image = ImageIO.read(imageurl);
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

        int newHeight = 166; // 변경 할 높이
        int imageWidth;
        int imageHeight;
        double ratio;
        int w;
        int h;

        try {
            // 원본 이미지 사이즈 가져오기
            imageWidth = image.getWidth(null);
            imageHeight = image.getHeight(null);

            ratio = (double) newHeight / (double) imageHeight;
            w = (int) (imageWidth * ratio);
            h = (int) (imageHeight * ratio);

            // Image.SCALE_DEFAULT : 기본 이미지 스케일링 알고리즘 사용
            // Image.SCALE_FAST    : 이미지 부드러움보다 속도 우선
            // Image.SCALE_SMOOTH  : 속도보다 이미지 부드러움을 우선
            resizeImage = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}