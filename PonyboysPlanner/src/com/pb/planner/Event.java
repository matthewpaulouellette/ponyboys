package com.pb.planner;

/**
 * 
 * @author Chris
 *
 */
public class Event 
{
	/**
	 * Date associated with this event
	 */
	private EventDate date;
	
	/**
	 * Textual summary of the event
	 */
	private String summary;
	
	public Event()
	{
		super();
	}
	
	public Event(EventDate date, String summary)
	{
		this.date = date; 
		this.summary = summary;
	}
	
}
