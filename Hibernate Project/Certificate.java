package com.demo.Hibernatetproject;


import javax.persistence.Embeddable;
@Embeddable
public class Certificate {

	private String course;
	private String duration;
	
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String Course)
	{
		this.course=course;
	}
	
	public String getDuration()
	{
		return duration;
	}
	public void setDuration(String duration)
	{
		this.duration=duration;
	}
	
	public String toString()
	{
		return "Certificate[course=" + course + ", duration=" + duration + "]";
	}
	
	public Certificate(String course,String duration)
	{
		super();
		this.course=course;
		this.duration=duration;
	}
	public Certificate()
	{
		super();
	}
	
	
	
	
	

}
