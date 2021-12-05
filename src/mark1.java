import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URI;
import java.net.URISyntaxException;

public class mark1 {

    private JFrame frame;
    private JTextField textField;
    private JTextField loginID;
    private JTextField loginpassward;
    private JTextField id;
    private JTextField paswward;
    private JTextField hint;
    private JTextField email;
    private JTextField name;
    private JTextField textField_name;
    private JTextField textField_Email;
    private JTextField textField_ID;
    private JTextField textField_Hinit;
    private JTextField textField_1;
    public String searchfoodname ="";
    public String searchfoodname_1 ="";
    public String foodname="";
    public String foodname_1="";
    public int checkenter =0;
    public int checkenter_1 =0;
    public String username = "사용자";
    public String result = "";

    /*바탕화면*/
    ImageIcon startig = new ImageIcon("image/food.jpg");
    Image startimg = startig.getImage();

    /*나머지 이미지
    ImageIcon useicon =null;                                 // 이미지 넣을때 new ImageIcon("사진주소");
    Image useimg = useicon.getImage();
    */

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mark1 window = new mark1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public mark1() {
        initialize();
    }
    /*
     *  배경화면 image 추가하기 위한 Imagepanel 생성
     * */

    class ImagePanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(startimg, 0, 0, null);
        }


    }
    /*
     *
     *  jlabel에 사진을 업로드
     *
     * */
