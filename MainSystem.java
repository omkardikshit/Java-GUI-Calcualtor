import javax.swing.JOptionPane;

public class MainSystem {
	public static void main(String args[]){
		
		String fno = JOptionPane.showInputDialog("Type First Number");
		int num1 = Integer.parseInt(fno);		
		String s = JOptionPane.showInputDialog("Type Operator");	
		char op = s.charAt(0);
		String sno = JOptionPane.showInputDialog("Type Second Number");
		int num2 = Integer.parseInt(sno);		
		int ans;
		
	    switch(op)
	    {
	        case '+':
	        	ans = num1+num2;
	    		JOptionPane.showMessageDialog(null, "Your Answser is "+ ans)	;
	            break;

	        case '-':
	        	ans = num1-num2;
	    		JOptionPane.showMessageDialog(null, "Your Answser is "+ ans)	;
	            break;

	        case '*':
	        	ans = num1*num2;
	    		JOptionPane.showMessageDialog(null, "Your Answser is "+ ans)	;
	            break;

	        case '/':
	        	ans = num1/num2;
	    		JOptionPane.showMessageDialog(null, "Your Answser is "+ ans)	;
	            break;
	            
	        default:
	    		JOptionPane.showMessageDialog(null, "ERROR YOU TYPED WRONG")	;	        	
	            break;    
	}
	
	
}}
