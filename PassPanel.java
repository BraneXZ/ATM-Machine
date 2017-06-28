/**
 *
 * Author: Wash
 * Date: 6/28/2017
 * Purpose: Initiates the password section and check to see if password matches
 */
import javax.swing.*;

public class PassPanel extends JPanel{
    
    private JTextField pass = new JTextField(15);
    
    public PassPanel(){
        add(pass);
    }
}
