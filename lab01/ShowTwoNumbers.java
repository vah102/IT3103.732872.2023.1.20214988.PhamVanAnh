//Ex4: ShowTwoNumbers.java
//Author: Pham Van Anh 20214988
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        //declare two strings reference data variables
        String strNum1, strNum2;
        //declare a variable containing the message content
        String strNotification = "You've just entered: ";

        //use the method showInputDialog to get input from user
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ","Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        //perform a string concatenation of the previous message
        strNotification += strNum1 + " and ";

        //use the method showInputDialog to get input from user
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        //perform a string concatenation of the previous mesage
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        //exit the program
        System.exit(0);
    }
}

