package com.internousdev.webproj4.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dto.HelloStrutsDTO;
import com.internousdev.webproj4.util.DBConnector;


public class HelloStrutsDAO {

		List<HelloStrutsDTO> helloStrutsDTOList=new ArrayList<HelloStrutsDTO>();
		public List<HelloStrutsDTO> select(){
			DBConnector db=new DBConnector();		//DBConnectorを読込
			Connection con=db.getConnection();      //読み込んだDBCのgetConnectionを読込

			String sql="select * from users";
			try{
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();

				while(rs.next()) {
					HelloStrutsDTO dto=new HelloStrutsDTO();
		//dtoのset***を使う（rsのgetIntで（”＊＊＊”））　ゲッターで読み込んだ値をセッターで入力。それをリストが無くなるまでループ。
					dto.setUserId(rs.getInt("user_id"));
					dto.setUserName(rs.getString("user_name"));
					dto.setPassword(rs.getString("password"));
					dto.setResult("MySQLと接続できます。");
					helloStrutsDTOList.add(dto);
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
			try{
				con.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
			return helloStrutsDTOList;
		}
}
