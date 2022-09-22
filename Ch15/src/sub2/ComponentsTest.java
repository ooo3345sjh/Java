package sub2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class ComponentsTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest frame = new ComponentsTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentsTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 10, 206, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("컴포넌트 실습하기");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 10, 169, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Button 컴포넌트");
		lblNewLabel_2.setBounds(22, 41, 102, 21);
		contentPane.add(lblNewLabel_2);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 67, 67, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(111, 67, 67, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "일반대화상자", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(190, 67, 67, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("YES 클릭...");
				} else {
					System.out.println("NO 클릭...");
					
				}
			}
		});
		btn4.setBounds(269, 67, 66, 23);
		contentPane.add(btn4);
		
		JLabel lblNewLabel_3 = new JLabel("TextField 컴포넌트");
		lblNewLabel_3.setBounds(22, 110, 124, 15);
		contentPane.add(lblNewLabel_3);
		
		txtf1 = new JTextField();
		txtf1.setBounds(32, 135, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(32, 161, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(32, 185, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lblTxtf1Reusult = new JLabel("결과 :");
		lblTxtf1Reusult.setBounds(265, 138, 57, 15);
		contentPane.add(lblTxtf1Reusult);
		
		JLabel lblTxtf2Reusult = new JLabel("결과 :");
		lblTxtf2Reusult.setBounds(265, 164, 57, 15);
		contentPane.add(lblTxtf2Reusult);
		
		JLabel lblTxtf3Reusult = new JLabel("결과 :");
		lblTxtf3Reusult.setBounds(265, 188, 57, 15);
		contentPane.add(lblTxtf3Reusult);
		JButton btnTxtf1 = new JButton("확인");
		
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Reusult.setText("결과 : " + txt);
			}
		});
		btnTxtf1.setBounds(160, 134, 97, 23);
		contentPane.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf2.getText();
				lblTxtf2Reusult.setText("결과 : " + txt);
			}
		});
		btnTxtf2.setBounds(160, 160, 97, 23);
		contentPane.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf3.getText();
				lblTxtf3Reusult.setText("결과 : " + txt);				
			}
		});
		btnTxtf3.setBounds(160, 184, 97, 23);
		contentPane.add(btnTxtf3);
		
		JLabel lblNewLabel_4 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_4.setBounds(22, 232, 159, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("취미를 고르세요.");
		lblNewLabel_5.setBounds(32, 252, 114, 15);
		contentPane.add(lblNewLabel_5);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(32, 273, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(89, 273, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("독서");
		chk3.setBounds(150, 273, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("운동");
		chk4.setBounds(211, 273, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("게임");
		chk5.setBounds(269, 273, 57, 23);
		contentPane.add(chk5);

		JLabel lblChkResult = new JLabel("결과 : ");
		lblChkResult.setBounds(32, 302, 347, 15);
		contentPane.add(lblChkResult);
		
		JButton btnChk = new JButton("확인");
		btnChk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if(chk1.isSelected()) {
					list.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					list.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					list.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					list.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					list.add(chk5.getText());
				}
				
				lblChkResult.setText("결과 : " + list);
				
			}
		});
		btnChk.setBounds(333, 273, 67, 23);
		contentPane.add(btnChk);
		
		JLabel lblNewLabel_6 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_6.setBounds(23, 327, 234, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblRbResult = new JLabel("결과 :");
		lblRbResult.setBounds(37, 373, 290, 15);
		contentPane.add(lblRbResult);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(32, 344, 62, 23);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(100, 344, 57, 23);
		contentPane.add(rbFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		JButton btnRb = new JButton("확인");
		btnRb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if(rbMale.isSelected() && !rbFemale.isSelected()) {
					list.add(rbMale.getText());
				}
				if(!rbMale.isSelected() && rbFemale.isSelected()) {
					list.add(rbFemale.getText());
				}
				
				lblRbResult.setText("결과 : " + list);
				
			}
		});
		btnRb.setBounds(174, 344, 71, 23);
		contentPane.add(btnRb);
		
		
	}
}
