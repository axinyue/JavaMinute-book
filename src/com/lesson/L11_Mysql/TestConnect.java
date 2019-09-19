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
 * mysql数据库学习
 * java.sql.*  以及  com.mysql.jdbc.Driver的使用
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

			// 获取有几个字段
			int columnCount = metaData.getColumnCount();

			//获取别名，sql中的as 字段，返回结果的列名. 示例： "select id as t_id from student limit 1,3"
			String columnLabel = metaData.getColumnLabel(columnCount);
			print("getColumnLabel: "+columnLabel);
			
			//获取列名
			String culumname = metaData.getColumnName(columnCount);
			print("getColumnName: "+culumname);

			//获取列的数据类型
			String className = metaData.getColumnClassName(columnCount);
			print("getColumnClassName: "+className);
			
			//获取字段所在列的所有值
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
