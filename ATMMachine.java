/**
 *
 * Author: Wash
 * Date: 6/28/2017
 * Purpose: Login screen for the ATM Machine
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
    
    AccNumPanel accNum = new AccNumPanel();
    PassPanel passPanel = new PassPanel();
    JLabel accountNumber = new JLabel("Account Number");
    JLabel pass = new JLabel("Password");
    JPanel accButton = new JPanel();
    JPanel passButton = new JPanel();
    JPanel masters = new JPanel();
    JButton login = new JButton("Login");
     
    public ATMMachine(){
        login.setPreferredSize(new Dimension(10,40));

        accountNumber.setPreferredSize(new Dimension(200, 15));
        accountNumber.setFont(new Font(("Times new Roman"), Font.BOLD, 20));
        
        pass.setPreferredSize(new Dimension(200, 15));
        pass.setFont(new Font(("Times new Roman"), Font.BOLD, 20));
        
        accButton.setLayout(new FlowLayout());
        accButton.add(accountNumber);
        accButton.add(accNum);
        
        passButton.setLayout(new FlowLayout());
        passButton.add(pass);
        passButton.add(passPanel);
   
        masters.setLayout(new GridLayout(2, 1));
        masters.add(accButton);
        masters.add(passButton);
        
        getContentPane().add(masters, BorderLayout.NORTH);
        getContentPane().add(login, BorderLayout.SOUTH);
    }
}
