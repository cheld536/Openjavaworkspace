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
		frame.setBounds(100, 100, 815, 725);						// ȭ�� ũ��
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ���α׷� ������ �ε� ����
		frame.getContentPane().setLayout(null);						// ���̾ƿ� ����
		frame.setLocationRelativeTo(null);							//ȭ�� ���߾ӿ� ���
		
		
		JPanel startpage = new JPanel();
		startpage.setBackground(Color.WHITE);
		startpage.setBounds(0, 0, 799, 686);
		frame.getContentPane().add(startpage);
		startpage.setLayout(null);
		
		JButton btnstart = new JButton("\uC2DC\uC791");
		btnstart.setBounds(502, 403, 164, 62);
		btnstart.setBackground(Color.GREEN);
		btnstart.setFont(new Font("HY������M", Font.PLAIN, 25));
		startpage.add(btnstart);
		
		JButton btnExit = new JButton("\uC885\uB8CC");
		btnExit.setBounds(502, 489, 164, 62);
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("HY������M", Font.PLAIN, 25));
		startpage.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("\uD300\uC7A5 : \uCD5C\uBBFC\uAE30");
		lblNewLabel.setBounds(57, 622, 192, 44);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		startpage.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R\uB7ECG");
		lblNewLabel_1.setBounds(256, 131, 274, 137);
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 62));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		startpage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC870\uC6D0 :     \uAE40\uC724\uD76C                     \uC8FC\uC2DC\uC6D0                        \uD55C\uC9C0\uC131 ");
		lblNewLabel_2.setBounds(291, 630, 375, 29);
		startpage.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- \uC2DD\uD488 \uC54C\uB808\uB974\uAE30 \uD655\uC778 \uD504\uB85C\uADF8\uB7A8  -");
		lblNewLabel_3.setBounds(232, 269, 342, 29);
		lblNewLabel_3.setFont(new Font("HY�߰��", Font.PLAIN, 19));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		startpage.add(lblNewLabel_3);
		
		JButton btnaddcs = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnaddcs.setBounds(171, 489, 164, 62);
		btnaddcs.setFont(new Font("HY������M", Font.PLAIN, 25));
		btnaddcs.setBackground(SystemColor.activeCaption);
		startpage.add(btnaddcs);
		
		JButton btnlongin = new JButton("\uB85C\uADF8\uC778");
		btnlongin.setBounds(171, 403, 164, 62);
		btnlongin.setFont(new Font("HY������M", Font.PLAIN, 25));
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
		
		JCheckBox secpage_Checkbox_�޹� = new JCheckBox("\uBA54\uBC00");
		secpage_Checkbox_�޹�.setBounds(43, 133, 115, 23);
		secpage.add(secpage_Checkbox_�޹�);
		
		JCheckBox secpage_Checkbox_�� = new JCheckBox("\uBC00");
		secpage_Checkbox_��.setBounds(162, 133, 115, 23);
		secpage.add(secpage_Checkbox_��);
		
		JCheckBox secpage_Checkbox_��� = new JCheckBox("\uB300\uB450");
		secpage_Checkbox_���.setBounds(281, 133, 115, 23);
		secpage.add(secpage_Checkbox_���);
		
		JCheckBox secpage_Checkbox_ȣ�� = new JCheckBox("\uD638\uB450");
		secpage_Checkbox_ȣ��.setBounds(400, 133, 115, 23);
		secpage.add(secpage_Checkbox_ȣ��);
		
		JCheckBox secpage_Checkbox_���� = new JCheckBox("\uB545\uCF69");
		secpage_Checkbox_����.setBounds(519, 133, 115, 23);
		secpage.add(secpage_Checkbox_����);
		
		JCheckBox secpage_Checkbox_������ = new JCheckBox("\uBCF5\uC22D\uC544");
		secpage_Checkbox_������.setBounds(638, 133, 115, 23);
		secpage.add(secpage_Checkbox_������);
		
		JCheckBox secpage_Checkbox_���� = new JCheckBox("\uACE0\uB4F1\uC5B4");
		secpage_Checkbox_����.setBounds(43, 158, 115, 23);
		secpage.add(secpage_Checkbox_����);
		
		JCheckBox secpage_Checkbox_�丶�� = new JCheckBox("\uD1A0\uB9C8\uD1A0");
		secpage_Checkbox_�丶��.setBounds(162, 158, 115, 23);
		secpage.add(secpage_Checkbox_�丶��);
		
		JCheckBox secpage_Checkbox_������� = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
		secpage_Checkbox_�������.setBounds(281, 158, 115, 23);
		secpage.add(secpage_Checkbox_�������);
		
		JCheckBox secpage_Checkbox_�Ұ�� = new JCheckBox("\uC18C\uACE0\uAE30");
		secpage_Checkbox_�Ұ��.setBounds(400, 158, 115, 23);
		secpage.add(secpage_Checkbox_�Ұ��);
		
		JCheckBox secpage_Checkbox_�߰�� = new JCheckBox("\uB2ED\uACE0\uAE30");
		secpage_Checkbox_�߰��.setBounds(519, 158, 115, 23);
		secpage.add(secpage_Checkbox_�߰��);
		
		JCheckBox secpage_Checkbox_���� = new JCheckBox("\uB09C\uB958");
		secpage_Checkbox_����.setBounds(638, 158, 115, 23);
		secpage.add(secpage_Checkbox_����);
		
		JCheckBox secpage_Checkbox_������ = new JCheckBox("\uC870\uAC1C\uB958");
		secpage_Checkbox_������.setBounds(43, 183, 115, 23);
		secpage.add(secpage_Checkbox_������);
		
		JCheckBox secpage_Checkbox_���� = new JCheckBox("\uC6B0\uC720");
		secpage_Checkbox_����.setBounds(162, 183, 115, 23);
		secpage.add(secpage_Checkbox_����);
		
		JCheckBox secpage_Checkbox_���� = new JCheckBox("\uC0C8\uC6B0");
		secpage_Checkbox_����.setBounds(281, 183, 115, 23);
		secpage.add(secpage_Checkbox_����);
		
		JCheckBox secpage_Checkbox_�� = new JCheckBox("\uAC8C");
		secpage_Checkbox_��.setBounds(400, 183, 115, 23);
		secpage.add(secpage_Checkbox_��);
		
		JCheckBox secpage_Checkbox_��¡�� = new JCheckBox("\uC624\uC9D5\uC5B4");
		secpage_Checkbox_��¡��.setBounds(519, 183, 115, 23);
		secpage.add(secpage_Checkbox_��¡��);
		
		JCheckBox secpage_Checkbox_��Ȳ�� = new JCheckBox("\uC544\uD669\uC0B0\uD3EC\uD568\uC2DD\uD488");
		secpage_Checkbox_��Ȳ��.setBounds(638, 183, 115, 23);
		secpage.add(secpage_Checkbox_��Ȳ��);
		
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
		lblNewLabel_5.setFont(new Font("����", Font.BOLD, 14));
		lblNewLabel_5.setBounds(43, 104, 285, 23);
		secpage.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("\u203B\uBCF8\uC778\uC774 \uC54C\uB7EC\uC9C0\uAC00 \uC5C6\uB2E4\uBA74 \uC5C6\uC74C\uC744 \uCCB4\uD06C\uD574\uC8FC\uC138\uC694.");
		lblNewLabel_5_1.setFont(new Font("����", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(43, 244, 394, 23);
		secpage.add(lblNewLabel_5_1);
		
		JCheckBox secpage_Checkbox_���� = new JCheckBox("\uC5C6\uC74C");
		secpage_Checkbox_����.setBounds(43, 273, 115, 23);
		secpage.add(secpage_Checkbox_����);
		
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
		lblNewLabel_8.setFont(new Font("���� ���", Font.PLAIN, 19));
		lblNewLabel_8.setBounds(38, 119, 336, 23);
		thridpage.add(lblNewLabel_8);
		
		JPanel endpage = new JPanel();
		endpage.setBackground(Color.WHITE);
		endpage.setBounds(0, 0, 799, 686);
		frame.getContentPane().add(endpage);
		endpage.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("\uAC10\uC0AC\uD569\uB2C8\uB2E4.");
		lblNewLabel_7.setFont(new Font("���� ���", Font.BOLD, 63));
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
		loginbtn.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
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
		find_passward_btn.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		find_passward_btn.setBounds(396, 383, 127, 23);
		login.add(find_passward_btn);
		
		JButton go_signup_btn = new JButton("\uD68C\uC6D0\uAC00\uC785");
		go_signup_btn.setBackground(Color.LIGHT_GRAY);
		go_signup_btn.setForeground(Color.WHITE);
		go_signup_btn.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		go_signup_btn.setBounds(257, 383, 127, 23);
		login.add(go_signup_btn);
		
		JButton login_behind_btn = new JButton("\u2190Behind");
		login_behind_btn.setFont(new Font("�޸տ�ü", Font.PLAIN, 12));
		login_behind_btn.setBounds(12, 634, 101, 23);
		login.add(login_behind_btn);
		
		JPanel signup = new JPanel();
		signup.setLayout(null);
		signup.setBounds(0, 0, 799, 686);
		frame.getContentPane().add(signup);
		
		JButton signup_btn = new JButton("\uD68C\uC6D0\uAC00\uC785\uD558\uAE30");
		signup_btn.setForeground(Color.WHITE);
		signup_btn.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		signup_btn.setBackground(Color.GRAY);
		signup_btn.setBounds(257, 465, 266, 35);
		signup.add(signup_btn);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(332, 391, 191, 27);
		signup.add(id);
		
		paswward = new JTextField();
		paswward.setColumns(10);
		paswward.setBounds(332, 428, 191, 27);
		signup.add(paswward);
		
		JLabel lblNewLabel_9_2 = new JLabel("ID");
		lblNewLabel_9_2.setFont(new Font("AcmeFont", Font.PLAIN, 12));
		lblNewLabel_9_2.setBounds(257, 394, 63, 21);
		signup.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Passward");
		lblNewLabel_9_1_1.setFont(new Font("AcmeFont", Font.PLAIN, 12));
		lblNewLabel_9_1_1.setBounds(257, 431, 63, 21);
		signup.add(lblNewLabel_9_1_1);
		
		JButton signup_firstpage_btn = new JButton("\u2190firstpage");
		signup_firstpage_btn.setFont(new Font("�޸տ�ü", Font.PLAIN, 12));
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
		
		JCheckBox singup_CheckBox_�޹� = new JCheckBox("\uBA54\uBC00");
		singup_CheckBox_�޹�.setBounds(47, 124, 115, 23);
		signup.add(singup_CheckBox_�޹�);
		
		JCheckBox singup_CheckBox_�� = new JCheckBox("\uBC00");
		singup_CheckBox_��.setBounds(166, 124, 115, 23);
		signup.add(singup_CheckBox_��);
		
		JCheckBox singup_CheckBox_��� = new JCheckBox("\uB300\uB450");
		singup_CheckBox_���.setBounds(285, 124, 115, 23);
		signup.add(singup_CheckBox_���);
		
		JCheckBox singup_CheckBox_ȣ�� = new JCheckBox("\uD638\uB450");
		singup_CheckBox_ȣ��.setBounds(408, 124, 115, 23);
		signup.add(singup_CheckBox_ȣ��);
		
		JCheckBox singup_CheckBox_���� = new JCheckBox("\uB545\uCF69");
		singup_CheckBox_����.setBounds(530, 124, 115, 23);
		signup.add(singup_CheckBox_����);
		
		JCheckBox singup_CheckBox_������ = new JCheckBox("\uBCF5\uC22D\uC544");
		singup_CheckBox_������.setBounds(649, 124, 115, 23);
		signup.add(singup_CheckBox_������);
		
		JCheckBox singup_CheckBox_���� = new JCheckBox("\uACE0\uB4F1\uC5B4");
		singup_CheckBox_����.setBounds(47, 149, 115, 23);
		signup.add(singup_CheckBox_����);
		
		JCheckBox singup_CheckBox_�丶�� = new JCheckBox("\uD1A0\uB9C8\uD1A0");
		singup_CheckBox_�丶��.setBounds(166, 149, 115, 23);
		signup.add(singup_CheckBox_�丶��);
		
		JCheckBox singup_CheckBox_������� = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
		singup_CheckBox_�������.setBounds(285, 149, 115, 23);
		signup.add(singup_CheckBox_�������);
		
		JCheckBox singup_CheckBox_�Ұ�� = new JCheckBox("\uC18C\uACE0\uAE30");
		singup_CheckBox_�Ұ��.setBounds(408, 149, 115, 23);
		signup.add(singup_CheckBox_�Ұ��);
		
		JCheckBox singup_CheckBox_�߰�� = new JCheckBox("\uB2ED\uACE0\uAE30");
		singup_CheckBox_�߰��.setBounds(530, 149, 115, 23);
		signup.add(singup_CheckBox_�߰��);
		
		JCheckBox singup_CheckBox_���� = new JCheckBox("\uB09C\uB958");
		singup_CheckBox_����.setBounds(649, 149, 115, 23);
		signup.add(singup_CheckBox_����);
		
		JCheckBox singup_CheckBox_������ = new JCheckBox("\uC870\uAC1C\uB958");
		singup_CheckBox_������.setBounds(47, 174, 115, 23);
		signup.add(singup_CheckBox_������);
		
		JCheckBox singup_CheckBox_���� = new JCheckBox("\uC6B0\uC720");
		singup_CheckBox_����.setBounds(166, 174, 115, 23);
		signup.add(singup_CheckBox_����);
		
		JCheckBox singup_CheckBox_���� = new JCheckBox("\uC0C8\uC6B0");
		singup_CheckBox_����.setBounds(285, 174, 115, 23);
		signup.add(singup_CheckBox_����);
		
		JCheckBox singup_CheckBox_�� = new JCheckBox("\uAC8C");
		singup_CheckBox_��.setBounds(408, 174, 115, 23);
		signup.add(singup_CheckBox_��);
		
		JCheckBox singup_CheckBox_��¡�� = new JCheckBox("\uC624\uC9D5\uC5B4");
		singup_CheckBox_��¡��.setBounds(530, 174, 115, 23);
		signup.add(singup_CheckBox_��¡��);
		
		JCheckBox singup_CheckBox_��Ȳ�� = new JCheckBox("\uC544\uD669\uC0B0\uD3EC\uD568\uC2DD\uD488");
		singup_CheckBox_��Ȳ��.setBounds(649, 174, 115, 23);
		signup.add(singup_CheckBox_��Ȳ��);
		
		JCheckBox singup_CheckBox_���� = new JCheckBox("\uC5C6\uC74C");
		singup_CheckBox_����.setBounds(47, 242, 115, 23);
		signup.add(singup_CheckBox_����);
		
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
		findpass_btn_1.setFont(new Font("�޸յձ�������", Font.PLAIN, 12));
		findpass_btn_1.setBackground(Color.GRAY);
		findpass_btn_1.setBounds(257, 407, 266, 35);
		findpass.add(findpass_btn_1);
		
		JButton findpass_behind_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		findpass_behind_btn.setBounds(24, 634, 97, 23);
		findpass.add(findpass_behind_btn);
	
		
	
		/* ó�� ȭ�� ���̱� ����*/
		
		secpage.setVisible(false);     //ó�� ȭ�� �� �����ֱ� ���� �ι�° �������� ������ �ʰ� �����Ѵ�.
		thridpage.setVisible(false);
		endpage.setVisible(false);
		login.setVisible(false);
		signup.setVisible(false);
		findpass.setVisible(false);
		
		
		/*ù��° ������ */
		
		// ��ŸƮ ��ư�� �Է��� �Ǹ� ���� ȭ������ �Ѿ��.
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
		
		//�α��� ��ư�� �Է��� �Ǹ� �α��� ȭ������ �̵��Ѵ�.
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
		
		//ȸ������ ��ư�� �Է��� �Ǹ� ȸ������ ȭ������ �̵��Ѵ�.
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
		
		
		// ���� ��ư�� ������ ���α׷� ���� 
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
			});

		/*�ι�° ������*/
		
		// �ڷΰ��⸦ ������ ó�� ȭ������ �Ѿ��.
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
		
		
		
		
		/*����° ������*/

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
		
		
		/*�׹�° ������*/
	btnlastpage.addActionListener(new ActionListener() {//ó������ ���ư���.
		
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
			
	
	btnEnd.addActionListener(new ActionListener() {				// ������ ��ư
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
		}
		});
		
	
	/* �α��� ������ */
	login_behind_btn.addActionListener(new ActionListener() {		//ó������ ���ư���.
		
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
	go_signup_btn.addActionListener(new ActionListener() {		//ȸ������ �������� �̵��Ѵ�.
		
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
	
	find_passward_btn.addActionListener(new ActionListener( ) { 	// ��й�ȣ�� ã���� �̵�
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
	
	
	/* ȸ������ ������ */
	signup_firstpage_btn.addActionListener(new ActionListener() {		//ó������ ���ư���.
		
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
	
	/* ��й�ȣ ã�� ������ */
	findpass_behind_btn.addActionListener(new ActionListener() {		//�α��� ȭ������ ���ư���.
		
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
	}
}