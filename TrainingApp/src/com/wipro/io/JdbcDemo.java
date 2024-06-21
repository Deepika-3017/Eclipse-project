package com.wipro.io;
import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		//step1  create driver
		
				Class.forName("oracle.jdbc.OracleDriver");
				
				//step2 
				//url,id,pwd
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:9501/XE","system","rps@123");
				
				System.out.println("connection is success");
				
				Statement st=con.createStatement();
				
				// cretae,altre,drop,insert,indelete,update
//				st.executeUpdate("create table product(id number primary key,name varchar(10),price number)");
				
				String sql="DROP TABLE product";
				st.executeUpdate(sql);
				System.out.println("table deleted");
				
				st.executeUpdate("insert into product values(1,'bag',999)");
				st.executeUpdate("insert into product values(2,'book',1000)");
				//st.executeUpdate("insert into product1 values(6,'table',2999)");
				
//				st.executeUpdate("update product1 set price =2000 where id=4");
//				st.executeUpdate("delete from product1 where id=5");
//				
				
				System.out.println("table created, inserted");
				
				ResultSet rs=st.executeQuery("select * from product");
				while(rs.next()) {
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"   "+rs.getString(3));
				}
				

	}

}
