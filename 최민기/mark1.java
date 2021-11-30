import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

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


        JPanel startpage = new JPanel();
        startpage.setBackground(Color.WHITE);
        startpage.setBounds(0, 0, 799, 686);
        frame.getContentPane().add(startpage);
        startpage.setLayout(null);

        JButton btnstart = new JButton("\uC2DC\uC791");
        btnstart.setBounds(502, 403, 164, 62);
        btnstart.setBackground(Color.GREEN);
        btnstart.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        startpage.add(btnstart);

        JButton btnExit = new JButton("\uC885\uB8CC");
        btnExit.setBounds(502, 489, 164, 62);
        btnExit.setBackground(Color.RED);
        btnExit.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        startpage.add(btnExit);

        JLabel lblNewLabel = new JLabel("\uD300\uC7A5 : \uCD5C\uBBFC\uAE30");
        lblNewLabel.setBounds(57, 622, 192, 44);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startpage.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("R\uB7ECG");
        lblNewLabel_1.setBounds(256, 131, 274, 137);
        lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 62));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        startpage.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\uC870\uC6D0 :     \uAE40\uC724\uD76C                     \uC8FC\uC2DC\uC6D0                        \uD55C\uC9C0\uC131 ");
        lblNewLabel_2.setBounds(291, 630, 375, 29);
        startpage.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("- \uC2DD\uD488 \uC54C\uB808\uB974\uAE30 \uD655\uC778 \uD504\uB85C\uADF8\uB7A8  -");
        lblNewLabel_3.setBounds(232, 269, 342, 29);
        lblNewLabel_3.setFont(new Font("HY견고딕", Font.PLAIN, 19));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        startpage.add(lblNewLabel_3);

        JButton btnaddcs = new JButton("\uD68C\uC6D0\uAC00\uC785");
        btnaddcs.setBounds(171, 489, 164, 62);
        btnaddcs.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        btnaddcs.setBackground(SystemColor.activeCaption);
        startpage.add(btnaddcs);

        JButton btnlongin = new JButton("\uB85C\uADF8\uC778");
        btnlongin.setBounds(171, 403, 164, 62);
        btnlongin.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
        btnlongin.setBackground(SystemColor.textHighlight);
        startpage.add(btnlongin);


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

        JTextPane textPane = new JTextPane();
        textPane.setBounds(185, 168, 602, 370);
        thridpage.add(textPane);

        JLabel lblNewLabel_6 = new JLabel("\uC0AC\uC9C4 \uB4E4\uC5B4\uAC08\uACF3");
        lblNewLabel_6.setBounds(38, 257, 118, 147);
        thridpage.add(lblNewLabel_6);

        JLabel lblNewLabel_8 = new JLabel("\uAC80\uC0C9\uD55C \uC74C\uC2DD\uC758 \uAC80\uC0C9 \uACB0\uACFC\uC785\uB2C8\uB2E4.");
        lblNewLabel_8.setFont(new Font("맑은 고딕", Font.PLAIN, 19));
        lblNewLabel_8.setBounds(38, 119, 336, 23);
        thridpage.add(lblNewLabel_8);

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

        JButton btnEnd = new JButton("Exit");
        btnEnd.setBackground(Color.RED);
        btnEnd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnEnd.setBounds(412, 393, 110, 58);
        endpage.add(btnEnd);

        JButton btnlastpage = new JButton("\uB418\uB3CC\uC544\uAC00\uAE30");
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

        JTextPane possible_signup = new JTextPane();
        possible_signup.setEnabled(false);
        possible_signup.setBackground(SystemColor.control);
        possible_signup.setBounds(257, 413, 266, 21);
        signup.add(possible_signup);

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

        secpage.setVisible(false);     //처음 화면 만 보여주기 위해 두번째 페이지는 보이지 않게 설정한다.
        thridpage.setVisible(false);
        endpage.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
        findpass.setVisible(false);


        /*첫번째 페이지 */

        // 스타트 버튼이 입력이 되면 다음 화면으로 넘어간다.
        btnstart.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(true);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);

            }
        }   );

        //로그인 버튼이 입력이 되면 로그인 화면으로 이동한다.
        btnlongin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(true);
                signup.setVisible(false);
                findpass.setVisible(false);

            }
        }   );

        //회원가입 버튼이 입력이 되면 회원가입 화면으로 이동한다.
        btnaddcs.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(true);
                findpass.setVisible(false);

            }
        }   );


        // 종료 버튼을 누르면 프로그램 종료
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        /*두번째 페이지*/

        // 뒤로가기를 누르면 처음 화면으로 넘어간다.
        btnbehind2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
            }
        }   );


        btnnextpage2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(true);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
            }
        }   );




        /*세번째 페이지*/

        btnbehindpage3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(true);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
            }
        }   );


        btnnextpage3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                secpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(true);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
            }
        }   );


        /*네번째 페이지*/
        btnlastpage.addActionListener(new ActionListener() {//처음으로 돌아간다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                startpage.setVisible(true);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
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
                startpage.setVisible(true);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
            }
        });
        go_signup_btn.addActionListener(new ActionListener() {		//회원가입 페이지로 이동한다.

            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(true);
                findpass.setVisible(false);
            }
        });

        find_passward_btn.addActionListener(new ActionListener( ) { 	// 비밀번호를 찾으로 이동
            @Override
            public void actionPerformed(ActionEvent e) {
                secpage.setVisible(false);
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(true);
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
                        secpage.setVisible(true);
                        startpage.setVisible(false);
                        thridpage.setVisible(false);
                        endpage.setVisible(false);
                        login.setVisible(false);
                        signup.setVisible(false);
                        findpass.setVisible(false);
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
                startpage.setVisible(true);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(false);
                signup.setVisible(false);
                findpass.setVisible(false);
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
                        secpage.setVisible(false);
                        startpage.setVisible(true);
                        thridpage.setVisible(false);
                        endpage.setVisible(false);
                        login.setVisible(false);
                        signup.setVisible(false);
                        findpass.setVisible(false);
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
                startpage.setVisible(false);
                thridpage.setVisible(false);
                endpage.setVisible(false);
                login.setVisible(true);
                signup.setVisible(false);
                findpass.setVisible(false);
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
                        secpage.setVisible(false);
                        startpage.setVisible(false);
                        thridpage.setVisible(false);
                        endpage.setVisible(false);
                        login.setVisible(true);
                        signup.setVisible(false);
                        findpass.setVisible(false);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
