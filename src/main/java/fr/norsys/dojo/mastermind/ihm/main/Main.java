/**
 * 
 */
package fr.norsys.dojo.mastermind.ihm.main;

import fr.norsys.dojo.mastermind.ihm.MastermindUI;

/**
 * @author technomaker09
 *
 */
public class Main {

	/**
	 * @param args
	 */
    private static void createAndShowGUI() {
    	
        //Create and set up the content pane.
    	MastermindUI ui = new MastermindUI();
        ui.setVisible(true); //content panes must be opaque
    }
	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}
