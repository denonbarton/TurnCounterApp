package counter.controller;

import counter.controller.CounterController;

public class CounterRunner
{
	public static void main (String [] args)
	{
		CounterController myCounterController = new CounterController();
		myCounterController.start();
	}
}
