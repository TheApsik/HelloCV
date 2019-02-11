package net.apsik.hellocv;

import java.util.Calendar;

public class LifePeriod{
	private Calendar beginning;
	private Calendar ending;
	private String description;

	public LifePeriod(Calendar beginning, Calendar ending, String description){
		if(beginning == null)
			throw new IllegalArgumentException("net.apsik.hellocv.LifePeriod: beginning can not be null");
		this.beginning = beginning;
		this.ending = ending;
		this.description = description;
	}

	public LifePeriod(Calendar beginning, Calendar ending){
		this(beginning, ending, null);
	}

	public Calendar getBeginning(){
		return beginning;
	}

	public Calendar getEnding(){
		return ending;
	}

	public String getDescription(){
		return description;
	}

	public void setEnding(Calendar ending){
		if(this.ending == null)
			this.ending = ending;
	}
}
