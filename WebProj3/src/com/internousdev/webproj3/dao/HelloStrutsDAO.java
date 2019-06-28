package com.internousdev.webproj3.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.webproj3.dto.HelloStrutsDTO;
import com.internousdev.webproj3.util.DBConnector;
//
//Data Transfer Objectの定義は前述のとおりです。
//
//特徴は非常にシンプルで、基本的にはデータを格納するフィールド群とそれらへのアクセサメソッド(Getter/Setter)のみで構成されます。
//
//Data Transfer Object(DTO)は様々な場面で利用される可能性がありますが、Data Access Object(DAO)と組み合わせて使う場面に限ると、データストアに保存するデータをDTOに格納してDAOのメソッド引数で渡したり、データを検索するDAOのメソッドからの戻り値として利用されることが多いです。
//


public class HelloStrutsDAO {

	public HelloStrutsDTO select(){
		//DBConnectorメソッドをインスタンス化、
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();//インスタンス化した中の、getConnectionを呼び出す
		HelloStrutsDTO dto=new HelloStrutsDTO();//HelloStrutsDTOをインスタンス化

		String sql="select * from users";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			if (rs.next()){//DBのリストにカーソルが当たっているイメージ
				dto.setResult("MySQLと接続できます。");//dtp.setResultを呼び出す
			}else{
				dto.setResult("MySQLと接続出来ません。");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return dto;
	}
}
