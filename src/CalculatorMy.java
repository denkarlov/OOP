import javax.swing.*;
import java.awt.*;

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
	JButton buttonPercent;
	JButton buttonMC;
	JButton buttonMH;
	JButton buttonMS;
	JButton buttonMplus;
	JButton buttonBackspace;
	JButton buttonCE;
	JButton buttonC;
	JButton buttonSqrt;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton button1dividex;
	JButton buttonDivide;
	JButton buttonMultiply;
	JButton buttonPlusandMinus;
	
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
		
		//Create displayField
		GridBagConstraints constr = new GridBagConstraints();
		
		constr.gridx =0;
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = GridBagConstraints.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor = GridBagConstraints.CENTER;
		constr.insets = new Insets(4,4,4,0);
		
		displayField = new JTextField(10);
		gb.setConstraints(displayField, constr);
		windowContent.add(displayField);
		
		//Create button"MC"
		GridBagConstraints mc = new GridBagConstraints();
		
		mc.gridx = 0;
		mc.gridy = 1;
		mc.gridheight = 1;
		mc.gridwidth = 1;
		mc.fill = GridBagConstraints.BOTH;
		mc.weightx =1.0;
		mc.weighty =1.0;
		mc.anchor = GridBagConstraints.CENTER;
		mc.insets = new Insets(4,4,2,4);
		
		buttonMC= new JButton("MC");
		gb.setConstraints(buttonMC,mc);
		windowContent.add(buttonMC);
		
		
		//Create button"MH"
		GridBagConstraints mh = new GridBagConstraints();
		
		mh.gridx = 0;
		mh.gridy = 3;
		mh.gridheight = 1;
		mh.gridwidth = 1;
		mh.fill = GridBagConstraints.BOTH;
		mh.weightx = 1.0;
		mh.weighty = 1.0;
		mh.anchor = GridBagConstraints.CENTER;
		mh.insets = new Insets(0,4,2,4);
		
		buttonMH= new JButton("MH");
		gb.setConstraints(buttonMH,mh);
		windowContent.add(buttonMH);
		
		//Create button"MS"
		GridBagConstraints ms = new GridBagConstraints();
		
		ms.gridx = 0;
		ms.gridy = 4;
		ms.gridheight = 1;
		ms.gridwidth = 1;
		ms.fill = GridBagConstraints.BOTH;
		ms.weightx = 1.0;
		ms.weighty = 1.0;
		ms.anchor = GridBagConstraints.CENTER;
		ms.insets = new Insets(0,4,2,4);
		
		buttonMS= new JButton("MS");
		gb.setConstraints(buttonMS,ms);
		windowContent.add(buttonMS);
		
		//Create button"M+"
		GridBagConstraints mplus= new GridBagConstraints();
		
		mplus.gridx = 0;
		mplus.gridy = 5;
		mplus.gridheight = 1;
		mplus.gridwidth = 1;
		mplus.fill = GridBagConstraints.BOTH;
		mplus.weightx = 1.0;
		mplus.weighty = 1.0;
		mplus.anchor = GridBagConstraints.CENTER;
		mplus.insets = new Insets(0,4,4,4);
		
		buttonMplus= new JButton("M+");
		gb.setConstraints(buttonMplus,mplus);
		windowContent.add(buttonMplus);			
		
		//Create button"sqrt"
		GridBagConstraints sqrt = new GridBagConstraints();
		
		sqrt.gridx = 5;
		sqrt.gridy = 1;
		sqrt.gridheight = 1;
		sqrt.gridwidth = 1;
		sqrt.fill = GridBagConstraints.BOTH;
		sqrt.weightx =0;
		sqrt.weighty = 0;
		sqrt.anchor = GridBagConstraints.CENTER;
		sqrt.ipadx = 50;
		sqrt.insets = new Insets(4,0,2,2);
		
		buttonSqrt= new JButton("t");
		gb.setConstraints(buttonSqrt,sqrt);
		windowContent.add(buttonSqrt);
		
		//Create button"/"
		GridBagConstraints	divide = new GridBagConstraints();
		
		divide.gridx = 4;
		divide.gridy = 1;
		divide.gridheight = 1;
		divide.gridwidth = 1;
		divide.fill = GridBagConstraints.BOTH;
		divide.weightx = 0;
		divide.weighty =0;
		divide.anchor = GridBagConstraints.CENTER;
		divide.insets = new Insets(4,0,2,2);
		
		buttonDivide= new JButton("/");
		gb.setConstraints(buttonDivide,divide);
		windowContent.add(buttonDivide);
		
		//Create button"0'
		GridBagConstraints constr1 = new GridBagConstraints();
		
		constr1.gridx = 1;
		constr1.gridy = 5;
		constr1.gridheight = 1;
		constr1.gridwidth = 1;
		constr1.fill = GridBagConstraints.BOTH;
		constr1.weightx = 1.0;
		constr1.weighty = 1.0;
		constr1.anchor = GridBagConstraints.CENTER;
		constr1.insets = new Insets(0,0,4,2);
		
		button0 = new JButton("0");
		gb.setConstraints(button0, constr1);
		windowContent.add(button0);
		
		//Create button"1"
		GridBagConstraints constr2 = new GridBagConstraints();
		
		constr2.gridx=1;
		constr2.gridy = 4;
		constr2.gridheight = 1;
		constr2.gridwidth = 1;
		constr2.fill = GridBagConstraints.BOTH;
		constr2.weightx = 1.0;
		constr2.weighty = 1.0;
		constr2.anchor = GridBagConstraints.CENTER;
		constr2.insets = new Insets(0,0,2,2);
		
		button1 =new JButton("1");
		gb.setConstraints(button1, constr2);
		windowContent.add(button1);
		
		//Create button"2"
		GridBagConstraints constr3= new GridBagConstraints();
		
		constr3.gridx=2;          
		constr3.gridy = 4;
		constr3.gridheight = 1;
		constr3.gridwidth = 1;
		constr3.fill = GridBagConstraints.BOTH;
		constr3.weightx = 1.0;
		constr3.weighty = 1.0;
		constr3.anchor = GridBagConstraints.CENTER;
		constr3.insets = new Insets (0,0,2,2);
		
		button2 =new JButton("2");
		gb.setConstraints(button2, constr3);
		windowContent.add(button2);
		
		//Create button"3"
		GridBagConstraints constr4= new GridBagConstraints();
		
		constr4.gridx=3;          
		constr4.gridy = 4;
		constr4.gridheight = 1;
		constr4.gridwidth = 1;
		constr4.fill = GridBagConstraints.BOTH;
		constr4.weightx = 1.0;
		constr4.weighty = 1.0;
		constr4.anchor = GridBagConstraints.CENTER;
		constr4.insets = new Insets (0,0,2,2);
		
		button3 =new JButton("3");
		gb.setConstraints(button3, constr4);
		windowContent.add(button3);
		
		//Create button"4"
		GridBagConstraints constr5= new GridBagConstraints();
		
		constr5.gridx=1;          
		constr5.gridy = 3;
		constr5.gridheight = 1;
		constr5.gridwidth = 1;
		constr5.fill = GridBagConstraints.BOTH;
		constr5.weightx = 1.0;
		constr5.weighty = 1.0;
		constr5.anchor = GridBagConstraints.CENTER;
		constr5.insets = new Insets(0,0,2,2);
		
		button4 =new JButton("4");
		gb.setConstraints(button4, constr5);
		windowContent.add(button4);
		
		//Create button"5"
		GridBagConstraints constr6= new GridBagConstraints();
		
		constr6.gridx=2;          
		constr6.gridy = 3;
		constr6.gridheight = 1;
		constr6.gridwidth = 1;
		constr6.fill = GridBagConstraints.BOTH;
		constr6.weightx = 1.0;
		constr6.weighty = 1.0;
		constr6.anchor = GridBagConstraints.CENTER;
		constr6.insets =new Insets(0,0,2,2);
		
		button5 =new JButton("5");
		gb.setConstraints(button5, constr6);
		windowContent.add(button5);
		
		//Create button"6"
		GridBagConstraints constr7= new GridBagConstraints();
		
		constr7.gridx=3;          
		constr7.gridy = 3;
		constr7.gridheight = 1;
		constr7.gridwidth = 1;
		constr7.fill = GridBagConstraints.BOTH;
		constr7.weightx = 1.0;
		constr7.weighty = 1.0;
		constr7.anchor = GridBagConstraints.CENTER;
		constr7.insets = new Insets (0,0,2,2);
		
		button6 =new JButton("6");
		gb.setConstraints(button6, constr7);
		windowContent.add(button6);		
		
		//Create button"7"
		GridBagConstraints constr8= new GridBagConstraints();
		
		constr8.gridx = 1;
		constr8.gridy = 1;
		constr8.gridheight = 1;
		constr8.gridwidth = 1;
		constr8.fill = GridBagConstraints.BOTH;
		constr8.weightx = 0;
		constr8.weighty = 0;
		constr8.anchor = GridBagConstraints.CENTER;
		constr8.insets = new Insets(4,0,2,2);
		
		button7 =new JButton("7");
		gb.setConstraints(button7, constr8);
		windowContent.add(button7);
		
		//Create button"8"
		GridBagConstraints constr9= new GridBagConstraints();
		
		constr9.gridx=2;          
		constr9.gridy = 1;
		constr9.gridheight = 1;
		constr9.gridwidth = 1;
		constr9.fill = GridBagConstraints.BOTH;
		constr9.weightx = 0;
		constr9.weighty = 0;
		constr9.anchor = GridBagConstraints.CENTER;
		constr9.insets = new Insets(4,0,2,2);
		
		button8 =new JButton("8");
		gb.setConstraints(button8, constr9);
		windowContent.add(button8);
		
		//Create button"9"
		GridBagConstraints constr10	=new GridBagConstraints();
		
		constr10.gridx=3;          
		constr10.gridy = 1;
		constr10.gridheight = 1;
		constr10.gridwidth = 1;
		constr10.fill = GridBagConstraints.BOTH;
		constr10.weightx = 0;
		constr10.weighty = 0;
		constr10.anchor = GridBagConstraints.CENTER;
		constr10.insets = new Insets(4,0,2,2);
		
		button9 =new JButton("9");
		gb.setConstraints(button9, constr10);
		windowContent.add(button9);
		
		//Create instance CalculatorMyEngine
		CalculatorMyEngine calcEngine = new CalculatorMyEngine(this);
		
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);		
		
		//Create window of calculator
		JFrame frame = new JFrame("calculatorMy");
		frame.setContentPane(windowContent);
		frame.setSize(350,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	public static void main(String[] args) {
		
		new CalculatorMy();
		

	}

}
