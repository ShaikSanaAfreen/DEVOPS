package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.model.LoginPojo;

public class LoginDao {
//public static void main(String[] args) throws ClassNotFoundException{

// public static void main(String[] args) throws ClassNotFoundException{
	public LoginPojo validateLogin(LoginPojo loginpojo) {
		LoginPojo result;

		try {
//Scanner s=new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
			PreparedStatement ps = c.prepareStatement("select * from student.usertable1");
//ps.setString(1,user);
//ps.setString(2,pass);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
//System.out.println(rs.getString(1)+"  "+rs.getString(2));
				if (loginpojo.getUsername().equals(rs.getString(1)) && loginpojo.getPassword().equals(rs.getString(2))) {
					loginpojo.setRole(rs.getString(3));
					break;
				}
			}

			c.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return loginpojo;
	}
}