/*
    class Imagejlabel extends JLabel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(useimg, 38, 200, null);
        }
    }
*/

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("\uC54C\uB7EC\uC9C0\uD310\uBCC4\uD504\uB85C\uADF8\uB7A8");
        frame.setBounds(100, 100, 815, 725);						// 화면 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 프로그램 종료후 로딩 종료
        frame.getContentPane().setLayout(null);						// 레이아웃 설정
        frame.setLocationRelativeTo(null);							//화면 정중앙에 출력

        // 이미지
        ImagePanel startpage = new ImagePanel();
        startpage.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(startpage);
        startpage.setLayout(null);



        RoundedButton btnstart = new RoundedButton("\uBC14\uB85C\uC2DC\uC791");
        btnstart.setBounds(502, 380, 164, 62);
        btnstart.setBackground(Color.GREEN);
        btnstart.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        startpage.add(btnstart);

        RoundedButton btnExit = new RoundedButton("\uC885\uB8CC");
        btnExit.setBounds(502, 524, 164, 62);
        btnExit.setBackground(Color.RED);
        btnExit.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        startpage.add(btnExit);

        JLabel lblNewLabel = new JLabel("\uD300\uC7A5 : \uCD5C\uBBFC\uAE30");
        lblNewLabel.setBounds(57, 622, 192, 44);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startpage.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("R\uB7ECG");
        lblNewLabel_1.setBounds(246, 41, 274, 137);
        lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 62));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        startpage.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\uC870\uC6D0 :     \uAE40\uC724\uD76C                     \uC8FC\uC2DC\uC6D0                        \uD55C\uC9C0\uC131 ");
        lblNewLabel_2.setBounds(291, 630, 375, 29);
        startpage.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("- \uC2DD\uD488 \uC54C\uB808\uB974\uAE30 \uD655\uC778 \uD504\uB85C\uADF8\uB7A8  -");
        lblNewLabel_3.setBounds(215, 150, 342, 29);
        lblNewLabel_3.setFont(new Font("HY견고딕", Font.PLAIN, 19));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        startpage.add(lblNewLabel_3);

        RoundedButton btnaddcs = new RoundedButton("\uD68C\uC6D0\uAC00\uC785");
        btnaddcs.setBounds(171, 452, 164, 62);
        btnaddcs.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        btnaddcs.setBackground(SystemColor.activeCaption);
        startpage.add(btnaddcs);

        RoundedButton btnlongin = new RoundedButton("\uB85C\uADF8\uC778");
        btnlongin.setBounds(171, 380, 164, 62);
        btnlongin.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        btnlongin.setBackground(SystemColor.textHighlight);
        startpage.add(btnlongin);

        JTextPane txtpnallergy = new JTextPane();
        txtpnallergy.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
        txtpnallergy.setText("\uC54C\uB808\uB974\uAE30\uB294 \uC644\uC804\uD788 \uCE58\uB8CC\uD560\uC218 \uC788\uB294 \uBC29\uBC95\uC774 \uC5C6\uAE30 \uB54C\uBB38\uC5D0 \uC54C\uB808\uB974\uAE30 \uBC18\uC751\uC744 \uC77C\uC73C\uD0A4\uB294 \r\n\uC74C\uC2DD\uC744 \uD68C\uD53C\uD558\uB294 \uAC83\uC774 \uC88B\uB2E4.\r\n\uC54C\uB7EC\uC9C0 \uD310\uBCC4 \uD504\uB85C\uADF8\uB7A8\uC740 \uC0AC\uC6A9\uC790\uAC00 \uD68C\uD53C \uD574\uC57C\uD558\uB294 \uC74C\uC2DD\uC744 \uC27D\uAC8C \uCC3E\uC744 \uC218 \uC788\uAC8C \uD574\uC900\uB2E4.");
        txtpnallergy.setEditable(false);
        txtpnallergy.setBounds(171, 255, 464, 73);
        startpage.add(txtpnallergy);

        RoundedButton explanationbtn = new RoundedButton("\uC54C\uB7EC\uC9C0?");
        explanationbtn.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        explanationbtn.setBackground(Color.CYAN);
        explanationbtn.setBounds(171, 524, 164, 62);
        startpage.add(explanationbtn);

        RoundedButton manualbtn = new RoundedButton("\uBA54\uB274\uC5BC");
        manualbtn.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        manualbtn.setBackground(Color.YELLOW);
        manualbtn.setBounds(502, 452, 164, 62);
        startpage.add(manualbtn);

        JPanel Msecpage = new JPanel();
        Msecpage.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(Msecpage);
        Msecpage.setLayout(null);

        textField_1 = new JTextField();
        textField_1.setBounds(52, 332, 636, 21);
        textField_1.setColumns(10);
        Msecpage.add(textField_1);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(52, 363, 636, 23);
        Msecpage.add(comboBox_1);

        JLabel lblNewLabel_4_1 = new JLabel("\u203B \uC790\uC2E0\uC774 \uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uC2DD\uD488\uC744 \uAC80\uC0C9\uD574\uC8FC\uC138\uC694.");
        lblNewLabel_4_1.setBounds(52, 307, 636, 15);
        Msecpage.add(lblNewLabel_4_1);

        JLabel lblNewLabel_4_1_1 = new JLabel("\uB2D8, \uC548\uB155\uD558\uC138\uC694!");
        lblNewLabel_4_1_1.setFont(new Font("굴림", Font.PLAIN, 13));
        lblNewLabel_4_1_1.setBounds(110, 38, 564, 15);
        Msecpage.add(lblNewLabel_4_1_1);

        JLabel NameLocation = new JLabel("\uD64D\uAE38\uB3D9");
        NameLocation.setFont(new Font("굴림", Font.PLAIN, 13));
        NameLocation.setBounds(39, 38, 115, 15);
        Msecpage.add(NameLocation);

        JLabel lblNewLabel_1_1 = new JLabel("R\uB7ECG");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 62));
        lblNewLabel_1_1.setBounds(236, 97, 274, 137);
        Msecpage.add(lblNewLabel_1_1);

        JButton btnbehind2_1 = new JButton("behindpage");
        btnbehind2_1.setBounds(23, 642, 115, 23);
        Msecpage.add(btnbehind2_1);

        JButton btnnextpage2_1 = new JButton("nextpage");
        btnnextpage2_1.setBounds(679, 642, 108, 23);
        Msecpage.add(btnnextpage2_1);


        JPanel secpage = new JPanel();
        secpage.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(secpage);
        secpage.setLayout(null);

        JButton btnbehind2 = new JButton("behindpage");
        btnbehind2.setBounds(12, 641, 115, 23);
        secpage.add(btnbehind2);

        JButton btnnextpage2 = new JButton("nextpage");
        btnnextpage2.setBounds(679, 641, 108, 23);
        secpage.add(btnnextpage2);

        JCheckBox secpage_Checkbox_메밀 = new JCheckBox("\uBA54\uBC00");
        secpage_Checkbox_메밀.setBounds(43, 133, 115, 23);
        secpage.add(secpage_Checkbox_메밀);

        JCheckBox secpage_Checkbox_밀 = new JCheckBox("\uBC00");
        secpage_Checkbox_밀.setBounds(162, 133, 115, 23);
        secpage.add(secpage_Checkbox_밀);

        JCheckBox secpage_Checkbox_대두 = new JCheckBox("\uB300\uB450");
        secpage_Checkbox_대두.setBounds(281, 133, 115, 23);
        secpage.add(secpage_Checkbox_대두);

        JCheckBox secpage_Checkbox_호두 = new JCheckBox("\uD638\uB450");
        secpage_Checkbox_호두.setBounds(400, 133, 115, 23);
        secpage.add(secpage_Checkbox_호두);

        JCheckBox secpage_Checkbox_땅콩 = new JCheckBox("\uB545\uCF69");
        secpage_Checkbox_땅콩.setBounds(519, 133, 115, 23);
        secpage.add(secpage_Checkbox_땅콩);

        JCheckBox secpage_Checkbox_복숭아 = new JCheckBox("\uBCF5\uC22D\uC544");
        secpage_Checkbox_복숭아.setBounds(638, 133, 115, 23);
        secpage.add(secpage_Checkbox_복숭아);

        JCheckBox secpage_Checkbox_고등어 = new JCheckBox("\uACE0\uB4F1\uC5B4");
        secpage_Checkbox_고등어.setBounds(43, 158, 115, 23);
        secpage.add(secpage_Checkbox_고등어);

        JCheckBox secpage_Checkbox_토마토 = new JCheckBox("\uD1A0\uB9C8\uD1A0");
        secpage_Checkbox_토마토.setBounds(162, 158, 115, 23);
        secpage.add(secpage_Checkbox_토마토);

        JCheckBox secpage_Checkbox_돼지고기 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
        secpage_Checkbox_돼지고기.setBounds(281, 158, 115, 23);
        secpage.add(secpage_Checkbox_돼지고기);

        JCheckBox secpage_Checkbox_소고기 = new JCheckBox("\uC18C\uACE0\uAE30");
        secpage_Checkbox_소고기.setBounds(400, 158, 115, 23);
        secpage.add(secpage_Checkbox_소고기);

        JCheckBox secpage_Checkbox_닭고기 = new JCheckBox("\uB2ED\uACE0\uAE30");
        secpage_Checkbox_닭고기.setBounds(519, 158, 115, 23);
        secpage.add(secpage_Checkbox_닭고기);

        JCheckBox secpage_Checkbox_난류 = new JCheckBox("\uB09C\uB958");
        secpage_Checkbox_난류.setBounds(638, 158, 115, 23);
        secpage.add(secpage_Checkbox_난류);

        JCheckBox secpage_Checkbox_조개류 = new JCheckBox("\uC870\uAC1C\uB958");
        secpage_Checkbox_조개류.setBounds(43, 183, 115, 23);
        secpage.add(secpage_Checkbox_조개류);

        JCheckBox secpage_Checkbox_우유 = new JCheckBox("\uC6B0\uC720");
        secpage_Checkbox_우유.setBounds(162, 183, 115, 23);
        secpage.add(secpage_Checkbox_우유);

        JCheckBox secpage_Checkbox_새우 = new JCheckBox("\uC0C8\uC6B0");
        secpage_Checkbox_새우.setBounds(281, 183, 115, 23);
        secpage.add(secpage_Checkbox_새우);

        JCheckBox secpage_Checkbox_게 = new JCheckBox("\uAC8C");
        secpage_Checkbox_게.setBounds(400, 183, 115, 23);
        secpage.add(secpage_Checkbox_게);

        JCheckBox secpage_Checkbox_오징어 = new JCheckBox("\uC624\uC9D5\uC5B4");
        secpage_Checkbox_오징어.setBounds(519, 183, 115, 23);
        secpage.add(secpage_Checkbox_오징어);

        JCheckBox secpage_Checkbox_아황산 = new JCheckBox("\uC544\uD669\uC0B0\uD3EC\uD568\uC2DD\uD488");
        secpage_Checkbox_아황산.setBounds(638, 183, 115, 23);
        secpage.add(secpage_Checkbox_아황산);

        textField = new JTextField();
        textField.setBounds(52, 389, 636, 21);
        secpage.add(textField);
        textField.setColumns(10);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(52, 420, 636, 23);
        secpage.add(comboBox);

        JLabel lblNewLabel_4 = new JLabel("\u203B \uC790\uC2E0\uC774 \uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uC2DD\uD488\uC744 \uAC80\uC0C9\uD574\uC8FC\uC138\uC694.");
        lblNewLabel_4.setBounds(52, 364, 636, 15);
        secpage.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("\u203B \uC790\uC2E0\uC774 \uD574\uB2F9\uD558\uB294 \uC54C\uB7EC\uC9C0\uB97C \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
        lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 14));
        lblNewLabel_5.setBounds(43, 104, 285, 23);
        secpage.add(lblNewLabel_5);

        JLabel lblNewLabel_5_1 = new JLabel("\u203B\uBCF8\uC778\uC774 \uC54C\uB7EC\uC9C0\uAC00 \uC5C6\uB2E4\uBA74 \uC5C6\uC74C\uC744 \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
        lblNewLabel_5_1.setFont(new Font("굴림", Font.BOLD, 14));
        lblNewLabel_5_1.setBounds(43, 244, 394, 23);
        secpage.add(lblNewLabel_5_1);

        JCheckBox secpage_Checkbox_없음 = new JCheckBox("\uC5C6\uC74C");
        secpage_Checkbox_없음.setBounds(43, 273, 115, 23);
        secpage.add(secpage_Checkbox_없음);

        JPanel thirdpage_member = new JPanel();
        thirdpage_member.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(thirdpage_member);
        thirdpage_member.setLayout(null);

        JButton btnbehindpage3_1 = new JButton("Behind");
        btnbehindpage3_1.setBounds(12, 639, 97, 23);
        thirdpage_member.add(btnbehindpage3_1);

        JButton btnnextpage3_1 = new JButton("Next");
        btnnextpage3_1.setBounds(690, 639, 97, 23);
        thirdpage_member.add(btnnextpage3_1);

        JTextPane textPane_1= new JTextPane();
        textPane_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
        textPane_1.setEditable(false);
        textPane_1.setContentType("text/html");
        textPane_1.setBounds(306,200,440,350);
        thirdpage_member.add(textPane_1);

        JLabel lblNewLabel_8_2 = new JLabel();
        lblNewLabel_8_2.setBounds(38,200,250,166);
        thirdpage_member.add(lblNewLabel_8_2);

        JLabel lblNewLabel_8_2_1 = new JLabel();
        lblNewLabel_8_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblNewLabel_8_2_1.setBounds(38,10,700,166);
        thirdpage_member.add(lblNewLabel_8_2_1);

        JLabel lblNewLabel_6_1 = new JLabel("\u261E\uCDA9\uBD81\uB300 \uC8FC\uC704 \uB9DB\uC9D1\uC744 \uAC80\uC0C9\uD560\uB824\uBA74 \uC544\uB798\uC758 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694.");
        lblNewLabel_6_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
        lblNewLabel_6_1.setBounds(306, 548, 454, 27);
        thirdpage_member.add(lblNewLabel_6_1);

        JButton thridpagemap_1 = new JButton("\uC9C0\uB3C4 \uAC80\uC0C9");
        thridpagemap_1.setBackground(SystemColor.activeCaption);
        thridpagemap_1.setBounds(306, 583, 138, 23);
        thirdpage_member.add(thridpagemap_1);

        JPanel thridpage = new JPanel();
        thridpage.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(thridpage);
        thridpage.setLayout(null);

        JButton btnbehindpage3 = new JButton("Behind");
        btnbehindpage3.setBounds(12, 639, 97, 23);
        thridpage.add(btnbehindpage3);

        JButton btnnextpage3 = new JButton("Next");
        btnnextpage3.setBounds(690, 639, 97, 23);
        thridpage.add(btnnextpage3);

        JLabel lblNewLabel_8 = new JLabel();
        lblNewLabel_8.setBounds(38,200,250,166);
        thridpage.add(lblNewLabel_8);

        JLabel lblNewLabel_8_1_1 = new JLabel();
        lblNewLabel_8_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        lblNewLabel_8_1_1.setBounds(38,10,700,166);
        thridpage.add(lblNewLabel_8_1_1);

        JTextPane textPane_1_2= new JTextPane();
        textPane_1_2.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
        textPane_1_2.setEditable(false);
        textPane_1_2.setContentType("text/html");
        textPane_1_2.setBounds(306,200,440,350);
        thridpage.add(textPane_1_2);

        JButton thridpagemap = new JButton("\uC9C0\uB3C4 \uAC80\uC0C9");
        thridpagemap.setBackground(SystemColor.activeCaption);
        thridpagemap.setBounds(306, 585, 138, 23);
        thridpage.add(thridpagemap);

        JLabel lblNewLabel_6 = new JLabel("\u261E\uCDA9\uBD81\uB300 \uC8FC\uC704 \uB9DB\uC9D1\uC744 \uAC80\uC0C9\uD560\uB824\uBA74 \uC544\uB798\uC758 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694.");
        lblNewLabel_6.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
        lblNewLabel_6.setBounds(306, 548, 454, 27);
        thridpage.add(lblNewLabel_6);

        JPanel endpage = new JPanel();
        endpage.setBackground(Color.WHITE);
        endpage.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(endpage);
        endpage.setLayout(null);

        JLabel lblNewLabel_7 = new JLabel("\uAC10\uC0AC\uD569\uB2C8\uB2E4.");
        lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 63));
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setBounds(152, 182, 474, 174);
        endpage.add(lblNewLabel_7);

        RoundedButton btnEnd = new RoundedButton("Exit");
        btnEnd.setBackground(Color.RED);
        btnEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnEnd.setBounds(412, 393, 110, 58);
        endpage.add(btnEnd);

        RoundedButton btnlastpage = new RoundedButton("\uB418\uB3CC\uC544\uAC00\uAE30");
        btnlastpage.setBackground(Color.GREEN);
        btnlastpage.setBounds(265, 393, 110, 58);
        endpage.add(btnlastpage);

        JPanel login = new JPanel();
        login.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(login);
        login.setLayout(null);

        JButton loginbtn = new JButton("\uB85C\uADF8\uC778");
        loginbtn.setBackground(Color.GRAY);
        loginbtn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
        loginbtn.setForeground(Color.WHITE);
        loginbtn.setBounds(257, 327, 266, 35);
        login.add(loginbtn);

        loginID = new JTextField();
        loginID.setBounds(332, 248, 191, 27);
        login.add(loginID);
        loginID.setColumns(10);

        loginpassward = new JTextField();
        loginpassward.setColumns(10);
        loginpassward.setBounds(332, 285, 191, 27);
        login.add(loginpassward);

        JLabel lblNewLabel_9 = new JLabel("ID");
        lblNewLabel_9.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9.setBounds(257, 250, 63, 21);
        login.add(lblNewLabel_9);

        JLabel lblNewLabel_9_1 = new JLabel("Passward");
        lblNewLabel_9_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9_1.setBounds(257, 287, 63, 21);
        login.add(lblNewLabel_9_1);

        JButton find_passward_btn = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
        find_passward_btn.setForeground(Color.WHITE);
        find_passward_btn.setBackground(Color.LIGHT_GRAY);
        find_passward_btn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
        find_passward_btn.setBounds(396, 383, 127, 23);
        login.add(find_passward_btn);

        JButton go_signup_btn = new JButton("\uD68C\uC6D0\uAC00\uC785");
        go_signup_btn.setBackground(Color.LIGHT_GRAY);
        go_signup_btn.setForeground(Color.WHITE);
        go_signup_btn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
        go_signup_btn.setBounds(257, 383, 127, 23);
        login.add(go_signup_btn);

        JButton login_behind_btn = new JButton("\u2190Behind");
        login_behind_btn.setFont(new Font("휴먼옛체", Font.PLAIN, 12));
        login_behind_btn.setBounds(12, 634, 101, 23);
        login.add(login_behind_btn);

        JPanel signup = new JPanel();
        signup.setLayout(null);
        signup.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(signup);

        JButton signup_btn = new JButton("\uD68C\uC6D0\uAC00\uC785\uD558\uAE30");
        signup_btn.setForeground(Color.WHITE);
        signup_btn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
        signup_btn.setBackground(Color.GRAY);
        signup_btn.setBounds(257, 497, 266, 35);
        signup.add(signup_btn);

        id = new JTextField();
        id.setColumns(10);
        id.setBounds(332, 391, 191, 27);
        signup.add(id);

        paswward = new JTextField();
        paswward.setColumns(10);
        paswward.setBounds(332, 428, 191, 27);
        signup.add(paswward);

        hint = new JTextField();
        hint.setColumns(10);
        hint.setBounds(332, 465, 191, 27);
        signup.add(hint);

        JLabel lblNewLabel_9_2 = new JLabel("ID");
        lblNewLabel_9_2.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9_2.setBounds(257, 394, 63, 21);
        signup.add(lblNewLabel_9_2);

        JButton signup_checkid_btn = new JButton("중복확인");
        signup_checkid_btn.setFont(new Font("휴먼옛체", Font.PLAIN, 10));
        signup_checkid_btn.setBounds(540, 391, 90, 20);
        signup.add(signup_checkid_btn);

        JLabel lblNewLabel_9_1_1 = new JLabel("Passward");
        lblNewLabel_9_1_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9_1_1.setBounds(257, 431, 63, 21);
        signup.add(lblNewLabel_9_1_1);

        JLabel lblNewLabel_9_1_2 = new JLabel("Hint");
        lblNewLabel_9_1_2.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9_1_2.setBounds(257, 465, 63, 21);
        signup.add(lblNewLabel_9_1_2);

        JButton signup_firstpage_btn = new JButton("\u2190firstpage");
        signup_firstpage_btn.setFont(new Font("휴먼옛체", Font.PLAIN, 12));
        signup_firstpage_btn.setBounds(12, 634, 104, 23);
        signup.add(signup_firstpage_btn);

        JLabel lblNewLabel_9_2_1 = new JLabel("E-mail");
        lblNewLabel_9_2_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9_2_1.setBounds(257, 357, 63, 21);
        signup.add(lblNewLabel_9_2_1);

        email = new JTextField();
        email.setColumns(10);
        email.setBounds(332, 354, 191, 27);
        signup.add(email);

        JLabel lblNewLabel_9_2_1_1 = new JLabel("name");
        lblNewLabel_9_2_1_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
        lblNewLabel_9_2_1_1.setBounds(257, 320, 63, 21);
        signup.add(lblNewLabel_9_2_1_1);

        name = new JTextField();
        name.setColumns(10);
        name.setBounds(332, 317, 191, 27);
        signup.add(name);

        JCheckBox singup_CheckBox_메밀 = new JCheckBox("\uBA54\uBC00");
        singup_CheckBox_메밀.setBounds(47, 124, 115, 23);
        signup.add(singup_CheckBox_메밀);

        JCheckBox singup_CheckBox_밀 = new JCheckBox("\uBC00");
        singup_CheckBox_밀.setBounds(166, 124, 115, 23);
        signup.add(singup_CheckBox_밀);

        JCheckBox singup_CheckBox_대두 = new JCheckBox("\uB300\uB450");
        singup_CheckBox_대두.setBounds(285, 124, 115, 23);
        signup.add(singup_CheckBox_대두);

        JCheckBox singup_CheckBox_호두 = new JCheckBox("\uD638\uB450");
        singup_CheckBox_호두.setBounds(408, 124, 115, 23);
        signup.add(singup_CheckBox_호두);

        JCheckBox singup_CheckBox_땅콩 = new JCheckBox("\uB545\uCF69");
        singup_CheckBox_땅콩.setBounds(530, 124, 115, 23);
        signup.add(singup_CheckBox_땅콩);

        JCheckBox singup_CheckBox_복숭아 = new JCheckBox("\uBCF5\uC22D\uC544");
        singup_CheckBox_복숭아.setBounds(649, 124, 115, 23);
        signup.add(singup_CheckBox_복숭아);

        JCheckBox singup_CheckBox_고등어 = new JCheckBox("\uACE0\uB4F1\uC5B4");
        singup_CheckBox_고등어.setBounds(47, 149, 115, 23);
        signup.add(singup_CheckBox_고등어);

        JCheckBox singup_CheckBox_토마토 = new JCheckBox("\uD1A0\uB9C8\uD1A0");
        singup_CheckBox_토마토.setBounds(166, 149, 115, 23);
        signup.add(singup_CheckBox_토마토);

        JCheckBox singup_CheckBox_돼지고기 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
        singup_CheckBox_돼지고기.setBounds(285, 149, 115, 23);
        signup.add(singup_CheckBox_돼지고기);

        JCheckBox singup_CheckBox_소고기 = new JCheckBox("\uC18C\uACE0\uAE30");
        singup_CheckBox_소고기.setBounds(408, 149, 115, 23);
        signup.add(singup_CheckBox_소고기);

        JCheckBox singup_CheckBox_닭고기 = new JCheckBox("\uB2ED\uACE0\uAE30");
        singup_CheckBox_닭고기.setBounds(530, 149, 115, 23);
        signup.add(singup_CheckBox_닭고기);

        JCheckBox singup_CheckBox_난류 = new JCheckBox("\uB09C\uB958");
        singup_CheckBox_난류.setBounds(649, 149, 115, 23);
        signup.add(singup_CheckBox_난류);

        JCheckBox singup_CheckBox_조개류 = new JCheckBox("\uC870\uAC1C\uB958");
        singup_CheckBox_조개류.setBounds(47, 174, 115, 23);
        signup.add(singup_CheckBox_조개류);

        JCheckBox singup_CheckBox_우유 = new JCheckBox("\uC6B0\uC720");
        singup_CheckBox_우유.setBounds(166, 174, 115, 23);
        signup.add(singup_CheckBox_우유);

        JCheckBox singup_CheckBox_새우 = new JCheckBox("\uC0C8\uC6B0");
        singup_CheckBox_새우.setBounds(285, 174, 115, 23);
        signup.add(singup_CheckBox_새우);

        JCheckBox singup_CheckBox_게 = new JCheckBox("\uAC8C");
        singup_CheckBox_게.setBounds(408, 174, 115, 23);
        signup.add(singup_CheckBox_게);

        JCheckBox singup_CheckBox_오징어 = new JCheckBox("\uC624\uC9D5\uC5B4");
        singup_CheckBox_오징어.setBounds(530, 174, 115, 23);
        signup.add(singup_CheckBox_오징어);

        JCheckBox singup_CheckBox_아황산 = new JCheckBox("\uC544\uD669\uC0B0\uD3EC\uD568\uC2DD\uD488");
        singup_CheckBox_아황산.setBounds(649, 174, 115, 23);
        signup.add(singup_CheckBox_아황산);

        JCheckBox singup_CheckBox_없음 = new JCheckBox("\uC5C6\uC74C");
        singup_CheckBox_없음.setBounds(47, 242, 115, 23);
        signup.add(singup_CheckBox_없음);

        JLabel singup_jlabel1 = new JLabel("\uBCF8\uC778\uC774 \uD574\uB2F9\uD558\uB294 \uC54C\uB7EC\uC9C0\uB97C \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
        singup_jlabel1.setFont(new Font("Dialog", Font.PLAIN, 12));
        singup_jlabel1.setBounds(47, 83, 330, 21);
        signup.add(singup_jlabel1);

        JLabel singup_jlabel1_1 = new JLabel("\uBCF8\uC778\uC774 \uC54C\uB7EC\uC9C0\uAC00 \uC5C6\uB2E4\uBA74 \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
        singup_jlabel1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
        singup_jlabel1_1.setBounds(47, 215, 330, 21);
        signup.add(singup_jlabel1_1);

        JPanel findpass = new JPanel();
        findpass.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(findpass);
        findpass.setLayout(null);

        JLabel findname = new JLabel("name");
        findname.setFont(new Font("Dialog", Font.PLAIN, 12));
        findname.setBounds(257, 263, 63, 21);
        findpass.add(findname);

        // 메뉴얼 페이지
        JPanel manualpage = new JPanel();
        manualpage.setBackground(Color.white);
        manualpage.setBounds(0, 0, 799, 699);
        frame.getContentPane().add(manualpage);
        manualpage.setLayout(null);

        JTextPane manualtext = new JTextPane();
        manualtext.setBounds(12, 128, 775, 340);
        manualtext.setText("1. \uCC98\uC74C \uD654\uBA74\uC5D0\uC11C \uD68C\uC6D0\uAC00\uC785 \uB610\uB294 \uBE44\uD68C\uC6D0 \uBC84\uD2BC\uC744 \uD074\uB9AD\uD55C\uB2E4.\r\n\r\n1-1. \uD68C\uC6D0\uAC00\uC785\uC744 \uC120\uD0DD\uD558\uC600\uB2E4\uBA74 \uBCF8\uC778\uC774 \uD574\uB2F9\uD558\uB294 \uC54C\uB808\uB974\uAE30\uB97C \uCCB4\uD06C\uD574\uC8FC\uBA70 \uD68C\uC6D0\uC815\uBCF4\uB97C \uAE30\uC785\uD55C\uB2E4.\r\n\r\n1-2. \uB9CC\uC57D \uBC14\uB85C\uC2DC\uC791(\uBE44\uD68C\uC6D0)\uC744 \uC120\uD0DD\uD558\uC600\uB2E4\uBA74 \uC790\uC2E0\uC774 \uD574\uB2F9\uD558\uB294 \uC54C\uB808\uB974\uAE30\uB97C \uCCB4\uD06C\uD55C\uB2E4.\r\n\r\n2. \uC790\uC2E0\uC774 \uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uC2DD\uD488\uC744 \uC785\uB825\uD55C \uD6C4 \uB2E4\uC74C\uD398\uC774\uC9C0\uB85C \uB118\uC5B4\uAC04\uB2E4.\r\n\r\n3. \uAC80\uC0C9\uD55C \uC2DD\uD488\uC758 \uC2DD\uD488\uC601\uC591\uC18C, \uCCA8\uAC00\uBB3C, \uB2F9\uC2E0\uC774 \uD3EC\uD568\uB418\uB294 \uC54C\uB808\uB974\uAE30 \uC815\uBCF4\uB97C \uC81C\uACF5\uD574\uC900\uB2E4.\r\n\r\n4. \uB9CC\uC57D \uC2DD\uD488\uACFC \uBCF8\uC778\uC758 \uC54C\uB808\uB974\uAE30\uAC00 \uC77C\uCE58\uD55C\uB2E4\uBA74 \uB300\uCCB4\uD560 \uC218 \uC788\uB294 \uC2DD\uD488\uC744 \uC54C\uB824\uC900\uB2E4.\r\n");
        manualtext.setFont(new Font("HY궁서B", Font.PLAIN, 20));
        manualtext.setEditable(false);
        manualtext.setBackground(Color.PINK);
        manualpage.add(manualtext);

        JButton manubehindbtn = new JButton("Behind page");
        manubehindbtn.setBounds(41, 613, 165, 38);
        manualpage.add(manubehindbtn);

        JTextPane textPane_2 = new JTextPane();
        textPane_2.setBounds(350, 69, 152, 63);
        textPane_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        textPane_2.setEditable(false);
        textPane_2.setBackground(Color.white);
        textPane_2.setText("\uBA54\uB274\uC5BC");
        manualpage.add(textPane_2);
        // 설명 페이지
        JPanel explanpage = new JPanel();
        explanpage.setBackground(Color.WHITE);
        explanpage.setBounds(0, 0, 799, 699);
        frame.getContentPane().add(explanpage);
        explanpage.setLayout(null);

        JTextPane explanpinkimage1 = new JTextPane();
        explanpinkimage1.setEditable(false);
        explanpinkimage1.setBackground(Color.PINK);
        explanpinkimage1.setBounds(0, 0, 13, 27);
        explanpage.add(explanpinkimage1);

        JTextPane explanpinkimage2 = new JTextPane();
        explanpinkimage2.setEditable(false);
        explanpinkimage2.setBackground(Color.PINK);
        explanpinkimage2.setBounds(0, 95, 13, 27);
        explanpage.add(explanpinkimage2);

        JTextPane explantitle1 = new JTextPane();
        explantitle1.setEditable(false);
        explantitle1.setText("\uC54C\uB808\uB974\uAE30 \uB780?");
        explantitle1.setBounds(25, 0, 144, 27);
        explanpage.add(explantitle1);

        JTextPane explanation1 = new JTextPane();
        explanation1.setEditable(false);
        explanation1.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation1.setText("\uC54C\uB808\uB974\uAE30 \uB610\uB294 \uC54C\uB7EC\uC9C0(allergy)\uB294 \uBA74\uC5ED \uC2DC\uC2A4\uD15C\uC758 \uC624\uC791\uB3D9\uC73C\uB85C \uBCF4\uD1B5 \uC0AC\uB78C\uC5D0\uAC8C\uB294 \uBCC4 \uC601\uD5A5\uC774 \uC5C6\uB294 \uBB3C\uC9C8\uC774 \uC5B4\uB5A4 \uC0AC\uB78C\uC5D0\uAC8C\uB9CC \uB450\uB4DC\uB7EC\uAE30, \uAC00\uB824\uC6C0, \uCF67\uBB3C, \uAE30\uCE68\uB4F1 \uC774\uC0C1 \uACFC\uBBFC \uBC18\uC751\uC744 \uC77C\uC73C\uD0A4\uB294 \uAC83\uC744 \uB9D0\uD569\uB2C8\uB2E4.\r\n");
        explanation1.setBounds(10, 37, 744, 57);
        explanpage.add(explanation1);

        JTextPane explantitle2 = new JTextPane();
        explantitle2.setEditable(false);
        explantitle2.setText("\uB204\uAC00 \uC54C\uB808\uB974\uAE30\uC5D0 \uAC78\uB9AC\uB098?");
        explantitle2.setBounds(20, 95, 144, 27);
        explanpage.add(explantitle2);

        JTextPane explanation2 = new JTextPane();
        explanation2.setEditable(false);
        explanation2.setText("\uC54C\uB808\uB974\uAE30 \uC720\uBC1C\uC6D0\uC778\uC73C\uB85C\uB294 \uC720\uC804\uC744 \uADF8 \uC73C\uB738\uC73C\uB85C \uAF3D\uC2B5\uB2C8\uB2E4.  \uC65C\uB0D0\uD558\uBA74 \uC54C\uB808\uB974\uAE30 \uB54C\uBB38\uC5D0\uACE0\uC0DD\uD558\uB294 \uD658\uC790\uB4E4\uC758 \uD608\uC561\uC744 \uBF51\uC544\uC11C \uC720\uC804\uC790\uB97C \uC870\uC0AC\uD574 \uBCF4\uB2C8 \uC11C\uB85C \uB3D9\uC77C\uD55C \uC720\uC804\uC790 \uC704\uCE58\uC5D0 \uB3D9\uC77C\uD55C \uC720\uC804\uC790\uB97C \uC9C0\uB2C8\uACE0 \uC788\uB2E4\uB294 \uAC83\uC785\uB2C8\uB2E4. \uB9CC\uC57D \uC591 \uBD80\uBAA8\uC911 \uC5B4\uB290 \uD55C\uCABD\uC774 \uC54C\uB808\uB974\uAE30 \uC9C8\uD658\uC744 \uC9C0\uB2C8\uACE0 \uC788\uB2E4\uBA74 \uADF8 \uC790\uB140 3\uBA85\uC911 \uD55C\uBA85\uC740 \uC54C\uB808\uB974\uAE30\uB97C \uC9C0\uB2D0 \uAC00\uB2A5\uC131\uC774 \uB9E4\uC6B0 \uB192\uACE0, \uC720\uC804\uC801 \uC694\uC778 \uC678\uC5D0 \uAC70\uB860\uB418\uB294 \uC6D0\uC778\uC73C\uB85C\uB294 \uC5B4\uB5A4 \uD638\uB974\uBAAC\uC758 \uC601\uD5A5, \uBC14\uC774\uB7EC\uC2A4 \uAC10\uC5FC, \uD761\uC5F0 \uB4F1\uB3C4 \uC54C\uB808\uB974\uAE30\uB97C \uC720\uBC1C\uC2DC\uD0AC \uC218 \uC788\uB2E4\uACE0 \uB9D0\uD569\uB2C8\uB2E4.");
        explanation2.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation2.setBounds(10, 126, 744, 91);
        explanpage.add(explanation2);

        JTextPane explanpinkimage3 = new JTextPane();
        explanpinkimage3.setEditable(false);
        explanpinkimage3.setBackground(Color.PINK);
        explanpinkimage3.setBounds(0, 222, 13, 27);
        explanpage.add(explanpinkimage3);

        JTextPane explanation3 = new JTextPane();
        explanation3.setEditable(false);
        explanation3.setText("\uC54C\uB808\uB974\uAE30 \uC9C8\uD658\uC740 \uD754\uD558\uC9C0\uB9CC \uC2E4\uC81C\uC801\uC73C\uB85C \uADF8 \uC9C4\uB2E8\uBC95\uC740 \uAC04\uB2E8\uD558\uC9C0\uAC00 \uC54A\uC2B5\uB2C8\uB2E4. \uADF8\uB7FC\uC5D0\uB3C4 \uBD88\uAD6C\uD558\uACE0 \uC54C\uB808\uB974\uAE30 \uC9C8\uD658\uC744 \uC9C4\uB2E8\uD558\uB294 \uB370\uB294 \uBA87 \uAC00\uC9C0 \uBC29\uBC95\uC774 \uC788\uC2B5\uB2C8\uB2E4. \uADF8 \uC911 \uC81C\uC77C \uC911\uC694\uD55C \uAC83\uC740 \uD658\uC790\uC758 \uBCD1\uB825\uACFC \uAC00\uC871\uB825\uC785\uB2C8\uB2E4. \r\n\uB2E4\uC74C\uC73C\uB85C\uB294 \uC5EC\uB7EC \uAC00\uC9C0 \uC54C\uB808\uB974\uAE30 \uAC80\uC0AC\uBC29\uBC95\uC774 \uC788\uB294\uB370 \uD06C\uAC8C \uC54C\uB808\uB974\uAE30 \uD53C\uBD80\uBC18\uC751\uAC80\uC0AC\uC640 \uD608\uC561\uAC80\uC0AC, \uC54C\uB808\uB974\uAE30 \uC720\uBC1C\uAC80\uC0AC \uB4F1\uC73C\uB85C \uB098\uB215\uB2C8\uB2E4. \uB9C8\uC9C0\uB9C9\uC73C\uB85C \uC758\uC2EC\uB418\uB294 \uC54C\uB808\uB974\uAE30 \uC6D0\uC778\uC744 \uC0AC\uB78C\uC758 \uCF54\uB098 \uB208, \uAE30\uAD00\uC9C0\uB0B4\uC5D0 \uC9C1\uC811 \uC791\uC6A9\uC2DC\uCF1C \uBCF4\uAC70\uB098 \uC758\uC2EC\uB418\uB294 \uC2DD\uD488\uC744 \uBA39\uC5EC\uBCF4\uC544 \uC54C\uB808\uB974\uAE30 \uBC18\uC751\uC774 \uC77C\uC5B4\uB098\uB294\uC9C0 \uC5EC\uBD80\uB97C \uBCF4\uB294 \uBC29\uBC95\uC778\uB370 \uC774\uB294 \uC2E4\uC2DC\uD558\uB294 \uC758\uC0AC\uB098 \uD658\uC790 \uBAA8\uB450\uC5D0\uAC8C \uBD80\uB2F4\uC774 \uB418\uB294 \uAC80\uC0AC\uC774\uBBC0\uB85C \uC81C\uD55C\uC801\uC73C\uB85C \uC2E4\uC2DC\uB418\uACE0 \uC788\uC2B5\uB2C8\uB2E4. \uC774\uB97C \uC720\uBC1C\uAC80\uC0AC\uB77C \uD569\uB2C8\uB2E4.");
        explanation3.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation3.setBounds(10, 257, 744, 117);
        explanpage.add(explanation3);

        JTextPane explantitle3 = new JTextPane();
        explantitle3.setEditable(false);
        explantitle3.setText("\uC54C\uB808\uB974\uAE30 \uC9C4\uB2E8 \uBC29\uBC95");
        explantitle3.setBounds(25, 222, 144, 27);
        explanpage.add(explantitle3);

        JTextPane explanpinkimage4 = new JTextPane();
        explanpinkimage4.setEditable(false);
        explanpinkimage4.setBackground(Color.PINK);
        explanpinkimage4.setBounds(0, 392, 13, 27);
        explanpage.add(explanpinkimage4);

        JTextPane explantitle4 = new JTextPane();
        explantitle4.setEditable(false);
        explantitle4.setText("\uC54C\uB808\uB974\uAE30 \uC9C8\uD658\uC758 \uC885\uB958");
        explantitle4.setBounds(25, 392, 144, 27);
        explanpage.add(explantitle4);

        JTextPane explanation4 = new JTextPane();
        explanation4.setEditable(false);
        explanation4.setText("\uC54C\uB808\uB974\uAE30 \uBC18\uC751\uC740 \uC778\uCCB4\uC758 \uC5B4\uB290 \uBD80\uC704\uC5D0\uC11C\uB098 \uC77C\uC5B4\uB0A0 \uC218 \uC788\uC2B5\uB2C8\uB2E4. \uC6B0\uB9AC\uAC00 \uD754\uD788 \uC811\uD560 \uC218 \uC788\uB294 \uC9C8\uD658\uC73C\uB85C\uB294 \uC54C\uB808\uB974\uAE30\uC131 \uACB0\uB9C9\uC5FC, \uBE44\uC5FC, \uAE30\uAD00\uC9C0\uCC9C\uC2DD, \uC54C\uB808\uB974\uAE30\uC131 \uC811\uCD09\uC131\uD53C\uBD80\uC5FC, \uD0DC\uC5F4(\uC544\uD1A0\uD53C\uC131\uD53C\uBD80\uC5FC), \uB450\uB4DC\uB7EC\uAE30 \uB4F1\uC774 \uC788\uC2B5\uB2C8\uB2E4. ");
        explanation4.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation4.setBounds(10, 425, 744, 46);
        explanpage.add(explanation4);

        JTextPane explanpinkimage5 = new JTextPane();
        explanpinkimage5.setEditable(false);
        explanpinkimage5.setBackground(Color.PINK);
        explanpinkimage5.setBounds(0, 481, 13, 27);
        explanpage.add(explanpinkimage5);

        JTextPane explantitle5 = new JTextPane();
        explantitle5.setEditable(false);
        explantitle5.setText("\uC54C\uB808\uB974\uAE30\uC758 \uC885\uB958");
        explantitle5.setBounds(25, 481, 144, 27);
        explanpage.add(explantitle5);

        JTextPane explanation5 = new JTextPane();
        explanation5.setEditable(false);
        explanation5.setText("\uC54C\uB808\uB974\uAE30 \uC885\uB958\uC5D0\uB294 \uC2DD\uD488 \uC54C\uB808\uB974\uAE30, \uB300\uAE30 \uC54C\uB808\uB974\uAE30, \uD654\uBD84 \uC54C\uB808\uB974\uAE30, \uACF0\uD321\uC774 \uC54C\uB808\uB974\uAE30,\uBA3C\uC9C0 \uC54C\uB808\uB974\uAE30, \uB3D9\uBB3C \uC54C\uB808\uB974\uAE30 \uB4F1\uC774 \uC788\uC2B5\uB2C8\uB2E4.");
        explanation5.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation5.setBounds(10, 518, 744, 46);
        explanpage.add(explanation5);

        RoundedButton explanbackbtn_0 = new RoundedButton("Behind Page");
        explanbackbtn_0.setBackground(Color.GREEN);
        explanbackbtn_0.setBounds(12, 608, 110, 58);
        explanpage.add(explanbackbtn_0);

        RoundedButton explannextbtn = new RoundedButton("Next Page");
        explannextbtn.setBackground(Color.GREEN);
        explannextbtn.setBounds(659, 608, 110, 58);
        explanpage.add(explannextbtn);
        // 설명페이지 2
        JPanel explanpage1 = new JPanel();
        explanpage1.setLayout(null);
        explanpage1.setBackground(Color.WHITE);
        explanpage1.setBounds(0, 0, 799, 699);
        frame.getContentPane().add(explanpage1);

        JTextPane explanpinkimage1_1 = new JTextPane();
        explanpinkimage1_1.setEditable(false);
        explanpinkimage1_1.setBackground(Color.PINK);
        explanpinkimage1_1.setBounds(0, 0, 13, 27);
        explanpage1.add(explanpinkimage1_1);

        JTextPane explantitle1_1 = new JTextPane();
        explantitle1_1.setEditable(false);
        explantitle1_1.setText("\uC2DD\uD488 \uC54C\uB808\uB974\uAE30\uC758 \uC99D\uC0C1");
        explantitle1_1.setBounds(25, 0, 144, 27);
        explanpage1.add(explantitle1_1);

        JTextPane explanation1_1 = new JTextPane();
        explanation1_1.setEditable(false);
        explanation1_1.setText("\uC2DD\uD488\uC54C\uB808\uB974\uAE30 \uC99D\uC0C1\uC740 \uB9E4\uC6B0 \uB2E4\uC591\uD569\uB2C8\uB2E4.\r\n\uC774\uB294 \uC74C\uC2DD\uBB3C\uC5D0 \uB300\uD55C \uC54C\uB808\uB974\uAE30 \uD604\uC0C1\uC5D0 \uC758\uD574 \uC190\uC0C1\uB418\uB294 \uC870\uC9C1 \uBD80\uC704\uC5D0 \uB530\uB77C \uB2E4\uB978 \uC99D\uC0C1\uC744 \uAC00\uC838\uC624\uAE30 \uB54C\uBB38\uC785\uB2C8\uB2E4. \uC74C\uC2DD\uC5D0 \uB300\uD55C \uC54C\uB808\uB974\uAE30 \uC99D\uC0C1\uC744 \uC77C\uC73C\uD0A4\uB294 \uCD5C\uCD08\uC758 \uC2E0\uCCB4\uBD80\uC704\uB294 \uC704\uC7A5\uAD00 \uC73C\uB85C \uC544\uB54C \uB098\uD0C0\uB0A0 \uC218 \uC788\uB294 \uC99D\uC0C1\uC740 \uAD6C\uD1A0, \uBCF5\uD1B5, \uC124\uC0AC \uB4F1\uC774 \uB300\uD45C\uC801\uC774\uBA70 \uD53C\uBD80\uC5D0 \uB098\uD0C0\uB098\uBA74 \uB450\uB4DC\uB7EC\uAE30, \uBD80\uC885 \uC744 \uC77C\uC73C\uD0A4\uACE0 \uCF54\uC5D0 \uB098\uD0C0\uB09C\uB2E4\uBA74 \uC7AC\uCC44\uAE30, \uCF67\uBB3C \uB4F1\uC774 \uBCF4\uC774\uBA70 \uAE30\uAD00\uC9C0\uC5D0 \uB098\uD0C0\uB098\uBA74 \uCC9C\uBA85 \uD639\uC740 \uD638\uD761\uACE4\uB780\uC744 \uAC00\uC838\uC635\uB2C8\uB2E4.\r\n\uADF8\uB7EC\uB098 \uAC00\uC7A5 \uC2EC\uD55C \uC2DD\uD488 \uC54C\uB808\uB974\uAE30 \uBC18\uC751\uC740 \uD604\uC7AC COVID-19 \uBC31\uC2E0 \uBD80\uC791\uC6A9\uC73C\uB85C \uC54C\uB824\uC838 \uC788\uB294 \uC544\uB098\uD544\uB77D\uC2DC\uC2A4\uB77C \uBD88\uB9AC\uB294 \uBC18\uC751\uC785\uB2C8\uB2E4. \uC774\uAC83\uC740 \uD658\uC790\uAC00 \uC54C\uB808\uB974\uAE30 \uBC18\uC751\uC744 \uC9C0\uB2C8\uAC00 \uC788\uB294 \uC74C\uC2DD\uC744 \uC12D\uCDE8 \uD6C4 \uBA87 \uBD84\uB0B4\uC5D0 \uC989\uAC01\uC801\uC73C\uB85C \uC804\uC2E0\uC801, \uCE58\uBA85\uC801\uC778 \uC800\uD608\uC555\uC744 \uAC00\uC838\uC640 \uC1FC\uD06C \uC0C1\uD0DC\uC5D0 \uBE60\uC9C0\uB294 \uD604\uC0C1\uC744 \uB9D0\uD569\uB2C8\uB2E4. \r\n");
        explanation1_1.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation1_1.setBounds(10, 37, 744, 168);
        explanpage1.add(explanation1_1);

        RoundedButton explanbackbtn_1 = new RoundedButton("Behind Page");
        explanbackbtn_1.setBackground(Color.GREEN);
        explanbackbtn_1.setBounds(12, 608, 110, 58);
        explanpage1.add(explanbackbtn_1);

        RoundedButton explanexit = new RoundedButton("Exit");
        explanexit.setBackground(Color.GREEN);
        explanexit.setBounds(659, 608, 110, 58);
        explanpage1.add(explanexit);

        JTextPane explanpinkimage1_2 = new JTextPane();
        explanpinkimage1_2.setEditable(false);
        explanpinkimage1_2.setBackground(Color.PINK);
        explanpinkimage1_2.setBounds(0, 222, 13, 27);
        explanpage1.add(explanpinkimage1_2);

        JTextPane explantitle1_2 = new JTextPane();
        explantitle1_2.setEditable(false);
        explantitle1_2.setText("\uC54C\uB808\uB974\uAE30 \uCE58\uB8CC");
        explantitle1_2.setBounds(25, 222, 144, 27);
        explanpage1.add(explantitle1_2);

        JTextPane explanation1_2 = new JTextPane();
        explanation1_2.setEditable(false);
        explanation1_2.setText("\uC54C\uB808\uB974\uAE30 \uC9C8\uD658\uC758 \uCE58\uB8CC\uC5D0\uB294 3\uB300\uC6D0\uCE59\uC778 \uD68C\uD53C\uC694\uBC95, \uC57D\uBB3C\uCE58\uB8CC, \uBA74\uC5ED\uCE58\uB8CC \uBC29\uBC95\uC774 \uC788\uC2B5\uB2C8\uB2E4. \uD558\uC9C0\uB9CC \uC544\uC9C1\uAE4C\uC9C0 \uC54C\uB808\uB974\uAE30\uC758 \uC644\uCE58\uB97C \uC774\uB8E8\uB294 \uC808\uB300\uC801\uC778 \uCE58\uB8CC\uBC29\uBC95\uC774 \uC5C6\uAE30\uB54C\uBB38\uC5D0 \uD68C\uD53C\uC694\uBC95\uC744 \uAD8C\uC7A5\uD558\uACE0 \uC788\uC2B5\uB2C8\uB2E4.\r\n\r\n");
        explanation1_2.setFont(new Font("HY헤드라인M", Font.PLAIN, 14));
        explanation1_2.setBounds(10, 259, 744, 74);
        explanpage1.add(explanation1_2);

        JLabel findEmail = new JLabel("E-mail");
        findEmail.setFont(new Font("Dialog", Font.PLAIN, 12));
        findEmail.setBounds(257, 297, 63, 21);
        findpass.add(findEmail);

        JLabel findid = new JLabel("ID");
        findid.setFont(new Font("Dialog", Font.PLAIN, 12));
        findid.setBounds(257, 335, 63, 21);
        findpass.add(findid);

        JLabel findhinit = new JLabel("Hinit");
        findhinit.setFont(new Font("Dialog", Font.PLAIN, 12));
        findhinit.setBounds(257, 372, 63, 21);
        findpass.add(findhinit);

        textField_name = new JTextField();
        textField_name.setColumns(10);
        textField_name.setBounds(325, 260, 191, 27);
        findpass.add(textField_name);

        textField_Email = new JTextField();
        textField_Email.setColumns(10);
        textField_Email.setBounds(325, 294, 191, 27);
        findpass.add(textField_Email);

        textField_ID = new JTextField();
        textField_ID.setColumns(10);
        textField_ID.setBounds(325, 332, 191, 27);
        findpass.add(textField_ID);

        textField_Hinit = new JTextField();
        textField_Hinit.setColumns(10);
        textField_Hinit.setBounds(325, 369, 191, 27);
        findpass.add(textField_Hinit);

        JButton findpass_btn_1 = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
        findpass_btn_1.setForeground(Color.WHITE);
        findpass_btn_1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 12));
        findpass_btn_1.setBackground(Color.GRAY);
        findpass_btn_1.setBounds(257, 407, 266, 35);
        findpass.add(findpass_btn_1);

        JButton findpass_behind_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
        findpass_behind_btn.setBounds(24, 634, 97, 23);
        findpass.add(findpass_behind_btn);



        /* 처음 화면 보이기 설정*/
        //처음 화면 만 보여주기 위해 나머지 페이지는 보이지 않게 설정한다.
        secpage.setVisible(false);              //  두번째 페이지
        Msecpage.setVisible(false);
        thridpage.setVisible(false);            // 세번째 페이지
        thirdpage_member.setVisible(false);
        endpage.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        findpass.setVisible(false);
        manualpage.setVisible(false);
        explanpage.setVisible(false);
        explanpage1.setVisible(false);

        /*첫번째 페이지 */


        // 스타트 버튼이 입력이 되면 다음 화면으로 넘어간다.
        btnstart.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(true);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);

            }
        }   );

        //로그인 버튼이 입력이 되면 로그인 화면으로 이동한다.
        btnlongin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(true);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);

            }
        }   );

        //회원가입 버튼이 입력이 되면 회원가입 화면으로 이동한다.
        btnaddcs.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(true);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);

            }
        }   );


        // 종료 버튼을 누르면 프로그램 종료
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // 알러지? 버튼이 입력되면 설명 페이지로 이동한다.
        explanationbtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(true);
                explanpage1.setVisible(false);

            }
        }   );
        // 알러지? 페이지 뒤로가기를 누르면 처음 화면으로 넘어간다.
        explanbackbtn_0.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );

        // 다음 버튼을 누르면 설명두번째 페이지로 넘어간다.
        explannextbtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(true);
            }
        }   );

        // 뒤로가기를 누르면 설명 첫페이지로 이동한다.
        explanbackbtn_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(true);
                explanpage1.setVisible(false);
            }
        }   );

        // 설명 페이지 종료를 누르면 처음 화면으로 넘어간다.
        explanexit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );

