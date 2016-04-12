import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorMy {
	
	JPanel windowContent;
	private JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	
	public void setDisplayValue(String val){
		displayField.setText(val);
	}
	
	public String getDisplayValue(){
		return displayField.getText();
	}

	CalculatorMy(){
		
		windowContent = new JPanel();
		GridBagLayout gb = new GridBagLayout();
		displayField = new JTextField(30);
		
		GridBagConstraints constr = new GridBagConstraints();
		
		constr.gridx =0;
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		gb.setConstraints(displayField, constr);
		
		windowContent.add(displayField);
		
		JFrame frame = new JFrame("calculatorMy");
		frame.setContentPane(windowContent);
		frame.setSize(200, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	public static void main(String[] args) {
		
		new CalculatorMy();
		

	}

}
