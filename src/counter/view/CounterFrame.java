package counter.view;

import javax.swing.JFrame;
import counter.controller.CounterController;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Creates the frame for the GUI project.
 * 
 * @author dbar0540
 * @version 0.x Nov 9, 2015 added a refrence to the GUIPanel and installed it as
 *          the content pane added the setupFrame helper method
 */

public class CounterFrame extends JFrame
{
	private CounterController baseController;
	private CounterPanel basePanel;
	
	
	public CounterFrame(CounterController baseController)
	{
		this.baseController = baseController;
		
		basePanel = new CounterPanel(baseController);
		SpringLayout springLayout = (SpringLayout) basePanel.getLayout();
		basePanel.setBackground(Color.GREEN);
	}
	
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		
		this.setTitle("my window app");
		this.setSize(450, 600);
		this.setVisible(true);
		
	}
	public CounterController getBaseController()
	{
		return baseController;
	}
}