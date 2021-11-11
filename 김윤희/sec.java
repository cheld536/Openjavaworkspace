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

public class sec {

	private JFrame frame;
	private JTextField textField;

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
		startpage.setBounds(0, 0, 799, 696);
		frame.getContentPane().add(startpage);
		startpage.setLayout(null);
		
		JButton btnstart = new JButton("\uC2DC\uC791");
		btnstart.setBackground(Color.GREEN);
		btnstart.setFont(new Font("HY헤드라인M", Font.PLAIN, 36));
		btnstart.setBounds(306, 419, 180, 82);
		startpage.add(btnstart);
		
		JButton btnExit = new JButton("\uC885\uB8CC");
		btnExit.setBackground(Color.RED);
		btnExit.setFont(new Font("HY헤드라인M", Font.PLAIN, 25));
		btnExit.setBounds(316, 511, 164, 44);
		startpage.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("\uD300\uC7A5 : \uCD5C\uBBFC\uAE30");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 622, 192, 44);
		startpage.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R\uB7ECG");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 56));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(288, 174, 210, 97);
		startpage.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC870\uC6D0 : \uAE40\uC724\uD76C                     \uC8FC\uC2DC\uC6D0                        \uD55C\uC9C0\uC131 ");
		lblNewLabel_2.setBounds(232, 630, 343, 29);
		startpage.add(lblNewLabel_2);
		
		JPanel secpage = new JPanel();
		secpage.setBounds(0, 0, 799, 686);
		frame.getContentPane().add(secpage);
		secpage.setLayout(null);
		
		JButton btnbehind2 = new JButton("behindpage");
		btnbehind2.setBounds(12, 641, 115, 23);
		secpage.add(btnbehind2);
		
		JButton btnnext2 = new JButton("nextpage");
		btnnext2.setBounds(679, 641, 108, 23);
		secpage.add(btnnext2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(43, 63, 115, 23);
		secpage.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(162, 63, 115, 23);
		secpage.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_1.setBounds(281, 63, 115, 23);
		secpage.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_2.setBounds(400, 63, 115, 23);
		secpage.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_3.setBounds(519, 63, 115, 23);
		secpage.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_4.setBounds(638, 63, 115, 23);
		secpage.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxNewCheckBox_1_5 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_5.setBounds(43, 88, 115, 23);
		secpage.add(chckbxNewCheckBox_1_5);
		
		JCheckBox chckbxNewCheckBox_1_6 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_6.setBounds(162, 88, 115, 23);
		secpage.add(chckbxNewCheckBox_1_6);
		
		JCheckBox chckbxNewCheckBox_1_7 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_7.setBounds(281, 88, 115, 23);
		secpage.add(chckbxNewCheckBox_1_7);
		
		JCheckBox chckbxNewCheckBox_1_8 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_8.setBounds(400, 88, 115, 23);
		secpage.add(chckbxNewCheckBox_1_8);
		
		JCheckBox chckbxNewCheckBox_1_9 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_9.setBounds(519, 88, 115, 23);
		secpage.add(chckbxNewCheckBox_1_9);
		
		JCheckBox chckbxNewCheckBox_1_10 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_10.setBounds(638, 88, 115, 23);
		secpage.add(chckbxNewCheckBox_1_10);
		
		JCheckBox chckbxNewCheckBox_1_11 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_11.setBounds(43, 113, 115, 23);
		secpage.add(chckbxNewCheckBox_1_11);
		
		JCheckBox chckbxNewCheckBox_1_12 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_12.setBounds(162, 113, 115, 23);
		secpage.add(chckbxNewCheckBox_1_12);
		
		JCheckBox chckbxNewCheckBox_1_13 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_13.setBounds(281, 113, 115, 23);
		secpage.add(chckbxNewCheckBox_1_13);
		
		JCheckBox chckbxNewCheckBox_1_14 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_14.setBounds(400, 113, 115, 23);
		secpage.add(chckbxNewCheckBox_1_14);
		
		JCheckBox chckbxNewCheckBox_1_15 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_15.setBounds(519, 113, 115, 23);
		secpage.add(chckbxNewCheckBox_1_15);
		
		JCheckBox chckbxNewCheckBox_1_16 = new JCheckBox("New check box");
		chckbxNewCheckBox_1_16.setBounds(638, 113, 115, 23);
		secpage.add(chckbxNewCheckBox_1_16);
		
		JTextArea textArea = new JTextArea();
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
		
		/* 처음 화면 보이기 설정*/
		
		secpage.setVisible(false);     //처음 화면 만 보여주기 위해 두번째 페이지는 보이지 않게 설정한다.
		
		/*첫번째 페이지 */
		
		// 스타트 버튼이 입력이 되면 다음 화면으로 넘어간다.
		btnstart.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e){
				secpage.setVisible(true);
				startpage.setVisible(false);
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
			}
		}   );
		
		
		
		
		
		
	}
}
