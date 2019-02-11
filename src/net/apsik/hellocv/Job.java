package net.apsik.hellocv;

import java.util.Calendar;

public class Job extends LifePeriod{
	private String position; // net.apsik.hellocv.Job position
	private String company; // Name company
	public Job(String position, String company ,Calendar start, Calendar end, String description){
		super(start, end, description);
		this.position = position;
		this.company = company;
	}

}
