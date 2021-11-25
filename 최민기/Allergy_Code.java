import java.sql.*;

public class Allergy_Code {
    public static void main(String[] args) {
        try{
            Class.forName("org.gjt.mm.mysql.Driver");

            String dburl = "jdbc:mysql://localhost:3306/데이터베이스이름?serverTimezone=Asia/Seoul&useSSL=false"; // 데이터베이스 이름 입력
            String user = "아이디"; // 아이디 입력
            String pass = "비밀번호"; // 비밀번호 입력
            Connection con = DriverManager.getConnection(dburl,user,pass);
            Statement stm = con.createStatement();

            int num = 1;
            for(int i=0;i<6310;i++) { //rs.next()를 통해 다음행을 내려갈 수 있으면 true를 반환하고, 커서를 한칸 내린다. 다음행이 없으면 false를 반환한다.
                ResultSet rs = stm.executeQuery("select * from food_info");
                for(int k=0;k<i+1;k++)
                    rs.next();
                String al = rs.getString(4);
                String al_code = "";
                if(al.contains("메밀")){
                    al_code += "01, ";
                }
                if(al.contains("밀")){
                    al_code += "02, ";
                }
                if(al.contains("대두")){
                    al_code += "03, ";
                }
                if(al.contains("호두")){
                    al_code += "04, ";
                }
                if(al.contains("땅콩")){
                    al_code += "05, ";
                }
                if(al.contains("복숭아")){
                    al_code += "06, ";
                }
                if(al.contains("고등어")){
                    al_code += "07, ";
                }
                if(al.contains("토마토")){
                    al_code += "08, ";
                }
                if(al.contains("돼지고기")){
                    al_code += "09, ";
                }
                if(al.contains("소고기")){
                    al_code += "10, ";
                }
                if(al.contains("쇠고기")){
                    al_code += "10, ";
                }
                if(al.contains("닭고기")){
                    al_code += "11, ";
                }
                if(al.contains("난류")){
                    al_code += "12, ";
                }
                if(al.contains("조개")){
                    al_code += "13, ";
                }
                if(al.contains("우유")){
                    al_code += "14, ";
                }
                if(al.contains("새우")){
                    al_code += "15, ";
                }
                if(al.contains("게")){
                    al_code += "16, ";
                }
                if(al.contains("오징어")){
                    al_code += "17, ";
                }
                if(al.contains("아황산")){
                    al_code += "18, ";
                }
                System.out.println(rs.getInt(1) + "\t" + al_code);
                //System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getInt(5));
                String update = "UPDATE food_info SET Allergy_code='"+ al_code +"' WHERE ID="+ num +";"; // 테이블 명과 컬럼 명은 각자 맞게 수정
                System.out.println(update);
                stm.executeUpdate(update);
                num++;
                rs.close();
            }
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
