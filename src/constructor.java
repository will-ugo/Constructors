import javax.swing.JOptionPane;

public class constructor {
	public String firstName;
	public String lastName;
	
	public constructor(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void displayMessage() {
		JOptionPane.showMessageDialog(null, "Your Name is " + getFirstName() + " " + getLastName());
	}

}
