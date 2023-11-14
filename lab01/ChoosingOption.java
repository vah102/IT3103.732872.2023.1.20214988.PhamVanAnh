//Author: Pham Van Anh 20214988

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to first class ticket?");

        JOptionPane.showMessageDialog(null, "You've choosen: "
                + (option == JOptionPane.YES_OPTION? "yes" : "no" ));

        System .exit(0);
    }
}



