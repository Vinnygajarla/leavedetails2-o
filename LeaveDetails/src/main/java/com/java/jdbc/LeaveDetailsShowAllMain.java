package com.java.jdbc;


import java.sql.SQLException;
import java.util.List;

public class LeaveDetailsShowAllMain {

	public static void main(String[] args) {
		LeaveDetailsDAO dao = new LeaveDetailsDAO();
		try {
			List<LeaveDetails> leaveList = dao.showLeave();
			for (LeaveDetails leaveDetails : leaveList) {
				System.out.println(leaveDetails);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
