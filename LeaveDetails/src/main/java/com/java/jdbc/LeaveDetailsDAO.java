package com.java.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveDetailsDAO {


	Connection connection;
	PreparedStatement pst;
	
	public String addLeave(LeaveDetails leave) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into LeaveDetails(leaveId,empId,leaveStartDate,leaveEndDate,leaveReason,leaveAppliedOn,leaveType,leaveStatus )   "
				+ " values(?,?,?,?,?,?,?,?) ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leave.getLeaveId());
		pst.setInt(2, leave.getEmpId());
		pst.setDate(3, new java.sql.Date(leave.getLeaveStartDate().getTime()));
		pst.setDate(4, new java.sql.Date(leave.getLeaveEndDate().getTime()));
		pst.setString(5, leave.getLeaveReason());
		pst.setDate(6,  new java.sql.Date(leave.getLeaveAppliedon().getTime()));
		pst.setString(7, leave.getLeaveType());
		pst.setString(8, leave.getLeaveStatus());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	
	public LeaveDetails searchLeave(int leaveId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from LeaveDetails where leaveId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs = pst.executeQuery();
		LeaveDetails leave = null;
		if (rs.next()) {
			leave = new LeaveDetails();
			leave.setLeaveId(rs.getInt("leaveid"));
			leave.setEmpId(rs.getInt("empid"));
			leave.setLeaveStartDate(rs.getDate("leavestartdate"));
			leave.setLeaveEndDate(rs.getDate("leaveenddate"));
			leave.setLeaveReason(rs.getString("leavereason"));
			leave.setLeaveAppliedon(rs.getDate("leaveappliedon"));
			leave.setLeaveType(rs.getString("leaveType"));
			leave.setLeaveStatus(rs.getString("leaveStatus"));
		}
		return leave;
	}
	public List<LeaveDetails> showLeave() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from LeaveDetails";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<LeaveDetails> leaveList = new ArrayList<LeaveDetails>();
		LeaveDetails leave = null; 
		while(rs.next()) {
			leave = new LeaveDetails();
			leave.setLeaveId(rs.getInt("leaveid"));
			leave.setEmpId(rs.getInt("empid"));
			leave.setLeaveStartDate(rs.getDate("leavestartdate"));
			leave.setLeaveEndDate(rs.getDate("leaveenddate"));
			leave.setLeaveReason(rs.getString("leavereason"));
			leave.setLeaveAppliedon(rs.getDate("leaveappliedon"));
			leave.setLeaveType(rs.getString("leaveType"));
			leave.setLeaveStatus(rs.getString("leaveStatus"));
			leaveList.add(leave);
		}
		return leaveList;
}
}
