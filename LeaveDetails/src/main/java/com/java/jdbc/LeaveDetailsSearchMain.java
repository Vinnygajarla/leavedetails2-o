package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class LeaveDetailsSearchMain {
	public static void main(String[] args) {
		int leaveId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leave Id   ");
		leaveId = sc.nextInt();
		LeaveDetailsDAO dao = new LeaveDetailsDAO();
		try {
			LeaveDetails leave = dao.searchLeave(leaveId);
			if (leave!=null) {
				System.out.println(leave);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
