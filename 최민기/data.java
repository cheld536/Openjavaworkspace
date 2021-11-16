import java.io.*;
import java.net.*;
import java.sql.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

public class data {
    private static String getTagValue(String tag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if(nValue == null)
            return "알수없음";
        return nValue.getNodeValue();
    }

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        try {
            Class.forName("org.gjt.mm.mysql.Driver");

            String dburl = "jdbc:mysql://localhost:3306/allergy?serverTimezone=Asia/Seoul&useSSL=false";
            String user = "아이디"; // 아이디 입력
            String pass = "비밀번호"; // 비밀번호 입력
            Connection con = DriverManager.getConnection(dburl,user,pass);
            Statement stm = con.createStatement();

            int num = 1;
            for(int i = 1;i<=150;i++){
                StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B553748/CertImgListService/getCertImgListService"); //URL
                urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=서비스키"); //Service Key ("서비스키" 대신에 서비스키값 입력)
                urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(Integer.toString(i), "UTF-8")); //페이지 번호
                urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); //한 페이지 결과 수
                URL url = new URL(urlBuilder.toString());

                DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
                Document doc = dBuilder.parse(urlBuilder.toString());


                // root tag
                doc.getDocumentElement().normalize();
                System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

                // 파싱할 tag
                NodeList nList = doc.getElementsByTagName("item");

                for(int temp = 0; temp < nList.getLength(); temp++){
                    Node nNode = nList.item(temp);
                    if(nNode.getNodeType() == Node.ELEMENT_NODE){
                        Element eElement = (Element) nNode;
                        if(num == 6325 || num == 7790){ // 특이 케이스라 제외
                            num++;
                            continue;
                        }
                        String Food_name,Food_ingredient,Allergy,Image_url;
                        try{
                            Food_name = getTagValue("prdlstNm", eElement);
                            Food_name = Food_name.replace("'",""); // 음식 이름에서 '제거
                            Food_ingredient = getTagValue("rawmtrl", eElement);
                            Food_ingredient = Food_ingredient.replace("'",""); // 음식 성분에서 '제거.
                            Allergy = getTagValue("allergy", eElement);
                            Allergy = Allergy.replace(" ",""); // 알러지 정보 데이터의 통일성을 위해 공백 삭제
                            Allergy = Allergy.replace("함유",""); // 알러지 정보 데이터의 통일성을 위해 '함유' 삭제
                            Allergy = Allergy.replace("해당",""); // 알러지 정보 데이터의 통일성을 위해 '해당' 삭제
                            Image_url = getTagValue("imgurl1", eElement);

                            String sql = "insert into food_info values(" + num + ",'"  + Food_name + "','" + Food_ingredient + "','" + Allergy + "','" + Image_url + "');";
                            System.out.println(sql);
                            stm.executeUpdate(sql);
                        }catch (NullPointerException e){
                            Food_name = getTagValue("prdlstNm", eElement);
                            Food_ingredient = getTagValue("rawmtrl", eElement);
                            Food_ingredient = Food_ingredient.replace("'",""); // 음식 성분에서 '를 없애야 오류가 안생김.
                            Allergy = "알수없음";
                            Image_url = getTagValue("imgurl1", eElement);

                            String sql = "insert into food_info values(" + num + ",'"  + Food_name + "','" + Food_ingredient + "','" + Allergy + "','" + Image_url + "');";
                            System.out.println(sql);
                            stm.executeUpdate(sql);
                        }
                        num++;
                    }	// if end
                }	// for end
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
