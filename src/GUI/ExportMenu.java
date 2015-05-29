/**
 * 
 */
package GUI;

import imageIO.FileAccessor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

/**
 * @author Noah
 *
 */
public class ExportMenu implements ActionListener {
	GUI g;
	public ExportMenu(GUI g){
		this.g = g;
	}
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser chooser = new JFileChooser();
        // chooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        int choice = chooser.showOpenDialog(g.getJf());

        if (choice == JFileChooser.APPROVE_OPTION) {
            // user selects a file
        	// need to pass stuff into file Accessor
//            (new FileAccessor()).writeOutData(chooser.getSelectedFile().getPath());
        	System.out.println("ticket 4061 : Specify data to fileAccessor at line 38 in ExportMenu.java");
        }
	}
	

}
