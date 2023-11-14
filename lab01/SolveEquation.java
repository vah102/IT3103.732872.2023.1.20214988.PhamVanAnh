//Ex5: SolveEquation.java
////Author: Pham Van Anh 20214988

import javax.swing.JOptionPane;
public class SolveEquation {
    public static void main(String[] args) {
        ////declare two strings reference data variables
        String strNum1, strNum2;

        //use method showInputDialog to get input from user
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ","Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        //use method showInputDialog to get input from user
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        //to convert from string to double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        //sumsubmuldiv
        String noti = "Add Two Numbers: ";
        noti += (num1 + num2);
        noti += "\nSub Two Numbers:" + (num1 - num2);
        noti += "\nMul Two Numbers:" + (num1 * num2);
        noti += "\nDiv Two Numbers:" + (num1 / num2);

        JOptionPane.showMessageDialog(null, noti,
                "Solve Equation", JOptionPane.INFORMATION_MESSAGE);

        //exit the program
        System.exit(0);
    }
}


