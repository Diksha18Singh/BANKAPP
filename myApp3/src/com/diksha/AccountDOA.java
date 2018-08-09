package com.diksha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDOA implements CommonDAO<Account> {
	
	private List<Customer> cardlist = new ArrayList<Customer>();
	private static final String SQL_SELECT_ID_CUSTOMER = "select * from Account where id = ?";
	private static final String INSERT_CUSTOMER = "INSERT INTO Account(pass,balance,acct,Customerid) values(?, ?, ?,?)";
	private static final String SEL_CUST = "select * from Account"; 
	private static final String GET_ID_QUERY="select id from Account where Customerid=?";
	
	
	
	@Override
	public void create(Account object) {
		try (Connection con = ConnectionUtil.getConnection()) {
			PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER);
			
			
			ps.setInt(1, object.getPass());
			ps.setFloat(2, object.getBalance());
			ps.setString(3, object.getAcct());
			ps.setInt(4, object.getCustomerid());
			ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static int getIdFromCustID(int id)
	{
		try(Connection con = ConnectionUtil.getConnection()){
			PreparedStatement ps = con.prepareStatement(GET_ID_QUERY);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				return rs.getInt("id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}	
		return -1;
	} 

	

}
