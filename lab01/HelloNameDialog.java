//Ex3: HelloNamDialog.java
//Author: Pham Van Anh 20214988

import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;

        //use the method showInputDialog to get input from user
        result = JOptionPane.showInputDialog("Pham Van Anh 20214988 - Please enter your name");

        //use the method showInputDialog to print text to cmd
        JOptionPane.showMessageDialog(null, "Im Pham Van Anh. Hi " + result + "!");

        //exit program
        System.exit(0);
    }
}


