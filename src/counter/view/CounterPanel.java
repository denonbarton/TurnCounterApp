package counter.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import counter.controller.CounterController;


public class CounterPanel extends JPanel
{
	private CounterController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	//private JTextField leftTextField;
	//private JTextField rightTextField;
	//private JButton nextTurnButton;
	
	public CounterPanel(CounterController baseController)
{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	firstButton = new JButton("Do not click the button");
	firstTextField = new JTextField("you can type words in here");
	
	//leftTextField = new JTextField("How much per turn");	
	//rightTextField = new JTextField("Current Results");
	//nextTurnButton = new JButton("Next Turn");
	
	setupPanel();
	setupLayout();
	setupListeners();
	
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		
		this.add(firstButton);
		this.add(firstTextField);
		
		//this.add(leftTextField);
		//this.add(rightTextField);
		//this.add(nextTurnButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 1, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 1, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 10, SpringLayout.WEST, this);
		
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("don't click it");
			}
		});
	}
}
