import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import simple.OperatorAction;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton button_4;
	private JButton btnNewButton_4;
	private JButton button_5;
	private JButton button_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	String display = "";
	 int currentCalc;
	 int calcOperation =0;
	private JButton btnC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton(" 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "1");
			}
		});
		
		
		btnNewButton.setBounds(52, 80, 64, 31);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(26, 11, 372, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton(" 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + Integer.parseInt("2"));
			}
		});
		btnNewButton_1.setBounds(150, 80, 70, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		button = new JButton("4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "4");
			}
		});
		button.setBounds(52, 122, 64, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("5");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "5");
			}
		});
		button_1.setBounds(150, 122, 70, 23);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("6");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "6");
			}
		});
		button_2.setBounds(239, 122, 64, 23);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "7");
			}
		});
		button_3.setBounds(52, 156, 64, 23);
		frame.getContentPane().add(button_3);
		
		btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "8");
			}
		});
		btnNewButton_2.setBounds(150, 156, 70, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "9");
			}
		});
		btnNewButton_3.setBounds(239, 156, 64, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "3");
			}
		});
		button_4.setBounds(239, 80, 64, 31);
		frame.getContentPane().add(button_4);
		
		btnNewButton_4 = new JButton("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + "0");
			}
		});
		btnNewButton_4.setBounds(52, 190, 64, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		button_5 = new JButton(".");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText(display + ".");
			}
		});
		button_5.setBounds(146, 190, 74, 23);
		frame.getContentPane().add(button_5);
		
		
		button_6 = new JButton("+");
		button_6.setActionCommand("+");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText("");
			}
		});

		button_6.setBounds(345, 84, 89, 23);
		
		frame.getContentPane().add(button_6);
		 OperatorAction addAction = new OperatorAction(1);
	       button_6.addActionListener(addAction);
		
	       
	       
	       btnNewButton_5 = new JButton("-");
	       btnNewButton_5.setActionCommand("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText("");
			}
		});
		btnNewButton_5.setBounds(345, 122, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		OperatorAction subAction = new OperatorAction(2);
		btnNewButton_5.addActionListener(subAction);
		
		btnNewButton_6 = new JButton("/");
		  btnNewButton_6.setActionCommand("/");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = textField.getText();
				textField.setText("");
			}
		});
		btnNewButton_6.setBounds(345, 156, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		OperatorAction divAction = new OperatorAction(3);
		btnNewButton_6.addActionListener(divAction);
		
		btnNewButton_7 = new JButton("=");
		btnNewButton_7.setActionCommand("=");
		btnNewButton_7.addActionListener(new ActionListener()
	        {
	            @Override
	            public void actionPerformed(ActionEvent event)
	            {
				    int n = 1;
				    		
	            	if (!textField.getText().isEmpty() || n == 0 )
                {
                    int number = Integer.parseInt(textField.getText()); 
                 
                    if (calcOperation == 1)
                    {
                    
                        int calculate = currentCalc  + number;
                         
                        textField.setText(""+Integer.toString(calculate));
                        
                    }
                    else if (calcOperation == 2)
                    {
                        int calculate = currentCalc  - number;
                        textField.setText("" + Integer.toString(calculate));
                    }
                    else if (calcOperation == 3) {
                    	int calculate = (currentCalc/number);
                    	textField.setText("" + Integer.toString(calculate));
                    }
                    else if (calcOperation == 4) {
                    	int calculate = (currentCalc * number);
                    	textField.setText(Integer.toString(calculate));
                    }
                   
                }
	 
			}
	            
	            });
	
		btnNewButton_7.setBounds(345, 190, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   display = textField.getText();
			   display = "";
			   textField.setText(display);
			}
		});
		btnC.setBounds(239, 190, 64, 23);
		frame.getContentPane().add(btnC);
	}
	  public void actionPerformed(ActionEvent event)
	    {
	        //get the Action Command text from the button
	        String action = event.getActionCommand();
	        
	        //set the text using the Action Command text
	        textField.setText(action);       
	    }
	 private class OperatorAction implements ActionListener
	    {
	        private int operator;
	        
	        public OperatorAction(int operation)
	        {
	            operator = operation;
	        }
	        
	        public void actionPerformed(ActionEvent event)
	        {
	            currentCalc = Integer.parseInt(textField.getText()); 
	            calcOperation = operator;
	        }
	    }
	}




