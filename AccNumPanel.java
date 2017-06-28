/**
 *
 * Author: Wash
 * Date: 6/28/2017
 * Purpose: Initiates the Account number section and check to see if account matches
 */

import java.awt.ComponentOrientation;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
public class AccNumPanel extends JPanel{
    
    //creates a JTextField with the specified length
    private JTextField myNum = new JTextField(15);
    
    public AccNumPanel(){
        //add it to the panel
        add(myNum);
    }
    
}
