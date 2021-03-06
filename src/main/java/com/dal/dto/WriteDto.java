package com.dal.dto;

public class WriteDto {
	private String division;
	private int month;
	private int day;
	private int starttime;
	private int endtime;
	private int peopleNo;
	private int cost;
	private String volunteer;
	private String city;
	private String borough;
	private String dong;
	private int radius;
	public WriteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WriteDto(String division, int month, int day, int starttime, int endtime, int peopleNo, int cost,
			String volunteer, String city, String borough, String dong, int radius) {
		super();
		this.division = division;
		this.month = month;
		this.day = day;
		this.starttime = starttime;
		this.endtime = endtime;
		this.peopleNo = peopleNo;
		this.cost = cost;
		this.volunteer = volunteer;
		this.city = city;
		this.borough = borough;
		this.dong = dong;
		this.radius = radius;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getStarttime() {
		return starttime;
	}
	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}
	public int getEndtime() {
		return endtime;
	}
	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}
	public int getPeopleNo() {
		return peopleNo;
	}
	public void setPeopleNo(int peopleNo) {
		this.peopleNo = peopleNo;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(String volunteer) {
		this.volunteer = volunteer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBorough() {
		return borough;
	}
	public void setBorough(String borough) {
		this.borough = borough;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "WriteDto [division=" + division + ", month=" + month + ", day=" + day + ", starttime=" + starttime
				+ ", endtime=" + endtime + ", peopleNo=" + peopleNo + ", cost=" + cost + ", volunteer=" + volunteer
				+ ", city=" + city + ", borough=" + borough + ", dong=" + dong + ", radius=" + radius + "]";
	}
	
	
	
	
	
}
