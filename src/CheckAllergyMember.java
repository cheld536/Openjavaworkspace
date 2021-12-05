/*flag 0 : 해당 알러지 코드를 가지고 있지 않음
  flag 1 : 해당 알러지 코드를 가지고 있음*/

import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CheckAllergyMember {
    int flag = 0; // 해당 알러지코드를 가지고 있지 않다고 디폴트값 설정
    public String ingredient = "";
    public ArrayList<String> all_allergy = new ArrayList<>();
    public ArrayList<String> same_allergy = new ArrayList<>();
    public CheckAllergyMember(String foodname, String username) throws IOException {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");

            String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";
            String user = "newuser"; // 아이디 입력
            String pass = "dkffjwl12?"; // 비밀번호 입력
            Connection con = DriverManager.getConnection(dburl, user, pass);
            Statement stm1 = con.createStatement();
            Statement stm2 = con.createStatement();
            ResultSet rs1 = stm1.executeQuery("select Allergy_code from food_info where Food_name = '" + foodname + "';");
            ResultSet rs2 = stm2.executeQuery("select Allergy_code from user_info where name = '" + username + "';");

            rs1.next();
            rs2.next();
            String Allergy_code = rs2.getString(1); // 사용자 정보 안에 있는 알러지 코드 값 가져오기

            StringTokenizer st = new StringTokenizer(rs1.getString(1),", "); // ,와 " "로 해당 음식이 가지고 있는 알러지 코드 분리
            while(st.hasMoreTokens()){
                String food_allergy = st.nextToken(); // 해당 식품이 가진 하나의 알러지 코드

                // 알러지 코드가 아닌 알러지를 저장하기 위해 전환
                rs1 = stm1.executeQuery("select Allergy from allergy where Allergy_code = '" + food_allergy + "';");
                rs1.next();

                if(Allergy_code.contains(food_allergy)){ // 사용자가 해당 알러지 코드를 가지고 있다면
                    flag = 1; // flag값 변경
                    same_allergy.add(rs1.getString(1)); // 해당 식품과 사용자가 똑같이 갖는 알러지 저장
                }
                all_allergy.add(rs1.getString(1)); // 해당 식품이 가진 모든 알러지 저장
            }

            // 해당 식품 재료 가져오기
            rs1 = stm1.executeQuery("select Food_ingredient from food_info where Food_name = '" + foodname + "';");
            rs1.next();
            ingredient = rs1.getString(1);

            rs1.close();
            rs2.close();
            stm1.close();
            stm2.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("드라이브를 찾지 못했습니다.");
        } catch (SQLException e) {
            System.out.println("커넥션 오류");
            System.out.println(e.getMessage());
            //'caching_sha2_password' 에러 발생시 참고: https://seoulbliss.tistory.com/88
        }
    }
}