// 메뉴얼 버튼을 누르면 메뉴얼 페이지로 이동한다.
        manualbtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(true);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);

            }
        }   );
        //뒤로가기 버튼을 누르면 시작페이지로 돌아간다.
        manubehindbtn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);

            }
        }   );

        /*두번째 페이지(비회원 검색페이지)*/

        // 뒤로가기를 누르면 처음 화면으로 넘어간다.
        btnbehind2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );


        btnnextpage2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (foodname.equals("")&&checkenter==1) { //없는 단어를 입력하였을경우
                    JOptionPane.showMessageDialog(null, textField.getText() + " 은(는) 존재하지 않습니다.\n다시 검색해 주세요.");
                }
                else if (checkenter==0){ // enter를 누르지 않고 다음페이지를 넘어가려고 할 경우
                    JOptionPane.showMessageDialog(null, "Enter 후 검색어를 선택해주세요.");
                }
                else {
                    GetInfo getInfo_1 = new GetInfo(foodname);
                    lblNewLabel_8.setIcon(new ImageIcon(getInfo_1.resizeImage));

                    String allergy_code = "";
                    if(secpage_Checkbox_메밀.isSelected())
                        allergy_code += "01, ";
                    if(secpage_Checkbox_밀.isSelected())
                        allergy_code += "02, ";
                    if(secpage_Checkbox_대두.isSelected())
                        allergy_code += "03, ";
                    if(secpage_Checkbox_호두.isSelected())
                        allergy_code += "04, ";
                    if(secpage_Checkbox_땅콩.isSelected())
                        allergy_code += "05, ";
                    if(secpage_Checkbox_복숭아.isSelected())
                        allergy_code += "06, ";
                    if(secpage_Checkbox_고등어.isSelected())
                        allergy_code += "07, ";
                    if(secpage_Checkbox_토마토.isSelected())
                        allergy_code += "08, ";
                    if(secpage_Checkbox_돼지고기.isSelected())
                        allergy_code += "09, ";
                    if(secpage_Checkbox_소고기.isSelected())
                        allergy_code += "10, ";
                    if(secpage_Checkbox_닭고기.isSelected())
                        allergy_code += "11, ";
                    if(secpage_Checkbox_난류.isSelected())
                        allergy_code += "12, ";
                    if(secpage_Checkbox_조개류.isSelected())
                        allergy_code += "13, ";
                    if(secpage_Checkbox_우유.isSelected())
                        allergy_code += "14, ";
                    if(secpage_Checkbox_새우.isSelected())
                        allergy_code += "15, ";
                    if(secpage_Checkbox_게.isSelected())
                        allergy_code += "16, ";
                    if(secpage_Checkbox_오징어.isSelected())
                        allergy_code += "17, ";
                    if(secpage_Checkbox_아황산.isSelected())
                        allergy_code += "18, ";
                    if(secpage_Checkbox_없음.isSelected())
                        allergy_code = "";

                    try {
                        CheckAllergy ca = new CheckAllergy(foodname,allergy_code);
                        if(ca.flag == 0){
                            result = username + "님은 " + foodname + "(을)를 먹을 수 있습니다.";
                            if(result.length() > 50)
                                result = "사용자 님은 이 음식(을)를 먹을 수 있습니다.";
                        }
                        else{
                            result = username + "님은 " + foodname + "(을)를 먹을 수 없습니다.";
                            if(result.length() > 50)
                                result = "사용자 님은 이 음식(을)를 먹을 수 없습니다.";
                        }
                        lblNewLabel_8_1_1.setText(result);

                        String info = ""; // 식품명, 재료, 알러지 정보를 담을 변수
                        info += "<html><b>제품명:</b> " + foodname + "<br><b>재료:</b> " + ca.ingredient + "<br>"; // 제품명, 재료 추가

                        //알러지 정보 추가
                        info += "<b>알러지 정보:</b> ";
                        int k = 0;
                        if(!ca.same_allergy.isEmpty()){ // 사용자와 해당 음식에 같은 알러지 정보가 존재하면
                            for(int i=0;i<ca.all_allergy.size();i++){
                                // 해당 음식의 알러지 정보를 출력하는데 같은 알러지는 빨간색으로 표시
                                if(ca.all_allergy.get(i).equals(ca.same_allergy.get(k))){
                                    info += "<font color=\"red\"><b> " + ca.all_allergy.get(i) + "</b></font>, ";
                                    if(k<ca.same_allergy.size()-1)
                                        k++;
                                }
                                else
                                    info += ca.all_allergy.get(i) + ", ";
                            }
                        }
                        else{ // 사용자와 해당 음식에 같은 알러지 정보가 존재하지 않으면
                            for(int i=0;i<ca.all_allergy.size();i++){
                                // 해당 음식의 알러지 정보를 출력
                                info += ca.all_allergy.get(i) + ", ";
                            }
                        }
                        info = info.substring(0,info.length()-2); // 마지막 콤마 제거
                        info += "</html>";
                        textPane_1_2.setText(info);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    secpage.setVisible(false);
                    Msecpage.setVisible(false);
                    startpage.setVisible(false);
                    thridpage.setVisible(true);
                    thirdpage_member.setVisible(false);
                    endpage.setVisible(false);
                    login.setVisible(false);
                    signup.setVisible(false);
                    findpass.setVisible(false);
                    manualpage.setVisible(false);
                    explanpage.setVisible(false);
                    explanpage1.setVisible(false);

                }
                checkenter=0;
            }
        }   );

        /*회원 검색페이지*/
        btnbehind2_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(true);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );


        btnnextpage2_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (foodname_1.equals("")&&checkenter_1==1) {
                    JOptionPane.showMessageDialog(null, textField_1.getText() + " 은(는) 존재하지 않습니다.\n다시 검색해 주세요.");
                }
                else if (checkenter_1==0){
                    JOptionPane.showMessageDialog(null, "Enter 후 검색어를 선택해주세요.");
                }else
                {
                    GetInfo getInfo_1 = new GetInfo(foodname_1);
                    lblNewLabel_8_2.setIcon(new ImageIcon(getInfo_1.resizeImage));

                    try {
                        CheckAllergyMember cam = new CheckAllergyMember(foodname_1,username);
                        if(cam.flag == 0){
                            result = username + "님은 " + foodname_1 + "(을)를 먹을 수 있습니다.";
                            if(result.length() > 50)
                                result = "사용자 님은 이 음식(을)를 먹을 수 있습니다.";
                        }
                        else{
                            result = username + "님은 " + foodname_1 + "(을)를 먹을 수 없습니다.";
                            if(result.length() > 50)
                                result = "사용자 님은 이 음식(을)를 먹을 수 없습니다.";
                        }
                        lblNewLabel_8_2_1.setText(result);

                        String info = ""; // 식품명, 재료, 알러지 정보를 담을 변수
                        info += "<html><b>제품명:</b> " + foodname_1 + "<br><b>재료:</b> " + cam.ingredient + "<br>"; // 제품명, 재료 추가

                        //알러지 정보 추가
                        info += "<b>알러지 정보:</b> ";
                        int k = 0;
                        if(!cam.same_allergy.isEmpty()){ // 사용자와 해당 음식에 같은 알러지 정보가 존재하면
                            for(int i=0;i<cam.all_allergy.size();i++){
                                // 해당 음식의 알러지 정보를 출력하는데 같은 알러지는 빨간색으로 표시
                                if(cam.all_allergy.get(i).equals(cam.same_allergy.get(k))){
                                    info += "<font color=\"red\"><b> " + cam.all_allergy.get(i) + "</b></font>, ";
                                    if(k<cam.same_allergy.size()-1)
                                        k++;
                                }
                                else
                                    info += cam.all_allergy.get(i) + ", ";
                            }
                        }
                        else{ // 사용자와 해당 음식에 같은 알러지 정보가 존재하지 않으면
                            for(int i=0;i<cam.all_allergy.size();i++){
                                // 해당 음식의 알러지 정보를 출력
                                info += cam.all_allergy.get(i) + ", ";
                            }
                        }
                        info = info.substring(0,info.length()-2); // 마지막 콤마 제거
                        info += "</html>";
                        textPane_1.setText(info);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    secpage.setVisible(false);
                    Msecpage.setVisible(false);
                    startpage.setVisible(false);
                    thridpage.setVisible(false);
                    thirdpage_member.setVisible(true);
                    endpage.setVisible(false);
                    login.setVisible(false);
                    signup.setVisible(false);
                    findpass.setVisible(false);
                    manualpage.setVisible(false);
                    explanpage.setVisible(false);
                    explanpage1.setVisible(false);

                }
                checkenter_1=0;
            }
        }   );

        /*세번째 페이지(비회원)*/

        btnbehindpage3.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(true);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                checkenter=1;
                textField.setText(searchfoodname);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }

        }   );


        btnnextpage3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(true);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );

        thridpagemap.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://map.naver.com/v5/search/" + "맛집"+ "?c=14187872.7940069,4387595.8869521,15,0,0,0,dh")); }
                catch (IOException a) { a.printStackTrace(); }
                catch (URISyntaxException a) { a.printStackTrace();
                }
            }
        }   );
        /*세번째 페이지(회원)*/
        btnbehindpage3_1.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(true);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                checkenter_1=1;
                textField_1.setText(searchfoodname_1);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );


        btnnextpage3_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(true);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        }   );

        thridpagemap_1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://map.naver.com/v5/search/" + "맛집"+ "?c=14187872.7940069,4387595.8869521,15,0,0,0,dh")); }
                catch (IOException a) { a.printStackTrace(); }
                catch (URISyntaxException a) { a.printStackTrace();
                }
            }
        }   );

        /*네번째 페이지*/
        btnlastpage.addActionListener(new ActionListener() {//처음으로 돌아간다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        });


        btnEnd.addActionListener(new ActionListener() {				// 나가기 버튼
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        /* 로그인 페이지 */
        login_behind_btn.addActionListener(new ActionListener() {		//처음으로 돌아간다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        });
        go_signup_btn.addActionListener(new ActionListener() {		//회원가입 페이지로 이동한다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(true);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        });

        find_passward_btn.addActionListener(new ActionListener( ) { 	// 비밀번호를 찾으로 이동
            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(true);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        });

        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Login log = new Login(loginID.getText(),loginpassward.getText());
                    if(log.error == 1){ // 입력하지 않은 내용이 있을시
                        JOptionPane.showMessageDialog(null,"입력하지 않은 내용이 있습니다.");
                    }
                    else if(log.error == 2){ // 아이디를 찾을 수 없을시
                        JOptionPane.showMessageDialog(null,"입력한 아이디가 존재하지 않습니다.");
                    }
                    else if(log.error == 3) {// 비밀번호를 찾을 수 없을시
                        JOptionPane.showMessageDialog(null,"입력한 비밀번호가 존재하지 않습니다.");
                    }
                    else{ // 제대로 입력시
                        JOptionPane.showMessageDialog(null,"로그인 완료");
                        username = log.name;
                        NameLocation.setText(username); // 로그인 후 페이지에 회원 이름 출력
                        // 로그인 하면서 적은 내용 제거
                        loginID.setText("");
                        loginpassward.setText("");
                        // 로그인 후 페이지로 전환
                        secpage.setVisible(false);
                        Msecpage.setVisible(true);
                        startpage.setVisible(false);
                        thridpage.setVisible(false);
                        thirdpage_member.setVisible(false);
                        endpage.setVisible(false);
                        login.setVisible(false);
                        signup.setVisible(false);
                        findpass.setVisible(false);
                        manualpage.setVisible(false);
                        explanpage.setVisible(false);
                        explanpage1.setVisible(false);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* 회원가입 페이지 */
        signup_firstpage_btn.addActionListener(new ActionListener() {		//처음으로 돌아간다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        });

        signup_checkid_btn.addActionListener(new ActionListener() {		//중복 확인 버튼이 눌리면

            @Override
            public void actionPerformed(ActionEvent e) {
                try { // CheckID 클래스를 이용해 중복된 ID확인
                    CheckID ci = new CheckID(id.getText());
                    if(ci.error == 1){ // 입력하지 않은 내용이 있을시
                        JOptionPane.showMessageDialog(null,"입력하지 않은 내용이 있습니다.");
                    }
                    else if(ci.error == 2) {// 중복된 아이디가 있을시
                        JOptionPane.showMessageDialog(null,"이미 존재하는 아이디입니다.");
                    }
                    else{ // 중복된 아이디가 없을시
                        JOptionPane.showMessageDialog(null,"사용가능한 아이디입니다.");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        signup_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 선택된 체크박스를 allergy_code로 변환
                String allergy_code = "";
                if(singup_CheckBox_메밀.isSelected())
                    allergy_code += "01, ";
                if(singup_CheckBox_밀.isSelected())
                    allergy_code += "02, ";
                if(singup_CheckBox_대두.isSelected())
                    allergy_code += "03, ";
                if(singup_CheckBox_호두.isSelected())
                    allergy_code += "04, ";
                if(singup_CheckBox_땅콩.isSelected())
                    allergy_code += "05, ";
                if(singup_CheckBox_복숭아.isSelected())
                    allergy_code += "06, ";
                if(singup_CheckBox_고등어.isSelected())
                    allergy_code += "07, ";
                if(singup_CheckBox_토마토.isSelected())
                    allergy_code += "08, ";
                if(singup_CheckBox_돼지고기.isSelected())
                    allergy_code += "09, ";
                if(singup_CheckBox_소고기.isSelected())
                    allergy_code += "10, ";
                if(singup_CheckBox_닭고기.isSelected())
                    allergy_code += "11, ";
                if(singup_CheckBox_난류.isSelected())
                    allergy_code += "12, ";
                if(singup_CheckBox_조개류.isSelected())
                    allergy_code += "13, ";
                if(singup_CheckBox_우유.isSelected())
                    allergy_code += "14, ";
                if(singup_CheckBox_새우.isSelected())
                    allergy_code += "15, ";
                if(singup_CheckBox_게.isSelected())
                    allergy_code += "16, ";
                if(singup_CheckBox_오징어.isSelected())
                    allergy_code += "17, ";
                if(singup_CheckBox_아황산.isSelected())
                    allergy_code += "18, ";
                if(singup_CheckBox_없음.isSelected())
                    allergy_code = "";

                try { // PutUserInfo 클래스를 이용해 회원 정보를 db에 저장
                    PutUserInfo ui = new PutUserInfo(name.getText(),email.getText(),id.getText(),paswward.getText(),hint.getText(),allergy_code);
                    if(ui.error == 1){ // 입력하지 않은 내용이 있을시
                        JOptionPane.showMessageDialog(null,"입력하지 않은 내용이 있습니다.");
                    }
                    else if(ui.error == 2) {// 중복된 아이디 입력시
                        JOptionPane.showMessageDialog(null,"이미 존재하는 아이디입니다.");
                    }
                    else{ // 제대로 입력시
                        JOptionPane.showMessageDialog(null,"회원가입이 완료되었습니다.");
                        // 입력된 정보 제거
                        name.setText("");
                        email.setText("");
                        id.setText("");
                        paswward.setText("");
                        hint.setText("");
                        singup_CheckBox_메밀.setSelected(false);
                        singup_CheckBox_밀.setSelected(false);
                        singup_CheckBox_대두.setSelected(false);
                        singup_CheckBox_호두.setSelected(false);
                        singup_CheckBox_땅콩.setSelected(false);
                        singup_CheckBox_복숭아.setSelected(false);
                        singup_CheckBox_고등어.setSelected(false);
                        singup_CheckBox_토마토.setSelected(false);
                        singup_CheckBox_돼지고기.setSelected(false);
                        singup_CheckBox_소고기.setSelected(false);
                        singup_CheckBox_닭고기.setSelected(false);
                        singup_CheckBox_난류.setSelected(false);
                        singup_CheckBox_조개류.setSelected(false);
                        singup_CheckBox_우유.setSelected(false);
                        singup_CheckBox_새우.setSelected(false);
                        singup_CheckBox_게.setSelected(false);
                        singup_CheckBox_오징어.setSelected(false);
                        singup_CheckBox_아황산.setSelected(false);
                        singup_CheckBox_없음.setSelected(false);
                        // 처음 화면으로 전환
                        secpage.setVisible(false);
                        Msecpage.setVisible(false);
                        startpage.setVisible(true);
                        thridpage.setVisible(false);
                        thirdpage_member.setVisible(false);
                        endpage.setVisible(false);
                        login.setVisible(false);
                        signup.setVisible(false);
                        findpass.setVisible(false);
                        manualpage.setVisible(false);
                        explanpage.setVisible(false);
                        explanpage1.setVisible(false);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        /* 비밀번호 찾기 페이지 */
        findpass_behind_btn.addActionListener(new ActionListener() {		//로그인 화면으로 돌아간다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                Msecpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                thirdpage_member.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(true);
                signup.setVisible(false);
                findpass.setVisible(false);
                manualpage.setVisible(false);
                explanpage.setVisible(false);
                explanpage1.setVisible(false);
            }
        });

        // 비밀번호 찾기 버튼 구현
        findpass_btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Findpw fpw = new Findpw(textField_name.getText(),textField_ID.getText(),textField_Hinit.getText(),textField_Email.getText());
                    if(fpw.error == 1){ // 입력하지 않은 내용이 있을시
                        JOptionPane.showMessageDialog(null,"입력하지 않은 내용이 있습니다.");
                    }
                    else if(fpw.error == 2){ // 입력한 4개의 정보와 동일한 회원정보를 가진 회원이 없으면
                        JOptionPane.showMessageDialog(null,"입력한 회원정보는 존재하지 않습니다.");
                    }
                    else{ // 제대로 입력시
                        JOptionPane.showMessageDialog(null,"비밀번호는 " + fpw.uesrpw + " 입니다.");
                        // 입력된 정보 제거
                        textField_name.setText("");
                        textField_ID.setText("");
                        textField_Hinit.setText("");
                        textField_Email.setText("");
                        // 로그인 페이지로 이동
                        secpage.setVisible(false);
                        Msecpage.setVisible(false);
                        startpage.setVisible(false);
                        thridpage.setVisible(false);
                        thirdpage_member.setVisible(false);
                        endpage.setVisible(false);
                        login.setVisible(true);
                        signup.setVisible(false);
                        findpass.setVisible(false);
                        manualpage.setVisible(false);
                        explanpage.setVisible(false);
                        explanpage1.setVisible(false);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        //검색기능 구현
        //비회원 검색기능
        Action ok = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent arg0) {// 엔터치면 실행되는 부분
                checkenter=1;
                searchfoodname =textField.getText();

                comboBox.removeAllItems();//콤보박스에 저장되어있는 목록 삭제
                foodname ="";

                if(textField.getText().equals("")){
                }
                else {
                    SearchFood sf = new SearchFood(textField.getText()); // SearchFood 클래스를 이용해 입력한 단어가 포함되어있는 상품명을 SearchFood안의 arraylist에 저장한다.
                    for (int i = 0; i < sf.array.size(); i++) {
                        comboBox.addItem(sf.array.get(i));
                    } //SearchFood안의 arraylist에 있는 값을 combobox에 저장한다.
                }
            }
        };
        //회원 검색기능(ok1)
        Action ok1 = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent arg0) {// 엔터치면 실행되는 부분
                checkenter_1=1;
                searchfoodname_1 =textField_1.getText();
                comboBox_1.removeAllItems();
                foodname_1 ="";
                if(textField_1.getText().equals("")){
                }
                else {
                    SearchFood sf = new SearchFood(textField_1.getText());
                    for (int i = 0; i < sf.array.size(); i++) {
                        comboBox_1.addItem(sf.array.get(i));
                    }
                }
            }
        };

        //텍스트박스에서 엔터키 입력시 이벤트처리를 위한 코드
        KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false);
        textField.getInputMap(JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(enter, "ENTER");
        textField.getActionMap().put("ENTER", ok);

        KeyStroke enter1 = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false);
        textField_1.getInputMap(JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(enter1, "ENTER");
        textField_1.getActionMap().put("ENTER", ok1);

        //콤보박스에서 선택된 상품명 foodname에 저장.
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource().equals(comboBox)) {
                    JComboBox cb = (JComboBox) e.getSource();
                    foodname = (String) cb.getSelectedItem();
                } else {
                    foodname = comboBox.getSelectedItem().toString();
                }
            }
        });
        comboBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(comboBox_1)) {
                    JComboBox cb_1 = (JComboBox) e.getSource();
                    foodname_1 = (String) cb_1.getSelectedItem();
                } else {
                    foodname_1 = comboBox_1.getSelectedItem().toString();
                }
            }
        });

    }
}