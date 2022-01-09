package com.java.jdbc;

import java.sql.Date;

public class LeaveDetails {
	private int leaveId;
	   private int empId;
	   private Date leaveStartDate;
	   private Date leaveEndDate;
	   private String leaveReason;
	   private Date leaveAppliedon;
	   private String leaveType;
	   private String leaveStatus;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate( Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public Date getLeaveAppliedon() {
		return leaveAppliedon;
	}
	public void setLeaveAppliedon(Date leaveAppliedon) {
		this.leaveAppliedon = leaveAppliedon;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", empId=" + empId + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", leaveReason=" + leaveReason + ", leaveAppliedon="
				+ leaveAppliedon + ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus + "]";
	}
	
	}
	

	
