package Calculator_GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 * @author Raheesa
 *GUI of the calculator and it's implementation is done in this class.
 */
public class Calculator implements ActionListener {
	/**
	 * Frame of the calculator
	 */
	private JFrame f;
	/**
	 * Text field to display the result
	 */
	private JTextField t;
	/**
	 * Button to perform actions
	 */
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdec,badd,bsub,bmul,bdiv,beq,bclr;
	
	/**
	 * User inputs stored in variables 'a' and 'b'
	 */
	private static double a = 0, b = 0;
	/**
	 *  and Result is stored in variable 'result'	
	 */
	private static double result = 0;
	/**
	 *  Variable to store operations (+, -, *,/)
	 */
	private static int operator = 0;
	
		/**
		 *This is the Constructor method 
		 *Instances of the frame, text-field and buttons are created.
		 */
	public Calculator() {
			
		// create the frame of the calculator
		f = new JFrame("Calculator");
		
		// create the text field of the calculator
		t = new JTextField();
		// set text field to non - editable 
		t.setEditable(false);
		
		// create the buttons 
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		
		//create . button
		bdec = new JButton(".");
		
		// create operator buttons
		badd = new JButton("+");
		bsub =new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		
		//create equals button
		beq = new JButton("=");
		
		// create equals button
		bclr = new JButton("Clear");
		
		
		// setting the size and placement of the buttons
		t.setBounds(30, 40, 280, 30);
		b1.setBounds(40, 100, 50, 40);
		b2.setBounds(110, 100, 50, 40);
		b3.setBounds(180, 100, 50, 40);
		badd.setBounds(250, 100, 50, 40);
		
		b4.setBounds(40, 170, 50, 40);
		b5.setBounds(110, 170, 50, 40);
		b6.setBounds(180, 170, 50, 40);
		bsub.setBounds(250, 170, 50, 40);
		
		b7.setBounds(40, 240, 50, 40);
		b8.setBounds(110, 240, 50, 40);
		b9.setBounds(180, 240, 50, 40);
		bmul.setBounds(250,240, 50, 40);
		
		bdec.setBounds(40, 310, 50, 40);
		b0.setBounds(110, 310, 50, 40);
		beq.setBounds(180, 310, 50, 40);
		bdiv.setBounds(250,310, 50, 40);
		
		bclr.setBounds(100, 380, 100, 40);
		
		f.add(t);
		f.add(b1);f.add(b2);f.add(b3);f.add(badd);
		f.add(b4);f.add(b5);f.add(b6);f.add(bsub);
		f.add(b7);f.add(b8);f.add(b9);f.add(bmul);
		f.add(bdec);f.add(b0);f.add(beq);f.add(bdiv);
		f.add(bclr);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		badd.addActionListener(this);
		
		
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bsub.addActionListener(this);
		
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bmul.addActionListener(this);
		
		bdec.addActionListener(this);
		b0.addActionListener(this);
		beq.addActionListener(this);
		bdiv.addActionListener(this);
		
		bclr.addActionListener(this);
		
	}
	
	/**
	 * Method for performing the actions when the buttons are clicked.
	 * Has try-catch block to handle the NumberFormatException and ArithmeticExcetion.
	 */
@Override
public void actionPerformed(ActionEvent e) {	
	try {
		if(e.getSource()==b1) {
			t.setText(t.getText().concat("1"));
		}
		
		if(e.getSource()==b2) {
			t.setText(t.getText().concat("2"));
		}
		
		if(e.getSource()==b3) {
			t.setText(t.getText().concat("3"));
		}
		
		if(e.getSource()==b4) {
			t.setText(t.getText().concat("4"));
		}
		
		if(e.getSource()==b5) {
			t.setText(t.getText().concat("5"));
		}
		
		if(e.getSource()==b6) {
			t.setText(t.getText().concat("6"));
		}
		
		if(e.getSource()==b7) {
			t.setText(t.getText().concat("7"));
		}
		
		if(e.getSource()==b8) {
			t.setText(t.getText().concat("8"));
		}
		
		if(e.getSource()==b9) {
			t.setText(t.getText().concat("9"));
		}
		
		if(e.getSource()==b0) {
			t.setText(t.getText().concat("0"));
		}
		
		if(e.getSource()==bdec) {
			t.setText(t.getText().concat("."));
		}

		if(e.getSource()==badd) {
			a = Double.parseDouble(t.getText());	//converting string input to number(double)
			//a = Integer.parseInt(t.getText());
			operator = 1;
			t.setText("");
		}
		
		if(e.getSource()==bsub) {
			a= Double.parseDouble(t.getText());
			//a = Integer.parseInt(t.getText());
			operator = 2;
			t.setText("");
		}
		
		if(e.getSource()==bmul) {
			a= Double.parseDouble(t.getText());
			//a = Integer.parseInt(t.getText());
			operator = 3;
			t.setText("");
		}
		
		
		if(e.getSource()==bdiv) {
				a = Double.parseDouble(t.getText());
			//	a = Integer.parseInt(t.getText());
				operator = 4;
				t.setText("");
			}
		
		if(e.getSource()==beq) {
			b = Double.parseDouble(t.getText());
			//b = Integer.parseInt(t.getText());
			switch(operator) {
			
			case 1:
				result = a+b;
				break;
				
			case 2:
				result = a-b;
				break;
				
			case 3:
				result = a*b;
				break;
				
			case 4:
				result = a/b;
				break;
				
			default :
				result = 0;
			}
			
			if(Double.isInfinite(result)) {
				t.setText("Cannot divide by Zero");
							}else {
									t.setText("" +result);
								  }
			
//			if(e.getSource()==b1||e.getSource()==b2||e.getSource()==b3||e.getSource()==b4||e.getSource()==b5||e.getSource()==b6||e.getSource()==b7||e.getSource()==b8||e.getSource()==b9||e.getSource()==b0) {
//				t.setText("");
//			}
			
		}
		
		if(e.getSource()==bclr) {
			t.setText("");
		}
		
	}catch(NumberFormatException e2) {
			t.setText("Please clear and enter valid numbers");
		}
	
	
  }	
}	


