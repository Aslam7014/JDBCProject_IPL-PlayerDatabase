package com.jsp.jdbc.ipl_playerdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBC_IPLdb_Service {

	Scanner sc = new Scanner(System.in);

	void addPlayer() {
		Connection conn = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_ipl_playerdb?user=root&password=root");
			
		    PreparedStatement ps = conn.prepareStatement("INSERT INTO player values(?,?,?,?,?,?)");
		    
		    System.out.println("Enter your player Id  :");
		    ps.setInt(1, sc.nextInt());
		    System.out.println("Enter your player Name :");
		    ps.setString(2, sc.next());
		    System.out.println("Enter your player Age :");
		    ps.setInt(3, sc.nextInt());
		    System.out.println("Enter your player Team : ");
		    ps.setString(4, sc.next());
		    System.out.println("Enter your player Country  :");
		    ps.setString(5, sc.next());
		    System.out.println("Enter your player Salary :");
		    ps.setInt(6, sc.nextInt());
		   
		   
		    
		    int player = ps.executeUpdate();
		    if(player > 0) {
		    	System.out.println(player +" Player Added");
		    }else {
		    	System.out.println("something went wrong");
		    }
			
		    conn.close();
		   
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
	}
		
		
		
			
		
	public void findPlayerByName() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_IPLdb_App?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name");
		
		String playerName=sc.next();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement("Select * from Player where Name=?");
			prepareStatement.setString(1, playerName);
			
			ResultSet rs=prepareStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
		}
		sc.close();
	}


	public void findPlayerByAge() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_IPLdb_App?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name");
		
		String playerAge=sc.next();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement("Select * from Player where Age=?");
			prepareStatement.setString(1, playerAge);
			
			ResultSet rs=prepareStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
		}
		sc.close();
	}





	public void findPlayerById() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_IPLdb_App?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name");
		
		String playerId=sc.next();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement("Select * from Player where Id=?");
			prepareStatement.setString(1, playerId);
			
			ResultSet rs=prepareStatement.executeQuery();
			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
//			}
			
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
		}
		sc.close();
	}





	public void findPlayerByNationality() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_IPLdb_App?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name");
		
		String Nationality=sc.next();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement("Select * from Player where Nationality=?");
			prepareStatement.setString(1, Nationality);
			
			ResultSet rs=prepareStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
		}
		sc.close();
	}





	public void findPlayerByIplTeam() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_IPLdb_App?user=root&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name");
		
		String playerId=sc.next();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement("Select * from Player where IPlteam=?");
			prepareStatement.setString(1, playerId);
			
			ResultSet rs=prepareStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
			rs.close();
			prepareStatement.close();
		} catch (SQLException e) {
		}
		sc.close();
	}
		
		
	}

	
		
		
	

		
	

		
	
		
	
	

	
	
	

