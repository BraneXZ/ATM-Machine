/**
 *
 * Author: Wash
 * Date: 6/28/2017
 * Purpose: Login screen for the ATM Machine
 */

/*
    import different libraries into this class
    got them from my programmer's calculator project
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class ATMMachine extends JFrame{
    
    /*
        AccNumPanel and PassPanel are the 2 classes I made to separate them
        from the main interface of the login screen
    */
    AccNumPanel accNum = new AccNumPanel();
    PassPanel passPanel = new PassPanel();
    
    //  JLabel allows you to create a label with the specified string
    JLabel accountNumber = new JLabel("Account Number");
    JLabel pass = new JLabel("Password");
    
    /*
        JPanel create panels in which you use to set up the interface
        accButton deals with the first line of the interface, the Account Number
        passButton deals with the password section
        masters might or might not needed but I made it to be the master panel
        for the whole login screen
    */
    JPanel accButton = new JPanel();
    JPanel passButton = new JPanel();
    JPanel masters = new JPanel();
    
    //creates a button that you can press
    JButton login = new JButton("Login");
     
    public ATMMachine(){
        //sets the length and width of the login button
        login.setPreferredSize(new Dimension(10,40));

        //sets the size and font of the accountNumber label 
        accountNumber.setPreferredSize(new Dimension(200, 15));
        accountNumber.setFont(new Font(("Times new Roman"), Font.BOLD, 20));
        
        pass.setPreferredSize(new Dimension(200, 15));
        pass.setFont(new Font(("Times new Roman"), Font.BOLD, 20));
        
        /*
            add the account number label and panel into the accButton label
            using flow layout which goes from left to right
            the order in which you add it to the layout matters
        */
        accButton.setLayout(new FlowLayout());
        accButton.add(accountNumber);
        accButton.add(accNum);
        
        passButton.setLayout(new FlowLayout());
        passButton.add(pass);
        passButton.add(passPanel);
        
        /*
            sets the masters layout using grid layout with the parameter specifying
            the (rows, columns) 
        */
        masters.setLayout(new GridLayout(2, 1));
        masters.add(accButton);
        masters.add(passButton);
        
        /*
            add masters panel onto the GUI interface using BorderLayout.NORTH
            which place it at the top while login is at the bottom
        */
        getContentPane().add(masters, BorderLayout.NORTH);
        getContentPane().add(login, BorderLayout.SOUTH);
    }
}
