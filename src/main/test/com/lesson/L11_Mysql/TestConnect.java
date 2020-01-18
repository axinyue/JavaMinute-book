package com.lesson.L11_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * mysql
 * java.sql.*  
 * 
 * 
 * @author ax
 *
 */

public class TestConnect extends TestCase {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://192.168.0.122:3306/test_platform";
	static final String USER = "root";
	static final String PASS = "root";

	public TestConnect(String name) {
		super(name);
	}

	public void testDB() {

		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			print("connect...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String sql = "show tables";
			
			//sql = "select id as t_id from student limit 1,3";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData metaData = rs.getMetaData();

			// 鑾峰彇鏈夊嚑涓瓧娈�
			int columnCount = metaData.getColumnCount();

			//鑾峰彇鍒悕锛宻ql涓殑as 瀛楁锛岃繑鍥炵粨鏋滅殑鍒楀悕. 绀轰緥锛� "select id as t_id from student limit 1,3"
			String columnLabel = metaData.getColumnLabel(columnCount);
			print("getColumnLabel: "+columnLabel);
			
			//鑾峰彇鍒楀悕
			String culumname = metaData.getColumnName(columnCount);
			print("getColumnName: "+culumname);

			//鑾峰彇鍒楃殑鏁版嵁绫诲瀷
			String className = metaData.getColumnClassName(columnCount);
			print("getColumnClassName: "+className);
			
			//鑾峰彇瀛楁鎵�鍦ㄥ垪鐨勬墍鏈夊��
			while (rs.next()) {
				print(rs.getString(columnLabel));
			}
			
			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void print(Object msg) {
		System.out.println(msg);
	}

}
