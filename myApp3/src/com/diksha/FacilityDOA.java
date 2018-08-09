package com.diksha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityDOA implements CommonDAO<FacilityIn> {
	
	private List<Customer> cardlist = new ArrayList<Customer>();
	private static final String SQL_SELECT_ID_CUSTOMER = "select * from Account where id = ?";
	private static final String INSERT_CUSTOMER = "INSERT INTO Payment(accno,paybal,Dateofpay,paytype,Provider) values(?,?,?,?,?)";
	private static final String SEL_CUST = "select * from Payment"; 

	@Override
	public void create(FacilityIn object) {
		try (Connection con = ConnectionUtil.getConnection()) {
			PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER);
			
			
			ps.setInt(1, object.getAccno());
			ps.setInt(2, object.getPaybal());
			ps.setString(3, object.getDateofpay());
			ps.setString(4, object.getPaytype());
			ps.setString(4, object.getProvider());
			
			ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	
	
	

}
