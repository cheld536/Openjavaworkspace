import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import java.awt.SystemColor;

public class sec {

	private JFrame frame;
	private JTextField textField;
	private JTextField loginID;
	private JTextField loginpassward;
	private JTextField id;
	private JTextField paswward;
	private JTextField email;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sec window = new sec();
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
	public sec() {
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
		btnstart.setBounds(513, 403, 164, 62);
		btnstart.setBackground(Color.GREEN);
		btnstart.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		startpage.add(btnstart);
		
		JButton btnExit = new JButton("\uC885\uB8CC");
		btnExit.setBounds(513, 489, 164, 62);
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		startpage.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("\uD300\uC7A5 : \uCD5C\uBBFC\uAE30");
		lblNewLabel.setBounds(28, 622, 192, 44);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startpage.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R\uB7ECG");
		lblNewLabel_1.setBounds(253, 134, 274, 137);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 62));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		startpage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC870\uC6D0 :     \uAE40\uC724\uD76C                     \uC8FC\uC2DC\uC6D0                        \uD55C\uC9C0\uC131 ");
		lblNewLabel_2.setBounds(232, 630, 375, 29);
		startpage.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- \uC2DD\uD488 \uC54C\uB808\uB974\uAE30 \uD655\uC778 \uD504\uB85C\uADF8\uB7A8  -");
		lblNewLabel_3.setBounds(232, 267, 330, 29);
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\uBA54\uBC00");
		chckbxNewCheckBox.setBounds(43, 102, 115, 23);
		secpage.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\uBC00");
		chckbxNewCheckBox_1.setBounds(162, 102, 115, 23);
		secpage.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("\uB300\uB450");
		chckbxNewCheckBox_1_1.setBounds(281, 102, 115, 23);
		secpage.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("\uD638\uB450");
		chckbxNewCheckBox_1_2.setBounds(400, 102, 115, 23);
		secpage.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("\uB545\uCF69");
		chckbxNewCheckBox_1_3.setBounds(519, 102, 115, 23);
		secpage.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("\uBCF5\uC22D\uC544");
		chckbxNewCheckBox_1_4.setBounds(638, 102, 115, 23);
		secpage.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("\uACE0\uB4F1\uC5B4");
		chckbxNewCheckBox_1_5.setBounds(43, 127, 115, 23);
		secpage.add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("\uD1A0\uB9C8\uD1A0");
		chckbxNewCheckBox_1_6.setBounds(162, 127, 115, 23);
		secpage.add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_1_7 = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
		chckbxNewCheckBox_1_7.setBounds(281, 127, 115, 23);
		secpage.add(chckbxNewCheckBox_1_7);
		
		JCheckBox chckbxNewCheckBox_1_8 = new JCheckBox("\uC18C\uACE0\uAE30");
		chckbxNewCheckBox_1_8.setBounds(400, 127, 115, 23);
		secpage.add(chckbxNewCheckBox_1_8);
		
		JCheckBox chckbxNewCheckBox_1_9 = new JCheckBox("\uB2ED\uACE0\uAE30");
		chckbxNewCheckBox_1_9.setBounds(519, 127, 115, 23);
		secpage.add(chckbxNewCheckBox_1_9);
		
		JCheckBox chckbxNewCheckBox_1_10 = new JCheckBox("\uB09C\uB958");
		chckbxNewCheckBox_1_10.setBounds(638, 127, 115, 23);
		secpage.add(chckbxNewCheckBox_1_10);
		
		JCheckBox chckbxNewCheckBox_1_11 = new JCheckBox("\uC870\uAC1C\uB958");
		chckbxNewCheckBox_1_11.setBounds(43, 152, 115, 23);
		secpage.add(chckbxNewCheckBox_1_11);
		
		JCheckBox chckbxNewCheckBox_1_12 = new JCheckBox("\uC6B0\uC720");
		chckbxNewCheckBox_1_12.setBounds(162, 152, 115, 23);
		secpage.add(chckbxNewCheckBox_1_12);
		
		JCheckBox chckbxNewCheckBox_1_13 = new JCheckBox("\uC0C8\uC6B0");
		chckbxNewCheckBox_1_13.setBounds(281, 152, 115, 23);
		secpage.add(chckbxNewCheckBox_1_13);
		
		JCheckBox chckbxNewCheckBox_1_14 = new JCheckBox("\uAC8C");
		chckbxNewCheckBox_1_14.setBounds(400, 152, 115, 23);
		secpage.add(chckbxNewCheckBox_1_14);
		
		JCheckBox chckbxNewCheckBox_1_15 = new JCheckBox("\uC624\uC9D5\uC5B4");
		chckbxNewCheckBox_1_15.setBounds(519, 152, 115, 23);
		secpage.add(chckbxNewCheckBox_1_15);
		
		JCheckBox chckbxNewCheckBox_1_16 = new JCheckBox("\uC544\uD669\uC0B0\uD3EC\uD568\uC2DD\uD488");
		chckbxNewCheckBox_1_16.setBounds(638, 152, 115, 23);
		secpage.add(chckbxNewCheckBox_1_16);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\uC120\uD0DD\uB41C \uC74C\uC2DD\uC815\uBCF4");
		textArea.setBounds(52, 293, 636, 300);
		secpage.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(690, 293, 17, 300);
		secpage.add(scrollBar);
		
		textField = new JTextField();
		textField.setBounds(52, 234, 636, 21);
		secpage.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(52, 260, 636, 23);
		secpage.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("\u203B \uC790\uC2E0\uC774 \uAC80\uC0C9\uD558\uACE0\uC790 \uD558\uB294 \uC2DD\uD488\uC744 \uAC80\uC0C9\uD574\uC8FC\uC138\uC694.");
		lblNewLabel_4.setBounds(52, 209, 636, 15);
		secpage.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u203B \uC790\uC2E0\uC774 \uD574\uB2F9\uD558\uB294 \uC54C\uB7EC\uC9C0\uB97C \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_5.setBounds(43, 73, 285, 23);
		secpage.add(lblNewLabel_5);
		
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
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		signup_btn.setBounds(257, 368, 266, 35);
		signup.add(signup_btn);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(332, 289, 191, 27);
		signup.add(id);
		
		paswward = new JTextField();
		paswward.setColumns(10);
		paswward.setBounds(332, 326, 191, 27);
		signup.add(paswward);
		
		JLabel lblNewLabel_9_2 = new JLabel("ID");
		lblNewLabel_9_2.setFont(new Font("AcmeFont", Font.PLAIN, 12));
		lblNewLabel_9_2.setBounds(257, 291, 63, 21);
		signup.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Passward");
		lblNewLabel_9_1_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
		lblNewLabel_9_1_1.setBounds(257, 328, 63, 21);
		signup.add(lblNewLabel_9_1_1);
		
		JButton signup_firstpage_btn = new JButton("\u2190firstpage");
		signup_firstpage_btn.setFont(new Font("휴먼옛체", Font.PLAIN, 12));
		signup_firstpage_btn.setBounds(12, 634, 104, 23);
		signup.add(signup_firstpage_btn);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("E-mail");
		lblNewLabel_9_2_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
		lblNewLabel_9_2_1.setBounds(257, 254, 63, 21);
		signup.add(lblNewLabel_9_2_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(332, 252, 191, 27);
		signup.add(email);
		
		JLabel lblNewLabel_9_2_1_1 = new JLabel("name");
		lblNewLabel_9_2_1_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
		lblNewLabel_9_2_1_1.setBounds(257, 219, 63, 21);
		signup.add(lblNewLabel_9_2_1_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(332, 217, 191, 27);
		signup.add(name);
		
		JTextPane possible_signup = new JTextPane();
		possible_signup.setEnabled(false);
		possible_signup.setBackground(SystemColor.control);
		possible_signup.setBounds(257, 413, 266, 21);
		signup.add(possible_signup);
		signup.setVisible(false);
		
	
		/* 처음 화면 보이기 설정*/
		
		secpage.setVisible(false);     //처음 화면 만 보여주기 위해 두번째 페이지는 보이지 않게 설정한다.
		thridpage.setVisible(false);
		endpage.setVisible(false);
		login.setVisible(false);
		
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
		}
		});
	
	}
}
