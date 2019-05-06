package lxy_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_test {

	private static String url = "jdbc:mysql://localhost:3306/jdbc?characterEncoding=utf-8&serverTimezone=UTC&useSSL=false";
	private static String name = "root";
	private static String pwd = "root";

	public static void jdbc() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// 加载驱动程序,(8.0版本换了)
		Connection connection = DriverManager.getConnection(url, name, pwd);// 连接数据库，创建sql语句
		Statement statement = connection.createStatement();// 创建SQL语句对象
		String sql = "CREATE TABLE lxy(id int)";
		statement.executeUpdate(sql);
//		Statement statement = connection.createStatement();
//		            //要执行的SQL语句
//		         String sql = "select * from emp";
//		         //3.ResultSet类，用来存放获取的结果集！！
//		        ResultSet rs = statement.executeQuery(sql);
		if (connection != null) {

			connection.close();
		} else {
			System.out.println("0");
		}

	}

	public static void main(String[] args) {
		try {
			jdbc();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
