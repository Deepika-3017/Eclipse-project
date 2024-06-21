//package com.wipro.io;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Jdbc {
//	private static final String url="dbc:oracle:thin:@localhost:9501/XE";
//	private static final String uname="system";
//	
//	
//	try {
//		Class.forName("oracle.jdbc.OracleDriver");
//	}catch(SQLException e){
//		e.printStackTrace();
//	}
//	Connection con=DriverManager.getConnection("url","uname","password");
//	Statement st=con.createStatement();
//		
//	//st.executeUpdate("create table product2(id number primary key,name varchar(10),price number)");
//		
//	/*
//	st.executeUpdate("insert into product2 values(1,'Bag',500)");
//	st.executeUpdate("insert into product2 values(2,'Charger',100)");
//	st.executeUpdate("insert into product2 values(3,'Book',200)");
//	st.executeUpdate("insert into product2 values(4,'Dress',500)");
//	st.executeUpdate("insert into product2 values(5,'Bottle',50)");
//	*/
//		
//	// insert new product
//		
//	String sql="DROP TABLE PRODUCT2";
//	st.executeUpdate(sql);
//	System.out.println("table deleted");
//
//	}
//
//}
