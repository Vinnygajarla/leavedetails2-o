package com.java.jdbc;


import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class LeaveDetailsInsertMain {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		LeaveDetails leave = new LeaveDetails();
		System.out.println("Enter Leave Id  ");
		leave.setLeaveId(sc.nextInt());
		System.out.println("Enter Employ Id  ");
		leave.setEmpId(sc.nextInt());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("Enter Leave Start-Date (dd-MM-YYYY)  ");
		String sdate = sc.next();
		leave.setLeaveStartDate(new java.sql.Date(sdf.parse(sdate).getTime()));
		System.out.println("Enter Leave End-Date (dd-MM-YYYY)   ");
		String endDate =  sc.next();
		leave.setLeaveEndDate(new java.sql.Date(sdf.parse(endDate).getTime()));
		System.out.println("Enter Leave Appliedon (dd-MM-YYYY)   ");
		String appliedOn =  sc.next();
		leave.setLeaveAppliedon(new java.sql.Date(sdf.parse(appliedOn).getTime()));
		System.out.println("Enter LeaveReason  ");
		leave.setLeaveReason(sc.next());
		System.out.println("Enter LeaveType");
		leave.setLeaveType(sc.next());
		System.out.println("Enter LeaveStatus");
		leave.setLeaveStatus(sc.next());
		LeaveDetailsDAO dao = new LeaveDetailsDAO();
		try {
			System.out.println(dao.addLeave(leave));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	
