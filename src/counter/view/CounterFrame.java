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
	private JTextField Input1;
	private JTextField output1;
	private JTextField input2;
	private JTextField input3;
	private JTextField input4;
	private JTextField input_5;
	private JTextField input_6;
	private JButton nextTurnButton;
	private JButton button;
	private JTextField textField;
	private JButton button_7;
	private JTextField textField_1;
	private JLabel label;
	private JButton button_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField leftTextField;
	private JTextField rightTextField;
	
	public CounterFrame(CounterController baseController)
	{
		this.baseController = baseController;
		
		basePanel = new CounterPanel(baseController);
		SpringLayout springLayout = (SpringLayout) basePanel.getLayout();
		basePanel.setBackground(Color.GREEN);
		
		JButton button_1 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_1, 109, SpringLayout.NORTH, basePanel);
		springLayout.putConstraint(SpringLayout.WEST, button_1, 10, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.EAST, button_1, -425, SpringLayout.EAST, basePanel);
		basePanel.add(button_1);
		
		Input1 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, button_1, -6, SpringLayout.NORTH, Input1);
		springLayout.putConstraint(SpringLayout.WEST, Input1, 26, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, Input1, -441, SpringLayout.SOUTH, basePanel);
		basePanel.add(Input1);
		Input1.setColumns(10);
		
		output1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, output1, 0, SpringLayout.NORTH, Input1);
		springLayout.putConstraint(SpringLayout.WEST, output1, 46, SpringLayout.EAST, Input1);
		basePanel.add(output1);
		output1.setColumns(10);
		
		input2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, input2, 24, SpringLayout.SOUTH, Input1);
		springLayout.putConstraint(SpringLayout.EAST, input2, 0, SpringLayout.EAST, Input1);
		input2.setColumns(10);
		basePanel.add(input2);
		
		JButton button_3 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_3, 216, SpringLayout.NORTH, basePanel);
		springLayout.putConstraint(SpringLayout.WEST, button_3, 11, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.EAST, button_3, 0, SpringLayout.EAST, button_1);
		basePanel.add(button_3);
		
		input3 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, button_3, -6, SpringLayout.NORTH, input3);
		springLayout.putConstraint(SpringLayout.NORTH, input3, 27, SpringLayout.SOUTH, input2);
		springLayout.putConstraint(SpringLayout.EAST, input3, 0, SpringLayout.EAST, Input1);
		input3.setColumns(10);
		basePanel.add(input3);
		
		JButton button_4 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_4, 6, SpringLayout.SOUTH, input3);
		springLayout.putConstraint(SpringLayout.WEST, button_4, 10, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, button_4, -311, SpringLayout.SOUTH, basePanel);
		springLayout.putConstraint(SpringLayout.EAST, button_4, -425, SpringLayout.EAST, basePanel);
		basePanel.add(button_4);
		
		input4 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, input4, 27, SpringLayout.SOUTH, input3);
		springLayout.putConstraint(SpringLayout.WEST, input4, 0, SpringLayout.WEST, Input1);
		input4.setColumns(10);
		basePanel.add(input4);
		
		JButton button_5 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_5, 39, SpringLayout.SOUTH, button_4);
		springLayout.putConstraint(SpringLayout.WEST, button_5, 10, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, button_5, -255, SpringLayout.SOUTH, basePanel);
		springLayout.putConstraint(SpringLayout.EAST, button_5, -425, SpringLayout.EAST, basePanel);
		basePanel.add(button_5);
		
		input_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, input_5, 31, SpringLayout.SOUTH, input4);
		springLayout.putConstraint(SpringLayout.EAST, input_5, 0, SpringLayout.EAST, Input1);
		input_5.setColumns(10);
		basePanel.add(input_5);
		
		JButton button_6 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_6, 44, SpringLayout.SOUTH, button_5);
		springLayout.putConstraint(SpringLayout.WEST, button_6, 10, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, button_6, -194, SpringLayout.SOUTH, basePanel);
		springLayout.putConstraint(SpringLayout.EAST, button_6, -425, SpringLayout.EAST, basePanel);
		basePanel.add(button_6);
		
		input_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, input_6, 31, SpringLayout.SOUTH, input_5);
		springLayout.putConstraint(SpringLayout.WEST, input_6, 0, SpringLayout.WEST, Input1);
		input_6.setColumns(10);
		basePanel.add(input_6);
		
		nextTurnButton = new JButton("Next Turn");
		springLayout.putConstraint(SpringLayout.SOUTH, nextTurnButton, -10, SpringLayout.SOUTH, basePanel);
		springLayout.putConstraint(SpringLayout.EAST, nextTurnButton, 0, SpringLayout.EAST, basePanel);
		basePanel.add(nextTurnButton);
		
		button = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button, 6, SpringLayout.SOUTH, input_6);
		springLayout.putConstraint(SpringLayout.WEST, button, 10, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, button, 56, SpringLayout.SOUTH, button_6);
		springLayout.putConstraint(SpringLayout.EAST, button, -425, SpringLayout.EAST, basePanel);
		basePanel.add(button);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, button);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, Input1);
		textField.setColumns(10);
		basePanel.add(textField);
		
		button_7 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_7, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, button_7, 10, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, button_7, 23, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, button_7, -425, SpringLayout.EAST, basePanel);
		basePanel.add(button_7);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, button_7);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, Input1);
		textField_1.setColumns(10);
		basePanel.add(textField_1);
		
		button_2 = new JButton("+");
		springLayout.putConstraint(SpringLayout.NORTH, button_2, 6, SpringLayout.SOUTH, Input1);
		springLayout.putConstraint(SpringLayout.WEST, button_2, 0, SpringLayout.WEST, button_1);
		springLayout.putConstraint(SpringLayout.SOUTH, button_2, 23, SpringLayout.SOUTH, output1);
		springLayout.putConstraint(SpringLayout.EAST, button_2, -134, SpringLayout.EAST, input3);
		basePanel.add(button_2);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, output1);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, input2);
		textField_2.setColumns(10);
		basePanel.add(textField_2);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, input3);
		springLayout.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, output1);
		textField_3.setColumns(10);
		basePanel.add(textField_3);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, input4);
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, output1);
		textField_4.setColumns(10);
		basePanel.add(textField_4);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, input_5);
		springLayout.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, output1);
		textField_5.setColumns(10);
		basePanel.add(textField_5);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 0, SpringLayout.NORTH, input_6);
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, output1);
		textField_6.setColumns(10);
		basePanel.add(textField_6);
		
		textField_7 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_7, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, output1);
		textField_7.setColumns(10);
		basePanel.add(textField_7);
		
		textField_8 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, textField_8, 0, SpringLayout.WEST, output1);
		textField_8.setColumns(10);
		basePanel.add(textField_8);
		
		leftTextField = new JTextField();
		leftTextField.setText("Turns");
		springLayout.putConstraint(SpringLayout.WEST, leftTextField, 37, SpringLayout.WEST, basePanel);
		springLayout.putConstraint(SpringLayout.SOUTH, leftTextField, -35, SpringLayout.NORTH, Input1);
		basePanel.add(leftTextField);
		leftTextField.setColumns(10);
		
		rightTextField = new JTextField();
		rightTextField.setText("Current total");
		springLayout.putConstraint(SpringLayout.NORTH, rightTextField, 0, SpringLayout.NORTH, leftTextField);
		springLayout.putConstraint(SpringLayout.WEST, rightTextField, 33, SpringLayout.EAST, leftTextField);
		basePanel.add(rightTextField);
		rightTextField.setColumns(10);
		
		
		
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