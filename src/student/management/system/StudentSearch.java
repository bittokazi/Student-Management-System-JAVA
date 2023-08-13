package student.management.system;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Canvas;




public class StudentSearch extends JFrame {
	public static StudentSearch frame;
	private JPanel contentPane;
	private JTextField textField;
	public JLabel label;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSearch frame = new StudentSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void showFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentSearch();
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
	public StudentSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 731, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnPrevious = new JButton("Add Student Info");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				StudentManagement.frame.setVisible(true);
			}
		});
		JLabel lblEnterStudentId = new JLabel("Enter Student ID:");
		
		ImageIcon image = new ImageIcon("photo/default.jpg");
		Image scaleImage = image.getImage().getScaledInstance(180, 180,Image.SCALE_DEFAULT);
		
		ImageIcon icon1 = new ImageIcon(scaleImage);
		panel_1 = new JPanel(new BorderLayout());
		
		final JLabel lblName_1 = new JLabel("Name");
		
		final JLabel lblDob = new JLabel("DOB");
		
		final JLabel lblFname = new  JLabel("fname");
		
		final JLabel lblMname = new JLabel("Mname");
		
		final JLabel lblSex_1 = new JLabel("Sex");
		
		final JLabel lblNationality_1 = new JLabel("nationality");
		
		final JLabel lblReligion_1 = new JLabel("religion");
		
		final JLabel lblBlood = new JLabel("blood");
		
		final JLabel lblSub = new JLabel("sub");
		
		final JLabel lblAd = new JLabel("Ad");
		
		final JLabel lblSid = new JLabel("sid");
		
		final JLabel lblAddress_1 = new JLabel("address");
		
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				//lblNewLabel.setText("");
				String[] sinfo=StudentManagement.data.search(textField.getText());
				/*for(int i=0;i<12;i++) {
					lblNewLabel.setText(lblNewLabel.getText()+"\n"+sinfo[i]);
				}*/
				
				lblName_1.setText(sinfo[0]);
				lblDob.setText(sinfo[1]);
				lblFname.setText(sinfo[2]);
				lblMname.setText(sinfo[3]);
				lblSex_1.setText(sinfo[4]);
				lblNationality_1.setText(sinfo[5]);
				lblReligion_1.setText(sinfo[6]);
				lblBlood.setText(sinfo[7]);
				lblSub.setText(sinfo[8]);
				lblAd.setText(sinfo[9]);
				lblSid.setText(sinfo[11]);
				lblAddress_1.setText(sinfo[10]);
				
				ImageIcon icon = new ImageIcon("student-photos/"+sinfo[11]+".jpg");
				Image scaleImage = icon.getImage().getScaledInstance(180, 180,Image.SCALE_DEFAULT);
				
				ImageIcon icon1 = new ImageIcon(scaleImage);
				
				
				
				//label = new JLabel("", icon1, JLabel.CENTER);
				icon1.getImage().flush();
				label.setIcon(icon1);
				
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		
		JLabel lblFathersName = new JLabel("Father's Name:");
		
		JLabel lblMothersName = new JLabel("Mother's Name:");
		
		JLabel lblSex = new JLabel("SEX:");
		
		JLabel lblNationality = new JLabel("Nationality:");
		
		JLabel lblReligion = new JLabel("Religion:");
		
		JLabel lblBloodGroup = new JLabel("Blood Group:");
		
		JLabel lblSubject = new JLabel("Subject:");
		
		JLabel lblNewLabel_1 = new JLabel("Admission Date:");
		
		JLabel lblNewLabel_2 = new JLabel("Student ID:");
		
		JLabel lblAddress = new JLabel("Address:");
		
		
		
		
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addComponent(btnPrevious))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAddress)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAddress_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSid))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblAd))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNationality)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNationality_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblReligion)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblReligion_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBloodGroup)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblBlood))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblDateOfBirth)
									.addGap(10)
									.addComponent(lblDob))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblName)
									.addGap(18)
									.addComponent(lblName_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblFathersName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblFname))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblMothersName)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblMname))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSex)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblSex_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblEnterStudentId)
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblSubject)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblSub)))))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(btnSearch)
					.addGap(67))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPrevious)
						.addComponent(lblEnterStudentId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(lblName_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDateOfBirth)
								.addComponent(lblDob))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFathersName)
								.addComponent(lblFname))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMothersName)
								.addComponent(lblMname))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSex)
								.addComponent(lblSex_1))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNationality)
								.addComponent(lblNationality_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReligion)
								.addComponent(lblReligion_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBloodGroup)
								.addComponent(lblBlood)))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubject)
						.addComponent(lblSub))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblAd))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblSid))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddress)
						.addComponent(lblAddress_1))
					.addContainerGap(153, Short.MAX_VALUE))
		);
		label = new JLabel("", icon1, JLabel.CENTER);
		panel_1.add(label, BorderLayout.CENTER);
		contentPane.setLayout(gl_contentPane);
	}
}
