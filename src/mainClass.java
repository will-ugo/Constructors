import javax.swing.JOptionPane;

public class mainClass {
	public static void main (String args []) {
		String firstNameString = JOptionPane.showInputDialog("Enter Your First Name");
		
		if (firstNameString == null) {
			JOptionPane.showMessageDialog(null, "Program Ended");
			System.exit(0);
		}
		else {
			String lastNameString = JOptionPane.showInputDialog("Enter Your Last Name");
			if (lastNameString == null) {
				JOptionPane.showMessageDialog(null, "Program Ended");
				System.exit(0);
			}
			else {
			constructor userName = new constructor(firstNameString, lastNameString);			
			userName.displayMessage();
			}
		}
	}
}
		
