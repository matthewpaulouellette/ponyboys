package com.pb.planner;

import java.util.Date;

/**
 * 
 * @author Chris
 *
 */
public class EventDate extends Date 
{
	private String startTime;
	private String endTime;

	public EventDate(Date date)
	{
		super();
		this.startTime = null;
		this.endTime = null;
	}
}
