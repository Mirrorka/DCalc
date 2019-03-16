package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class wind extends JFrame {

	private JPanel contentPane;
	private JTextField t_sum;
	private JTextField t_day;
	private JTextField t_year;
	private JTextField t_month;
	private JLabel l_time_vklad;
	private JTextField t_time_vklad;
	private JLabel label;
	private JLabel l_proc;
	private JTextField t_proc;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wind frame = new wind();
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
	public wind() {
		setTitle("\u0414\u0435\u043F\u043E\u0437\u0438\u0442\u043D\u044B\u0439 \u043A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel l_sum = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u0432\u043A\u043B\u0430\u0434\u0430:");
		
		t_sum = new JTextField();
		t_sum.setToolTipText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u0443\u043C\u043C\u0443");
		t_sum.setColumns(10);
		
		JLabel l_date = new JLabel("\u0414\u0430\u0442\u0430 \u043E\u0442\u043A\u0440\u044B\u0442\u0438\u044F:");
		
        LocalDate date = LocalDate.now();

        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();

        DayOfWeek dow = date.getDayOfWeek();
        int monthLength = date.lengthOfMonth();
        boolean leapYear = date.isLeapYear();
		
		t_day = new JTextField();
		t_day.setText(""+day);
		t_day.setColumns(10);
		
		t_year = new JTextField();
		t_year.setText(""+year);
		t_year.setColumns(10);
		
		t_month = new JTextField();
		t_month.setText(""+(month.ordinal()+1));
		t_month.setColumns(10);
		
		l_time_vklad = new JLabel("\u0421\u0440\u043E\u043A \u0432\u043A\u043B\u0430\u0434\u0430:");
		
		t_time_vklad = new JTextField();
		t_time_vklad.setToolTipText("\u0412 \u0434\u043D\u044F\u0445");
		t_time_vklad.setText("365");
		t_time_vklad.setColumns(10);
		
		label = new JLabel("\u0434\u043D\u0435\u0439.");
		
		l_proc = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u043D\u0430\u044F \u0441\u0442\u0430\u0432\u043A\u0430:");
		
		t_proc = new JTextField();
		t_proc.setToolTipText("\u0412 \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u0430\u0445");
		t_proc.setText("10");
		t_proc.setColumns(10);
		
		label_2 = new JLabel("%");
		
		JCheckBox ch_capital = new JCheckBox("\u041A\u0430\u043F\u0438\u0442\u0430\u043B\u0438\u0446\u0430\u0446\u0438\u044F \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u043E\u0432");
		ch_capital.setToolTipText("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u044B \u0441 \u0443\u0441\u0442\u0430\u043D\u043E\u0432\u043B\u0435\u043D\u043D\u043E\u0439 \u043F\u0435\u0440\u0435\u043E\u0434\u0438\u0447\u043D\u043E\u0441\u0442\u044C\u044E \u0434\u043E\u0431\u0430\u0432\u043B\u044F\u044E\u0442\u0441\u044F \u043A \u0432\u043A\u043B\u0430\u0434\u0443");
		
		JLabel label_1 = new JLabel("\u0412\u044B\u043F\u043B\u0430\u0442\u0430 \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u043E\u0432:");
		
		JComboBox ñ_type_proc = new JComboBox();
		ñ_type_proc.setModel(new DefaultComboBoxModel(Proc.values()));
		
		JButton b_go = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		
		label_3 = new JLabel("\u041E\u0441\u0442\u0430\u0442\u043E\u043A \u0432\u043A\u043B\u0430\u0434\u0430:");
		
		label_4 = new JLabel("\u0412\u044B\u043F\u043B\u0430\u0447\u0435\u043D\u043E \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u043E\u0432:");
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(b_go, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(l_time_vklad, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(l_sum)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(t_sum, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(l_date)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(t_day, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(t_month, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
										.addComponent(t_time_vklad, 0, 0, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(t_year, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(l_proc)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(t_proc, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(ch_capital))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ñ_type_proc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(l_sum)
							.addComponent(t_sum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_3))
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(l_date)
							.addComponent(t_day, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(t_year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(t_month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_4))
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(l_time_vklad)
								.addComponent(t_time_vklad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(l_proc)
								.addComponent(t_proc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2)))
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ch_capital)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(ñ_type_proc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(b_go)
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
