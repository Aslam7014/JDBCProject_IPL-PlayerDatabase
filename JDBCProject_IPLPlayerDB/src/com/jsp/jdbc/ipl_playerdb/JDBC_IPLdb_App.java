package com.jsp.jdbc.ipl_playerdb;

import java.util.Scanner;

public class JDBC_IPLdb_App {
	 public static void main( String[] args )
	    {
	        System.out.println("IPL Team  database");
	        System.out.println("1.Add Player\n2.Find Player By ID\n3.Find Player By Name\n4.Find player by Age\n5.Find Player ");
	        Scanner sc=new Scanner(System.in);
	        JDBC_IPLdb_Service ps=new JDBC_IPLdb_Service();
	        switch(sc.nextInt()) {
	        	case 1:ps.addPlayer();
	        		break;
	        	case 2:ps.findPlayerById();
	        		break;
	        	case 3:ps.findPlayerByName();
	        		break;
	        	case 4:ps.findPlayerByAge();
	        		break;
	        	case 5:ps.findPlayerByNationality();
	    			break;
	        	case 6:ps.findPlayerByIplTeam();
					break;
	        	default:
	        		System.out.println("Invalid input");
	        }
	    }
	}


