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
		windowContent.setLayout(gb);
		
		GridBagConstraints constr = new GridBagConstraints();
		
		constr.gridx =0;
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = constr.CENTER;
		
		displayField = new JTextField(30);
		gb.setConstraints(displayField, constr);
		windowContent.add(displayField);
		
		GridBagConstraints constr1 = new GridBagConstraints();
		
		constr1.gridx = 1;
		constr1.gridy = 4;
		constr1.gridheight = 1;
		constr1.gridwidth = 1;
		constr1.fill = constr1.BOTH;
		constr1.weightx = 1.0;
		constr1.weighty = 1.0;
		constr1.anchor = constr1.CENTER;
		
		button0 = new JButton("0");
		gb.setConstraints(button0, constr1);
		windowContent.add(button0);
	
		GridBagConstraints constr2 = new GridBagConstraints();
		
		constr2.gridx=1;
		constr2.gridy = 3;
		constr2.gridheight = 1;
		constr2.gridwidth = 1;
		constr2.fill = constr2.BOTH;
		constr2.weightx = 1.0;
		constr2.weighty = 1.0;
		constr2.anchor = constr2.CENTER;
		
		button1 =new JButton("1");
		gb.setConstraints(button1, constr2);
		windowContent.add(button1);
		
		GridBagConstraints constr3= new GridBagConstraints();
		
		constr3.gridx=2;          
		constr3.gridy = 3;
		constr3.gridheight = 1;
		constr3.gridwidth = 1;
		constr3.fill = constr3.BOTH;
		constr3.weightx = 1.0;
		constr3.weighty = 1.0;
		constr3.anchor = constr3.CENTER;
		
		button2 =new JButton("2");
		gb.setConstraints(button2, constr3);
		windowContent.add(button2);
		
		GridBagConstraints constr4= new GridBagConstraints();
		
		constr4.gridx=3;          
		constr4.gridy = 3;
		constr4.gridheight = 1;
		constr4.gridwidth = 1;
		constr4.fill = constr4.BOTH;
		constr4.weightx = 1.0;
		constr4.weighty = 1.0;
		constr4.anchor = constr4.CENTER;
		
		button3 =new JButton("3");
		gb.setConstraints(button3, constr4);
		windowContent.add(button3);
		
		GridBagConstraints constr5= new GridBagConstraints();
		
		constr5.gridx=1;          
		constr5.gridy = 2;
		constr5.gridheight = 1;
		constr5.gridwidth = 1;
		constr5.fill = constr5.BOTH;
		constr5.weightx = 1.0;
		constr5.weighty = 1.0;
		constr5.anchor = constr5.CENTER;
		
		button4 =new JButton("4");
		gb.setConstraints(button4, constr5);
		windowContent.add(button4);
		
		GridBagConstraints constr6= new GridBagConstraints();
		
		constr6.gridx=2;          
		constr6.gridy = 2;
		constr6.gridheight = 1;
		constr6.gridwidth = 1;
		constr6.fill = constr6.BOTH;
		constr6.weightx = 1.0;
		constr6.weighty = 1.0;
		constr6.anchor = constr6.CENTER;
		
		button5 =new JButton("5");
		gb.setConstraints(button5, constr6);
		windowContent.add(button5);
		
		GridBagConstraints constr7= new GridBagConstraints();
		
		constr7.gridx=3;          
		constr7.gridy = 2;
		constr7.gridheight = 1;
		constr7.gridwidth = 1;
		constr7.fill = constr7.BOTH;
		constr7.weightx = 1.0;
		constr7.weighty = 1.0;
		constr7.anchor = constr7.CENTER;
		
				
		button6 =new JButton("6");
		gb.setConstraints(button6, constr7);
		windowContent.add(button6);
		
		
		JFrame frame = new JFrame("calculatorMy");
		frame.setContentPane(windowContent);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	public static void main(String[] args) {
		
		new CalculatorMy();
		

	}

}
