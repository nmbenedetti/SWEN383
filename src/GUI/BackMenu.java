/**
 * 
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Noah
 *
 */
public class BackMenu implements ActionListener {
	GUI g;
	public BackMenu(GUI g){
		this.g = g;
	}
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		g.Back();
	}

}
