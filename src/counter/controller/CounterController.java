package counter.controller;

import counter.view.CounterFrame;

/**
 * AppController for the simple GUI project.
 * @author dbar0540
 * @version 0.1 Nov 9, 2015
 */
public class CounterController
{
	private CounterFrame baseFrame;
	
	public CounterController()
	{
		baseFrame = new CounterFrame(this);
	}
	
	public void start()
	{}	
}