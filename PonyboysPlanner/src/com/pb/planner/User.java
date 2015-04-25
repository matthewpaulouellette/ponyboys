package com.pb.planner;

import java.util.ArrayList;

/**
 * 
 * @author Jay
 *
 */

public class User 
{
	private String userId;
	private String firstName;
	private String lastName;
	private ArrayList<Event> eventList;
	private ArrayList<User> friendList;
	
	public User(String userId, String firstName, String lastName)
	{
		this.userId = userId; 
		this.firstName = firstName;
		this.lastName = lastName;	
		eventList = new ArrayList<Event>();
		friendList = new ArrayList<User>();
	}

	public String getUserId() 
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public void add(Event event)
	{
		eventList.add(event);
	}
	
	public void remove(Event event)
	{
		eventList.remove(event);
	}
	
	public ArrayList<Event> getEventList()
	{
		return eventList;
	}
	
	public void add(User user)
	{
		friendList.add(user);
	}
	
	public void remove(User user)
	{
		friendList.remove(user);
	}
	
	public ArrayList<User> getFriendList()
	{
		return friendList;
	}
}
