package com.internousdev.webproj2.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj2.util.DBConnector;

public class HelloStrutsDAO {

		public boolean select(){
			boolean ret=false;
			DBConnector db=new DBConnector();
			Connection con=db.getConnection();
			String sql="select * from users";
			try{
				//SQL文を生成
				PreparedStatement ps=con.prepareStatement(sql);
				//SQL文を実行
				ResultSet rs=ps.executeQuery();
				//nextで値をroop取得
				if(rs.next()){
					ret=true;
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
			try{
				con.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
			return ret;
		}
}
