/**
 *
 * Author: Wash
 * Date: 6/28/2017
 * Purpose: Run the ATM machine GUI
 */
import javax.swing.*;

public class TestATMMachine {
    public static void main(String args[]){
        //instantiates a new ATM Machine object and set its
        //size and visibility
        ATMMachine myMachine = new ATMMachine();
        myMachine.setSize(500,200);
        myMachine.setResizable(false);
        myMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myMachine.setTitle("Washing-Machine");
        myMachine.setVisible(true);
    }
}
